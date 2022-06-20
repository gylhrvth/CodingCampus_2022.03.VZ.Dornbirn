import { gameText } from './GameText.js';
import { gameFight } from './GameFight.js';
import { gameDialog } from './GameDialog.js';
import { gameStoryGang1 } from './GameStoryGang1.js';
import { gameStoryGang2 } from './GameStoryGang2.js';
import { gameCharakter } from './GameCharakter.js';


const textelement = document.getElementById('text')
const optionButtonsElement = document.getElementById('option-buttons')

let state = {}

function startGame() {
    state = {}
    showTextNode(1)
}

function showTextNode(textNodeIndex) {
    const myText = gameText.find(text => text.id === textNodeIndex)
    textelement.innerText = myText.text
    if (myText.img != undefined) {
        document.getElementById("myPicture").src = myText.img
    }
    optionButtonsElement.innerHTML = ""
    if (myText.type == undefined) {
        myText.options.forEach(option => {
            if (showOption(option)) {
                const button = document.createElement('button')
                button.innerText = option.text
                button.classList.add('btn')
                button.addEventListener('click', () => selectOption(option))
                optionButtonsElement.appendChild(button)
            }
        })
    } else if (myText.type === "fight") {
        startFight(myText, textelement, optionButtonsElement)
    } else {
        console.log("*** DATA ERROR: id= ", text.id, " has an invalid type attribute")
    }

}

function startFight(myText, textelement, optionButtonsElement) {
    setTimeout(() => {
        if (Math.random() < 0.3) {
            img = "https://www.youtube.com/embed/-ZGlaAxB7nI";
            let option = myText.options[0]
            const button = document.createElement('button')
            button.innerText = option.text
            button.classList.add('btn')
            button.addEventListener('click', () => selectOption(option))
            optionButtonsElement.appendChild(button)
        } else {
            textelement.innerText = "Congratulation! Du hast gewonnnen"

            let option = myText.options[1]
            const button = document.createElement('button')
            button.innerText = option.text
            button.classList.add('btn')
            button.addEventListener('click', () => selectOption(option))
            optionButtonsElement.appendChild(button)
        }
    }, 3000)

}


function showOption(option) {
    return option.requireddState == null || option.requireddState(state)
}



function selectOption(option) {
    const nextTextNodeId = option.nextText
    state = Object.assign(state, option.setState)
    showTextNode(nextTextNodeId)

}



startGame()