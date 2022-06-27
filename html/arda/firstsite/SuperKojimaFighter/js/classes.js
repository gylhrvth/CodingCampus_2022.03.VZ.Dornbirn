
class Sprite {
    constructor({ position,
        imagesrc,
        scale = 1,
        framesMax = 1,
        offset = { x: 0, y: 0 }
    }) {

        this.position = position
        this.width = 50
        this.height = 150
        this.image = new Image()
        this.image.src = imagesrc
        this.scale = scale
        this.framesMax = framesMax
        this.framesCurrent = 0
        this.framesElapsed = 0
        this.framesHold = 20
        this.offset = offset
    }

    animateframes() {
        this.framesElapsed++
        if (this.framesElapsed % this.framesHold === 0) {
            if (this.framesCurrent < this.framesMax - 1) {
                this.framesCurrent++
            } else {
                this.framesCurrent = 0
            }
        }
    }

    draw() {
        c.drawImage(
            this.image,
            this.framesCurrent * (this.image.width / this.framesMax),
            0,
            this.image.width / this.framesMax,
            this.image.height,
            this.position.x - this.offset.x,
            this.position.y - this.offset.y,
            (this.image.width / this.framesMax) * this.scale,
            this.image.height * this.scale,
        )
    }

    update() {
        this.draw()
        this.animateframes()
    }
}

class Fighter extends Sprite {
    constructor({
        position,
        velocity,
        color = "purple",
        imagesrc,
        scale = 1,
        framesMax = 1,
        offset = { x: 0, y: 0 },
        sprites,
        attackbox = { offset: {}, width: undefined, height: undefined },
        name,
    }) {
        super({
            position,
            imagesrc,
            scale,
            framesMax,
            offset,
        })
        this.velocity = velocity
        this.width = 70
        this.height = 222
        this.lastkey
        this.attackbox = {
            position: {
                x: this.position.x,
                y: this.position.y
            },
            offset: attackbox.offset,
            width: attackbox.width,
            height: attackbox.height,
        }
        this.color = color
        this.isAttacking
        this.iskicking
        this.health = 100
        this.framesCurrent = 0
        this.framesElapsed = 0
        this.framesHold = 7
        this.sprites = sprites
        this.dead = false
        this.won = false
        this.ismirrored = false
        this.name = name
        this.isBlocking = false

        for (const sprite in this.sprites) {
            sprites[sprite].image = new Image()
            sprites[sprite].image.src = sprites[sprite].imagesrc
            sprites[sprite].image.framesMax = this.framesMax
        }
    }



    update() {
        this.draw()
        if (!this.dead) { this.animateframes() }

        this.attackbox.position.x = this.position.x - this.attackbox.offset.x
        this.attackbox.position.y = this.position.y + this.attackbox.offset.y

        c.shadowColor = "black"
        c.shadowBlur = 2

        this.position.x += this.velocity.x
        this.position.y += this.velocity.y

        if (this.position.y + this.height + this.velocity.y >= canvas.height - 55) {
            this.velocity.y = 0
            this.position.y = 330
        } else {
            this.velocity.y += gravity
        }
    }

    attack() {
        if (Math.floor(Math.random() * 2) === 1) {
            this.switchsprite("punch2")
        } else {
            this.switchsprite("punch")
        }
        this.isAttacking = true
        setTimeout(() => {
            this.isAttacking = false
        }, 100);
    }
    attackmirrored() {
        if (Math.floor(Math.random() * 2) === 1) {
            this.switchsprite("punch2mirrored")
        } else {
            this.switchsprite("punchmirrored")
        }
        this.isAttacking = true
        setTimeout(() => {
            this.isAttacking = false
        }, 100);
    }

    kick() {
        this.switchsprite("kick")
        this.iskicking = true
        setTimeout(() => {
            this.iskicking = false
        }, 100);
    }

    kickmirrored() {
        this.switchsprite("kickmirrored")
        this.iskicking = true
        setTimeout(() => {
            this.iskicking = false
        }, 100);
    }

    powermove() {
        //hadouken
    }

    takehit() {
        if (!this.isBlocking) {
            punchsounditerator()
            this.health -= 5
            if (this.health <= 0) {
                this.switchsprite("death")
                sfx.deathsoundmale.play()
            } else {
                this.switchsprite("takehit")
            }
        } else {
            sfx.takehitblocking.play()
        }
    }

    takehitmirrored() {
        if (!this.isBlocking) {
            this.health -= 5
            if (this.health <= 0) {
                this.switchsprite("deathmirrored")
                sfx.deathsoundmale.play()
            } else {
                this.switchsprite("takehitmirrored")
            }
        } else {
            sfx.takehitblocking.play()
        }
    }

    switchsprite(sprite) {

        if (this.ismirrored === true) {
            //overriding all other animations after death but its mirrored >:o
            if (this.image === this.sprites.deathmirrored.image) {
                if (this.framesCurrent === this.sprites.deathmirrored.framesMax - 1)
                    this.dead = true
                return
            }
        }

        if (this.ismirrored === true) {
            //overriding all other mirrored animations with mirrored attack animations
            if (this.image === this.sprites.punchmirrored.image && this.framesCurrent < this.sprites.punchmirrored.framesMax - 1 ||
                this.image === this.sprites.punch2mirrored.image && this.framesCurrent < this.sprites.punch2mirrored.framesMax - 1 ||
                this.image === this.sprites.kickmirrored.image && this.framesCurrent < this.sprites.kickmirrored.framesMax - 1)
                return
        }

        if (this.ismirrored === true) {
            //override when fighter gets hit but its mirrored :O
            if (this.image === this.sprites.takehitmirrored.image && this.framesCurrent < this.sprites.takehitmirrored.framesMax - 1)
                return
        }


        //overriding all sprites after victory with victory sprite
        if (this.image === this.sprites.victorypose.image) {
            if (this.framesCurrent === this.sprites.victorypose.framesMax - 1)
                this.won = true
            return
        }

        //overriding all other animations after death
        if (this.image === this.sprites.death.image) {
            if (this.framesCurrent === this.sprites.death.framesMax - 1)
                this.dead = true
            return
        }

        //overriding all other animations with attack animations
        if (this.image === this.sprites.punch.image && this.framesCurrent < this.sprites.punch.framesMax - 1 ||
            this.image === this.sprites.punch2.image && this.framesCurrent < this.sprites.punch2.framesMax - 1 ||
            this.image === this.sprites.kick.image && this.framesCurrent < this.sprites.kick.framesMax - 1)
            return

        if (this.image === this.sprites.block.image && this.framesCurrent < this.sprites.block.framesMax - 1)
            return


        //override when fighter gets hit
        if (this.image === this.sprites.takehit.image && this.framesCurrent < this.sprites.takehit.framesMax - 1)
            return

        switch (sprite) {
            case "idle":
                if (this.image !== this.sprites.idle.image) {
                    this.image = this.sprites.idle.image
                    this.framesMax = this.sprites.idle.framesMax
                    this.framesCurrent = 0
                }
                break;

            case "walkfwd":
                if (this.image !== this.sprites.walk.image) {
                    this.image = this.sprites.walk.image
                    this.framesMax = this.sprites.walk.framesMax
                    this.framesCurrent = 0
                }
                break;

            case "walkbwd":
                if (this.image !== this.sprites.walkback.image) {
                    this.image = this.sprites.walkback.image
                    this.framesMax = this.sprites.walkback.framesMax
                    this.framesCurrent = 0
                }
                break;

            case "jump":
                if (this.image !== this.sprites.jump.image) {
                    this.image = this.sprites.jump.image
                    this.framesMax = this.sprites.jump.framesMax
                    this.framesCurrent = 0
                }
                break;

            case "fall":
                if (this.image !== this.sprites.fall.image) {
                    this.image = this.sprites.fall.image
                    this.framesMax = this.sprites.fall.framesMax
                    this.framesCurrent = 0
                }
                break;

            case "punch":
                if (this.image !== this.sprites.punch.image) {
                    this.image = this.sprites.punch.image
                    this.framesMax = this.sprites.punch.framesMax
                    this.framesCurrent = 0
                }
                break;

            case "punch2":
                if (this.image !== this.sprites.punch2.image) {
                    this.image = this.sprites.punch2.image
                    this.framesMax = this.sprites.punch2.framesMax
                    this.framesCurrent = 0
                }
                break;

            case "kick":
                if (this.image !== this.sprites.kick.image) {
                    this.image = this.sprites.kick.image
                    this.framesMax = this.sprites.kick.framesMax
                    this.framesCurrent = 0
                }
                break
            case "block":
                if (this.image !== this.sprites.block.image) {
                    this.image = this.sprites.block.image
                    this.framesMax = this.sprites.block.framesMax
                    this.framesCurrent = 0
                }
                break

            case "takehit":
                if (this.image !== this.sprites.takehit.image) {
                    this.image = this.sprites.takehit.image
                    this.framesMax = this.sprites.takehit.framesMax
                    this.framesCurrent = 0
                }
                break;

            case "death":
                if (this.image !== this.sprites.death.image) {
                    this.image = this.sprites.death.image
                    this.framesMax = this.sprites.death.framesMax
                    this.framesCurrent = 0
                    this.framesHold = 7
                }
                break;
            case "victorypose":
                if (this.image !== this.sprites.victorypose.image) {
                    this.image = this.sprites.victorypose.image
                    this.framesMax = this.sprites.victorypose.framesMax
                    this.framesHold = 17
                }
                break;

            //mirrored sprite cases -----------------------------------

            case "idlemirrored":
                if (this.image !== this.sprites.idlemirrored.image) {
                    this.image = this.sprites.idlemirrored.image
                    this.framesMax = this.sprites.idlemirrored.framesMax
                    this.framesCurrent = 0
                }
                break;

            case "walkfwdmirrored":
                if (this.image !== this.sprites.walkmirrored.image) {
                    this.image = this.sprites.walkmirrored.image
                    this.framesMax = this.sprites.walkmirrored.framesMax
                    this.framesCurrent = 0
                }
                break;

            case "walkbwdmirrored":
                if (this.image !== this.sprites.walkbackmirrored.image) {
                    this.image = this.sprites.walkbackmirrored.image
                    this.framesMax = this.sprites.walkbackmirrored.framesMax
                    this.framesCurrent = 0
                }
                break;

            case "jumpmirrored":
                if (this.image !== this.sprites.jumpmirrored.image) {
                    this.image = this.sprites.jumpmirrored.image
                    this.framesMax = this.sprites.jumpmirrored.framesMax
                    this.framesCurrent = 0
                }
                break;

            case "fallmirrored":
                if (this.image !== this.sprites.fallmirrored.image) {
                    this.image = this.sprites.fallmirrored.image
                    this.framesMax = this.sprites.fallmirrored.framesMax
                    this.framesCurrent = 0
                }
                break;
            case "punchmirrored":
                if (this.image !== this.sprites.punchmirrored.image) {
                    this.image = this.sprites.punchmirrored.image
                    this.framesMax = this.sprites.punchmirrored.framesMax
                    this.framesCurrent = 0
                }
                break;
            case "punch2mirrored":
                if (this.image !== this.sprites.punch2mirrored.image) {
                    this.image = this.sprites.punch2mirrored.image
                    this.framesMax = this.sprites.punch2mirrored.framesMax
                    this.framesCurrent = 0
                }
                break;
            case "kickmirrored":
                if (this.image !== this.sprites.kickmirrored.image) {
                    this.image = this.sprites.kickmirrored.image
                    this.framesMax = this.sprites.kickmirrored.framesMax
                    this.framesCurrent = 0
                }
                break;
            case "blockmirrored":
                if (this.image !== this.sprites.blockmirrored.image) {
                    this.image = this.sprites.blockmirrored.image
                    this.framesMax = this.sprites.blockmirrored.framesMax
                    this.framesCurrent = 0
                }
                break
            case "takehitmirrored":
                if (this.image !== this.sprites.takehitmirrored.image) {
                    this.image = this.sprites.takehitmirrored.image
                    this.framesMax = this.sprites.takehitmirrored.framesMax
                    this.framesCurrent = 0
                }
                break;
            case "deathmirrored":
                if (this.image !== this.sprites.deathmirrored.image) {
                    this.image = this.sprites.deathmirrored.image
                    this.framesMax = this.sprites.deathmirrored.framesMax
                    this.framesCurrent = 0
                    this.framesHold = 10
                }
                break;
        }
    }
}