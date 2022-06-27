menutheme.pause()
//this is the playfield
const canvas = document.querySelector("canvas")
const c = canvas.getContext("2d")

canvas.width = 1090
canvas.height = 576
canvas.style.borderStyle = "solid"
canvas.style.borderWidth = "4px"
canvas.style.zIndex = "-1"

//Todo: add world barriers left right top and make canvas scaleable

const gravity = 0.7

const backround = new Sprite({
    position: {
        x: -5,
        y: 0
    },
    imagesrc: "./resources/gym.png",
    framesMax: 8,
})

//soundeffects
var sfx = {
    youwin: new Audio("./resources/sounds/announcer/You win.mp3"),
    youlose: new Audio("./resources/sounds/announcer/SFII_15 - You lose.wav"),
    fight: new Audio("./resources/sounds/announcer/SFII_17 - Fight!.wav"),
    punchattacksound: new Audio("./resources/sounds/movehits/SFII_38 - Light Attack.wav"),
    punchattacksound2: new Audio("./resources/sounds/movehits/SFII_39 - Medium Attack.wav"),
    kickattacksound: new Audio("./resources/sounds/movehits/SFII_40 - Hard Attack1.wav"),
    kickhitsound: new Audio("./resources/sounds/movehits/SFII_44 - Fierce Hit.wav"),
    punchsound: new Audio("./resources/sounds/movehits/SFII_42 - Jab Hit.wav"),
    punchsound2: new Audio("./resources/sounds/movehits/SFII_43 - Strong Hit.wav"),
    punchsound3: new Audio("./resources/sounds/movehits/SFII_45 - Short Hit.wav"),
    takehitblocking: new Audio("./resources/sounds/movehits/SFII_51 - Blocked.wav"),
    backroundmusic: new Audio("./resources/sounds/stagemusic/ehondastage.wav"),
    victorytheme: new Audio("./resources/sounds/stagemusic/victorytheme.wav"),
    deathsoundmale: new Audio("./resources/sounds/voices/SFII_67 - KO Male.wav"),
    fightingmusic: new Audio("./resources/sounds/stagemusic/fightingmusic.mp3"),
    tiemusic: new Audio("./resources/sounds/stagemusic/tiemusic.mp3"),

    one: new Audio("./resources/sounds/announcer/SFII_19 - One.wav"),
    two: new Audio("./resources/sounds/announcer/SFII_20 - Two.wav"),
    three: new Audio("./resources/sounds/announcer/SFII_22 - Three.wav"),
    fight: new Audio("./resources/sounds/announcer/SFII_17 - Fight!.wav"),
}

var gamehasbegun = false

function countdown() {
    sfx.fightingmusic.volume = 0.3
    setTimeout(() => {
        sfx.three.play()
        document.getElementById("displaytext").innerHTML = "THREE"
    }, 1000)

    setTimeout(() => {
        sfx.two.play()
        document.getElementById("displaytext").innerHTML = "TWO"
    }, 2000)

    setTimeout(() => {
        sfx.one.play()
        document.getElementById("displaytext").innerHTML = "ONE"
    }, 3000)

    setTimeout(() => {
        sfx.fight.play()
        sfx.fightingmusic.play()
        document.getElementById("displaytext").innerHTML = "FIGHT"
    }, 4000)

    setTimeout(() => {
        document.getElementById("displaytext").innerHTML = ""
        sfx.victorytheme.volume = 0.4
        sfx.youwin.volume = 1
        sfx.deathsoundmale.volume = 1
        gamehasbegun = true
        decreasetimer()
    }, 5000)
}

countdown()

function punchsounditerator() {
    if (Math.floor(Math.random() * 3) === 1) {
        sfx.punchsound.play()
    } else if (Math.floor(Math.random() * 3) === 2) {
        sfx.punchsound2.play()
    } else {
        sfx.punchsound3.play()
    }
}

function attacksounditerator() {
    if (Math.floor(Math.random() * 2) === 1) {
        sfx.punchattacksound.play()
    } else {
        sfx.punchattacksound2.play()
    }
}

function victorymusic() {
    if (sfx.victorytheme.currentTime < sfx.victorytheme.duration) {
        sfx.victorytheme.play()
    }
    setTimeout(() => {
        if (sfx.youwin.currentTime < sfx.youwin.duration) {
            sfx.youwin.play()
        }
    }, 4010)

}


//attributes of player sprite
const player = new Fighter({
    name: "Ken",
    position: {
        x: 45,
        y: 100
    },
    velocity: {
        x: 0,
        y: 0
    },
    offset: {
        x: 0,
        y: 0
    },
    attackbox: {
        offset: {
            x: 100,
            y: 10,
        },
        width: 299,
        height: 50
    },
    imagesrc: "./resources/spritesplayer1/Kenidle.png",
    framesMax: 0,
    scale: 2.3,
    sprites: {
        idle: {
            imagesrc: "./resources/spritesplayer1/Kenidle.png",
            framesMax: 5.9,
        },
        walk: {
            imagesrc: "./resources/spritesplayer1/Kenwalking.png",
            framesMax: 5.9,
        },
        walkback: {
            imagesrc: "./resources/spritesplayer1/Kenwalkbackward.png",
            framesMax: 5.9
        },
        jump: {
            imagesrc: "./resources/spritesplayer1/Kenjump.png",
            framesMax: 5.9,
        },
        fall: {
            imagesrc: "./resources/spritesplayer1/Kenfall.png",
            framesMax: 1
        },
        punch: {
            imagesrc: "./resources/spritesplayer1/Kenpunch.png",
            framesMax: 3.0
        },
        punch2: {
            imagesrc: "./resources/spritesplayer1/Kenpunch2.png",
            framesMax: 3
        },
        kick: {
            imagesrc: "./resources/spritesplayer1/Kenkick.png",
            framesMax: 5,
        },
        block: {
            imagesrc: "./resources/spritesplayer1/Kenblock.png",
            framesMax: 1,
        },
        takehit: {
            imagesrc: "./resources/spritesplayer1/Kenhit.png",
            framesMax: 2.9,
        },
        death: {
            imagesrc: "./resources/spritesplayer1/Kendeath.png",
            framesMax: 9,
        },
        victorypose: {
            imagesrc: "./resources/spritesplayer1/Kenwin.png",
            framesMax: 5,
        },

        //mirrored sprites --------------------------------------------------

        idlemirrored: {
            imagesrc: "./resources/spritesplayer1/mirrored/Kenidle.png",
            framesMax: 6.0,
        },
        walkmirrored: {
            imagesrc: "./resources/spritesplayer1/mirrored/Kenwalkbackward.png",
            framesMax: 6.0,
        },
        walkbackmirrored: {
            imagesrc: "./resources/spritesplayer1/mirrored/Kenwalking.png",
            framesMax: 6.0,
        },
        jumpmirrored: {
            imagesrc: "./resources/spritesplayer1/mirrored/Kenjump.png",
            framesMax: 1,
        },
        fallmirrored: {
            imagesrc: "./resources/spritesplayer1/mirrored/Kenfall.png",
            framesMax: 1
        },
        punchmirrored: {
            imagesrc: "./resources/spritesplayer1/mirrored/Kenpunch.png",
            framesMax: 3.0
        },
        punch2mirrored: {
            imagesrc: "./resources/spritesplayer1/mirrored/Kenpunch2.png",
            framesMax: 3
        },
        kickmirrored: {
            imagesrc: "./resources/spritesplayer1/mirrored/Kenkick.png",
            framesMax: 5,
        },
        blockmirrored: {
            imagesrc: "./resources/spritesplayer1/mirrored/Kenblock.png",
            framesMax: 1,
        },
        takehitmirrored: {
            imagesrc: "./resources/spritesplayer1/mirrored/Kenhit.png",
            framesMax: 2.9,
        },
        deathmirrored: {
            imagesrc: "./resources/spritesplayer1/mirrored/Kendeath.png",
            framesMax: 9,
        },
        victorypose: {
            imagesrc: "./resources/spritesplayer1/Kenwin.png",
            framesMax: 5,
        },
    }
})

document.getElementById("displaynamep1").innerHTML = player.name

//attributes of enemy sprite
const enemy = new Fighter({
    name: "Ryu",
    position: {
        x: 870,
        y: 100
    },
    velocity: {
        x: 10,
        y: 0
    },
    attackbox: {
        offset: {
            x: 100,
            y: 20,
        },
        width: 299,
        height: 50
    },
    imagesrc: "./resources/spritesplayer1/Kenidle.png",
    framesMax: 0,
    scale: 2.3,
    sprites: {
        idle: {
            imagesrc: "./resources/spritesplayer2/Ryuidle.png",
            framesMax: 6,
        },
        walk: {
            imagesrc: "./resources/spritesplayer2/Ryuwalkfwd.png",
            framesMax: 5.9
        },
        walkback: {
            imagesrc: "./resources/spritesplayer2/ryuwalkbwd.png",
            framesMax: 5.9
        },
        jump: {
            imagesrc: "./resources/spritesplayer2/Ryujump.png",
            framesMax: 2,
        },
        fall: {
            imagesrc: "./resources/spritesplayer2/Ryufall.png",
            framesMax: 1
        },
        punch: {
            imagesrc: "./resources/spritesplayer2/Ryupunch.png",
            framesMax: 3.0
        },
        punch2: {
            imagesrc: "./resources/spritesplayer2/Ryupunch2.png",
            framesMax: 3
        },
        kick: {
            imagesrc: "./resources/spritesplayer2/Ryukick.png",
            framesMax: 5
        },
        block: {
            imagesrc: "./resources/spritesplayer2/Ryublock.png",
            framesMax: 1,
        },
        takehit: {
            imagesrc: "./resources/spritesplayer2/Ryuhit.png",
            framesMax: 3,
        },
        death: {
            imagesrc: "./resources/spritesplayer2/Ryudeath.png",
            framesMax: 5
        },
        victorypose: {
            imagesrc: "./resources/spritesplayer2/Ryuwin.png",
            framesMax: 5.75
        },

        //mirrored sprites

        idlemirrored: {
            imagesrc: "./resources/spritesplayer2/mirrored/Ryuidle.png",
            framesMax: 6,
        },
        walkmirrored: {
            imagesrc: "./resources/spritesplayer2/mirrored/Ryuwalkfwd.png",
            framesMax: 5.9
        },
        walkbackmirrored: {
            imagesrc: "./resources/spritesplayer2/mirrored/ryuwalkbwd.png",
            framesMax: 6
        },
        jumpmirrored: {
            imagesrc: "./resources/spritesplayer2/mirrored/Ryujump.png",
            framesMax: 1,
        },
        fallmirrored: {
            imagesrc: "./resources/spritesplayer2/mirrored/Ryufall.png",
            framesMax: 1
        },
        punchmirrored: {
            imagesrc: "./resources/spritesplayer2/mirrored/Ryupunch.png",
            framesMax: 3
        },
        punch2mirrored: {
            imagesrc: "./resources/spritesplayer2/mirrored/Ryupunch2.png",
            framesMax: 3
        },
        kickmirrored: {
            imagesrc: "./resources/spritesplayer2/mirrored/Ryukick.png",
            framesMax: 5
        },
        block: {
            imagesrc: "./resources/spritesplayer2/mirrored/Ryublock.png",
            framesMax: 1,
        },
        takehitmirrored: {
            imagesrc: "./resources/spritesplayer2/mirrored/Ryuhit.png",
            framesMax: 3,
        },
        deathmirrored: {
            imagesrc: "./resources/spritesplayer2/mirrored/Ryudeath.png",
            framesMax: 5
        },
        victoryposemirrored: {
            imagesrc: "./resources/spritesplayer2/Ryuwin.png",
            framesMax: 5.75
        },
    }

})

document.getElementById("displaynamep2").innerHTML = enemy.name

//checks if keys have been pressed or not
const keys = {
    a: {
        pressed: false
    },
    d: {
        pressed: false
    },
    w: {
        pressed: false
    },
    s: {
        pressed: false
    },
    f: {
        pressed: false
    },
    g: {
        pressed: false
    },
    h: {
        pressed: false
    },
    ArrowLeft: {
        pressed: false
    },
    ArrowRight: {
        pressed: false
    },
    ArrowUp: {
        pressed: false
    },
    ArrowDown: {
        pressed: false
    },
    i: {
        pressed: false
    },
    o: {
        pressed: false
    },
    p: {
        pressed: false
    },
}



//determines who won
var playerhaswon = false
var enemyhaswon = false

function determinewinner({ player, enemy, timerid }) {
    clearTimeout(timerid)
    document.querySelector("#displaytext").style.display = "flex"
    if (player.health === enemy.health) {
        document.querySelector("#displaytext").innerHTML = "It's a tie"
        sfx.fightingmusic.pause()
        sfx.tiemusic.volume = 0.5
        sfx.tiemusic.play()
        sfx.tiemusic.loop = true
        playerhaswon = true
        enemyhaswon = true
    } else if (player.health > enemy.health) {
        sfx.fightingmusic.pause()
        victorymusic()
        document.querySelector("#displaytext").innerHTML = player.name + " wins"
        playerhaswon = true
    } else if (enemy.health > player.health) {
        sfx.fightingmusic.pause()
        victorymusic()
        document.querySelector("#displaytext").innerHTML = enemy.name + " wins"
        enemyhaswon = true
    }
}

//collision detection of hitboxes
function rectangularcollision({ rectangle1, rectangle2 }) {
    return (
        rectangle1.attackbox.position.x + rectangle1.attackbox.width >= rectangle2.position.x &&
        rectangle1.attackbox.position.x <= rectangle2.position.x + rectangle2.width &&
        rectangle1.attackbox.position.y + rectangle1.attackbox.height >= rectangle2.position.y &&
        rectangle1.attackbox.position.y <= rectangle2.position.x + rectangle2.height
    )
}

//timer
let timer = 99
let timerid
function decreasetimer() {
    if (timer > 0) {
        timerid = setTimeout(decreasetimer, 1000)
        timer--
        document.querySelector("#timer").innerHTML = timer
    }

    if (timer === 0) {
        determinewinner({ player, enemy, timerid })
    }
}

//animate player and enemy
function animate() {
    window.requestAnimationFrame(animate)
    c.fillStyle = "black"
    c.fillRect(0, 0, canvas.width, canvas.height)

    backround.update()
    player.update()
    enemy.update()

    player.velocity.x = 0
    enemy.velocity.x = 0

    //checks if player is infront of enemy else
    if (player.position.x < enemy.position.x) {
        //player movement
        if (keys.a.pressed && lastkey === "a") {
            player.velocity.x = -5
            player.switchsprite("walkbwd")
        } else if (keys.d.pressed && lastkey === "d") {
            player.velocity.x = 5
            player.switchsprite("walkfwd")
            player.isBlocking = true
        } else if (!playerhaswon) {
            player.switchsprite("idle")
        } else {
            player.switchsprite("victorypose")
        }

        //checks if player is blocking or not
        if (keys.s.pressed && lastkey === "s") {
            player.switchsprite("block")
            player.isBlocking = true
        } else {
            player.isBlocking = false
        }

        //jump and fall condition
        if (player.velocity.y < 0) {
            player.switchsprite("jump")
        } else if (player.velocity.y > 0) {
            player.switchsprite("fall")
        }
    } else {
        //player movement mirrored
        player.ismirrored = true
        if (keys.a.pressed && lastkey === "a") {
            player.velocity.x = -5
            player.switchsprite("walkbwdmirrored")
        } else if (keys.d.pressed && lastkey === "d") {
            player.velocity.x = 5
            player.switchsprite("walkfwdmirrored")
        } else if (!playerhaswon) {
            player.switchsprite("idlemirrored")
        } else {
            player.switchsprite("victorypose")
        }

        if (keys.s.pressed && lastkey === "s") {
            player.switchsprite("blockmirrored")
            player.isBlocking = true
        } else {
            player.isBlocking = false
        }

        //jump and fall condition
        if (player.velocity.y < 0) {
            player.switchsprite("jumpmirrored")
        } else if (player.velocity.y > 0) {
            player.switchsprite("fallmirrored")
        }
    }


    if (enemy.position.x > player.position.x) {
        //enemy movement
        if (keys.ArrowLeft.pressed && enemy.lastkey === "ArrowLeft") {
            enemy.velocity.x = -6
            enemy.switchsprite("walkfwd")
        } else if (keys.ArrowRight.pressed && enemy.lastkey === "ArrowRight") {
            enemy.velocity.x = 6
            enemy.switchsprite("walkbwd")
        } else if (!enemyhaswon) {
            enemy.switchsprite("idle")
        } else {
            enemy.switchsprite("victorypose")
        }

        if (keys.ArrowDown.pressed && enemy.lastkey === "ArrowDown") {
            enemy.switchsprite("block")
            enemy.isBlocking = true
        } else {
            enemy.isBlocking = false
        }

        if (enemy.velocity.y < 0) {
            enemy.switchsprite("jump")
        } else if (enemy.velocity.y > 0) {
            enemy.switchsprite("fall")
        }
    } else {
        //enemy movement mirrored
        enemy.ismirrored = true
        if (keys.ArrowLeft.pressed && enemy.lastkey === "ArrowLeft") {
            enemy.velocity.x = -6
            enemy.switchsprite("walkfwdmirrored")
        } else if (keys.ArrowRight.pressed && enemy.lastkey === "ArrowRight") {
            enemy.velocity.x = 6
            enemy.switchsprite("walkbwdmirrored")
        } else if (!enemyhaswon) {
            enemy.switchsprite("idlemirrored")
        } else {
            enemy.switchsprite("victorypose")
        }


        if (keys.ArrowDown.pressed && enemy.lastkey === "ArrowDown") {
            enemy.switchsprite("blockmirrored")
            enemy.isBlocking = true
        } else {
            enemy.isBlocking = false
        }

        if (enemy.velocity.y < 0) {
            enemy.switchsprite("jumpmirrored")
        } else if (enemy.velocity.y > 0) {
            enemy.switchsprite("fallmirrored")
        }
    }


    //collision detection player
    if (player.position.x < enemy.position.x) {
        if (
            rectangularcollision({
                rectangle1: player,
                rectangle2: enemy
            }) &&
            player.isAttacking
        ) {
            punchsounditerator()
            enemy.takehit()
            player.isAttacking = false
            document.querySelector("#enemyhealth").style.width = enemy.health + "%"
            console.log("player 1 has attacked")
        } else if (rectangularcollision({
            rectangle1: player,
            rectangle2: enemy
        }) && player.iskicking
        ) {
            sfx.kickhitsound.play()
            enemy.takehit()
            player.iskicking = false
            document.querySelector("#enemyhealth").style.width = enemy.health + "%"
            console.log("player 1 has kicked")
        }
    } else {
        if (
            rectangularcollision({
                rectangle1: player,
                rectangle2: enemy
            }) &&
            player.isAttacking
        ) {
            enemy.takehitmirrored()
            player.isAttacking = false
            document.querySelector("#enemyhealth").style.width = enemy.health + "%"
            console.log("player 1 has attacked")
        } else if (rectangularcollision({
            rectangle1: player,
            rectangle2: enemy
        }) && player.iskicking
        ) {
            sfx.kickhitsound.play()
            enemy.takehitmirrored()
            player.iskicking = false
            document.querySelector("#enemyhealth").style.width = enemy.health + "%"
            console.log("player 1 has kicked")
        }
    }



    //collision detection enemy
    if (enemy.position.x > player.position.x) {
        if (
            rectangularcollision({
                rectangle1: enemy,
                rectangle2: player
            }) &&
            enemy.isAttacking
        ) {
            player.takehit()
            enemy.isAttacking = false
            document.querySelector("#playerhealth").style.width = player.health + "%"
            console.log("enemy has attacked")
        } else if (rectangularcollision({
            rectangle1: enemy,
            rectangle2: player
        }) && enemy.iskicking
        ) {
            sfx.kickhitsound.play()
            player.takehit()
            enemy.iskicking = false
            document.querySelector("#playerhealth").style.width = player.health + "%"
            console.log("enemy has kicked")
        }
    } else {
        if (
            rectangularcollision({
                rectangle1: enemy,
                rectangle2: player
            }) &&
            enemy.isAttacking
        ) {
            player.takehitmirrored()
            enemy.isAttacking = false
            document.querySelector("#playerhealth").style.width = player.health + "%"
            console.log("enemy has attacked")
        } else if (rectangularcollision({
            rectangle1: enemy,
            rectangle2: player
        }) && enemy.iskicking
        ) {
            sfx.kickhitsound.play()
            player.takehitmirrored()
            enemy.iskicking = false
            document.querySelector("#playerhealth").style.width = player.health + "%"
            console.log("enemy has kicked")
        }
    }


    //game end based on health
    if (enemy.health <= 0 || player.health <= 0) {
        determinewinner({ player, enemy, timerid })
    }
}

animate()

//player and enemy movement and actions
window.addEventListener("keydown", (event) => {

    if (gamehasbegun) {
        if (player.position.x < enemy.position.x && enemy.position.x > player.position.x) {
            if (!playerhaswon && !enemyhaswon) {
                switch (event.key) {
                    //player movement key right
                    case "d":
                        keys.d.pressed = true
                        lastkey = "d"
                        break

                    //player movement key left
                    case "a":
                        keys.a.pressed = true
                        lastkey = "a"
                        break

                    //the code below keeps player from being able to spam w and fly
                    //player jump key
                    case "w":
                        if (player.velocity.y === 0) {
                            player.velocity.y = -17
                        }
                        break

                    //player block key (will implement in the future)
                    case "s":
                        keys.s.pressed = true
                        lastkey = "s"
                        break

                    //player attack key 
                    case "f":
                        setTimeout(() => {
                            attacksounditerator()
                            player.attack()
                        }, 100)
                        break

                    case "g":
                        setTimeout(() => {
                            sfx.kickattacksound.play()
                            player.kick()
                        }, 230)
                        break

                    case "h":
                        //powermove (will implement in the future)
                        break

                    //enemy movement key right
                    case "ArrowRight":
                        keys.ArrowRight.pressed = true
                        enemy.lastkey = "ArrowRight"
                        break

                    //enemy movement key left
                    case "ArrowLeft":
                        keys.ArrowLeft.pressed = true
                        enemy.lastkey = "ArrowLeft"
                        break

                    //enemy jump key
                    case "ArrowUp":
                        if (enemy.velocity.y === 0) {
                            enemy.velocity.y = -17
                        }
                        break

                    //enemy block key
                    case "ArrowDown":
                        keys.ArrowDown.pressed = true
                        enemy.lastkey = "ArrowDown"
                        break

                    //enemy attack key 
                    case "i":
                        setTimeout(() => {
                            enemy.attack()
                            attacksounditerator()
                        }, 100)

                        break
                    case "o":
                        setTimeout(() => {
                            enemy.kick()
                            sfx.kickattacksound.play()
                        }, 230)

                        break
                    case "p":
                        //powermove function()
                        break
                }
            }
        } else {
            if (!playerhaswon && !enemyhaswon) {
                switch (event.key) {
                    //player movement key right
                    case "d":
                        keys.d.pressed = true
                        lastkey = "d"
                        break

                    //player movement key left
                    case "a":
                        keys.a.pressed = true
                        lastkey = "a"
                        break

                    //the code below keeps player from being able to spam w and fly
                    //player jump key
                    case "w":
                        if (player.velocity.y === 0) {
                            player.velocity.y = -17
                        }
                        break

                    //player block key (will implement in the future)
                    case "s":
                        keys.s.pressed = true
                        lastkey = "s"
                        break

                    //player attack key 
                    case "f":
                        setTimeout(() => {
                            attacksounditerator()
                            player.attackmirrored()
                        }, 100)
                        break

                    case "g":
                        setTimeout(() => {
                            sfx.kickattacksound.play()
                            player.kickmirrored()
                        }, 230)
                        break

                    case "h":
                        //powermove (will implement in the future)
                        break

                    //enemy movement key right
                    case "ArrowRight":
                        keys.ArrowRight.pressed = true
                        enemy.lastkey = "ArrowRight"
                        break

                    //enemy movement key left
                    case "ArrowLeft":
                        keys.ArrowLeft.pressed = true
                        enemy.lastkey = "ArrowLeft"
                        break

                    //enemy jump key
                    case "ArrowUp":
                        if (enemy.velocity.y === 0) {
                            enemy.velocity.y = -17
                        }
                        break

                    //enemy block key
                    case "ArrowDown":
                        keys.ArrowDown.pressed = true
                        enemy.lastkey = "ArrowDown"
                        break

                    //enemy attack key 
                    case "i":
                        setTimeout(() => {
                            enemy.attackmirrored()
                            attacksounditerator()
                        }, 100)
                        break
                    case "o":
                        setTimeout(() => {
                            enemy.kickmirrored()
                            sfx.kickattacksound.play()
                        }, 230)
                        break
                    case "p":
                        //powermove function()
                        break
                }
            }
        }
    }
})

//when the key is no longer pressed it becomes inactive
window.addEventListener("keyup", (event) => {
    switch (event.key) {
        case "d":
            keys.d.pressed = false
            break

        case "a":
            keys.a.pressed = false
            break

        case "w":
            keys.w.pressed = false
            break

        case "s":
            keys.s.pressed = false
            break

        case "ArrowRight":
            keys.ArrowRight.pressed = false
            break

        case "ArrowLeft":
            keys.ArrowLeft.pressed = false
            break

        case "ArrowUp":
            keys.ArrowUp.pressed = false
            break

        case "ArrowDown":
            keys.ArrowDown.pressed = false
            break
    }
})

