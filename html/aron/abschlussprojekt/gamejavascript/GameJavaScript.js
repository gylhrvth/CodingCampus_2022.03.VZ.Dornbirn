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
}


const textelement = document.getElementById('text')
const optionButtonsElement = document.getElementById('option-buttons')

let state = {}
let storyStack = []

function startGame() {
    state = {}
    showStoryNode("gameText", 1)
}

function addOptionButton(option) {
    const button = document.createElement('button')
    button.innerText = option.text
    button.classList.add('btn')
    button.addEventListener('click', () => selectOption(option))
    optionButtonsElement.appendChild(button)
}

async function showStoryNode(node, index) {
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

    // else if (myText.type === "dialog") {
    //     // Start a dialog
    //     if ((storyStack.length == 0) && (storyStack[storyStack.length - 1] != myText.id)) {
    //         storyStack.push(myText.id)
    //         showDialogNode(myText.dialog_start)
    //     } else {
    //         storyStack.pop()

    //         myText.options.forEach(option => {
    //             if (showOption(option)) {
    //                 addOptionButton(option)
    //             }
    //         })
    //     }

    // } else if (myText.type === "fight") {
    //     startFight(myText.fight_start)
    // } else {
    //     console.log("*** DATA ERROR: id= ", text.id, " has an invalid type attribute")
    // }

}

function startFight(nextFightNr) {
    const myText = gameFight.find(text => text.id == nextFightNr)

    myText.options.forEach(option => {
        if (showOption(option)) {
            addOptionButton(option)
        }
    })
}

function showDialogNode(nextDialogNr) {
    const mydialog = gameDialog.find(text => text.id == nextDialogNr)

    textelement.innerText = mydialog.text
    if (mydialog.img) {
        document.getElementById("myPicture").src = mydialog.img
    }

    optionButtonsElement.innerHTML = ""
    mydialog.options.forEach(option => {
        if (showOption(option)) {
            const button = document.createElement('button')
            button.innerText = option.text
            button.classList.add('btn')
            button.addEventListener('click', () => {
                if (option.nextText) {
                    const nextTextNodeId = option.nextText
                    state = Object.assign(state, option.setState)
                    showDialogNode(nextTextNodeId)
                } else if (option.back_to_story) {
                    // Continue the story
                    if (mydialog.modifyState) {
                        mydialog.modifyState(state)
                    }
                    console.log("Stats: " + JSON.stringify(state))

                    showStoryNode(storyStack[storyStack.length - 1])
                } else {
                    console.log("*** DATA ERROR: id= ", myDialg.id, " has an option ", option.text, " without nextText or back_to_story attribute")
                }

            })
            optionButtonsElement.appendChild(button)
        }
    })
}



function showOption(option) {
    return true
}



function selectOption(option) {
    let transition = option.transition(state)
    showStoryNode(transition[0], transition[1])
}



startGame()
