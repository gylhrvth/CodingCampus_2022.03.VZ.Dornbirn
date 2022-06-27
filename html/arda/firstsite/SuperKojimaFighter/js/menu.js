var playbtnsound = new Audio("./resources/sounds/menu/SFII_01 - Mode Select.wav")
var menutheme = new Audio("./resources/sounds/menu/menutheme.mp3")
menutheme.volume = 0.5
menutheme.loop = true
menutheme.playbackRate = 1.2
menutheme.play()


//gets the container text and the control button
var controlstext = document.getElementById("containertext")
var controlsbtn = document.getElementById("controls")

//gets the container text and the credits button
var creditstext = document.getElementById("creditstext")
var creditsbtn = document.getElementById("creditsbtn")


controlsbtn.addEventListener("click", () => {
    controlstext.classList.toggle("show")
})

creditsbtn.addEventListener("click", () => {
    creditstext.classList.toggle("showcredits")
})


var btn = document.getElementById("playbtn").addEventListener("click", () => {
    menutheme.pause()
    playbtnsound.play()
    setTimeout(() => {
        window.location = "game.html"
    }, 1000)
})