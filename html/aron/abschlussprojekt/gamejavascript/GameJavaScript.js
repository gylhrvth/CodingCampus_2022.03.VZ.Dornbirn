import { gameText } from './GameText.js';
import { gameFight } from './GameFight.js';
import { gameDialog } from './GameDialog.js';
import { gameStoryGang1 } from './GameStoryGang1.js';
import { gameStoryGang2 } from './GameStoryGang2.js';
import { gameStoryGang3 } from './GameStoryGang3.js';
import { gameStoryGang4 } from './GameStoryGang4.js';
import { gameStoryGang5 } from './GameStoryGang5.js';
import { gameStoryGang1Alternativ } from './GameStoryGang1Alternativ.js';
import { gameStoryGang2Alternativ } from './GameStoryGang2Alternativ.js';
import { gameStoryGang3Alternativ } from './GameStoryGang3Alternativ.js';
import { gameStoryGang5Alternativ } from './GameStoryGang5Alternativ.js';
import { gameDeath } from './GameDeath.js';
import { gameWin } from './GameWin.js';
import { gameEnd } from './GameEnd.js';

const game = {
    "gameText": gameText,
    "gameFight": gameFight,
    "gameDialog": gameDialog,
    "gameStoryGang1": gameStoryGang1,
    "gameStoryGang2": gameStoryGang2,
    "gameStoryGang3": gameStoryGang3,
    "gameStoryGang4": gameStoryGang4,
    "gameStoryGang5": gameStoryGang5,
    "gameStoryGang1Alternativ": gameStoryGang1Alternativ,
    "gameStoryGang2Alternativ": gameStoryGang2Alternativ,
    "gameStoryGang3Alternativ": gameStoryGang3Alternativ,
    "gameStoryGang5Alternativ": gameStoryGang5Alternativ,
    "gameDeath": gameDeath,
    "gameWin": gameWin,
    "gameEnd": gameEnd,
}
const textelement = document.getElementById('text')
const optionButtonsElement = document.getElementById('option-buttons')

let state = {}
let keyboardEventToClean = []

function startGame() {
    state = {}
    showStoryNode("gameText", 1)
}

function selectOptionEventHandler(event) {
    
    let option = this

    if ((event.type === "keyup") &&
        (option.keyboardKeyName != undefined) &&
        (event.key === option.keyboardKeyName)) {
        selectOption(option)
    }
    if (event.type === "click") {
        selectOption(option)
    }
}

function cleanKeyboardEventHandler() {

    keyboardEventToClean.forEach(eventHandler => {
        window.removeEventListener('keyup', eventHandler)
    })
    keyboardEventToClean = []
}

function addOptionButton(option) {
    const button = document.createElement('button')
    button.id = "button_1"
    button.innerText = option.text
    button.classList.add('btn')

    let eventHandler = selectOptionEventHandler.bind(option)
    keyboardEventToClean = [...keyboardEventToClean, eventHandler]

    button.addEventListener('click', eventHandler)
    window.addEventListener('keyup', eventHandler)
    optionButtonsElement.appendChild(button)
}
async function showStoryNode(node, index) {
    cleanKeyboardEventHandler()

    const myText = game[node].find(text => text.id === index)
    if (myText.init) {
        myText.init(state, showStoryNode)
    }
    textelement.innerText = myText.text
    if (myText.htmlSrc) {
        const content = await (await fetch(myText.htmlSrc)).text();
        document.getElementById("content").innerHTML = content
    } else {
        document.getElementById("content").innerHTML = ""
    }
    if (myText.img) {
        document.getElementById("myPicture").src = myText.img
        document.getElementById("myPicture").style.display = "block"
    } else {
        document.getElementById("myPicture").style.display = "none"
    }
    optionButtonsElement.innerHTML = ""
    if (!myText.type && myText.options) {
        myText.options.forEach(option => {
            if (showOption(option)) {
                addOptionButton(option)
            }
        })
    }
}

function showOption(option) {
    return true
}
function selectOption(option) {
    let transition = option.transition(state)
    showStoryNode(transition[0], transition[1])
}
startGame()
