import { gameText } from './GameText.js';


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
    myText.options.forEach(option => {
        if (showOption(option)) {
            const button = document.createElement('button')
            button.innerText = option.text
            button.classList.add('btn')
            button.addEventListener('click', () => selectOption(option))
            optionButtonsElement.appendChild(button)
        }
    })
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