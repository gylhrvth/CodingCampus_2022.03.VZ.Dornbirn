
function toogleToDoItem(oval){
    oval.parentElement.classList.toggle("ready")
}
function deleteItem(deleteI) {
    deleteI.parentElement.removeChild(deleteI);
}

function createNewElement() {
    let txtNewInputBox = document.createElement('div');
        txtNewInputBox.classList.add("toDoItem")

    let oval = document.createElement('img')
        oval.className="checkBox"
        oval.src = 'oval.png'
        oval.alt = "oval"
        oval.addEventListener("click", () => {
            toogleToDoItem(oval)
        })
        txtNewInputBox.appendChild(oval)

    let p = document.createElement('p')
    p.classList.add("inEditing")
    let input = document.createElement("input")
        input.classList.add("toDoEditor")
        input.addEventListener("focusout", () => {
        replaceEditorToText(input)
    })
        input.addEventListener("keydown", () => {
        if (event.key === 'Enter'){
            replaceEditorToText(input)
        }
    })
        p.appendChild(input)
        p.addEventListener("click", () => {replaceTextToEditor(p)})
        txtNewInputBox.appendChild(p)

    let drag = document.createElement('img')
        drag.className="drag"
        drag.src = 'drag.png'
        drag.alt = "drag"
        drag.addEventListener("click", () => {deleteItem(txtNewInputBox)})
        txtNewInputBox.appendChild(drag)


    let xmark = document.createElement('img')
        xmark.className="xmark"
        xmark.src = 'x-mark.png'
        xmark.alt = "x-mark"
        xmark.addEventListener("click", () => {deleteItem(txtNewInputBox)})
        txtNewInputBox.appendChild(xmark)

    // Finally put it where it is supposed to appear.
    let parent = document.getElementById('newtoDoItem')
    if (parent.firstChild == undefined){
        parent.appendChild(txtNewInputBox);
    } else {
        parent.insertBefore(txtNewInputBox, parent.firstChild)
    }
    input.focus()
}

function replaceEditorToText(editor){
    let paragraph = editor.parentElement

    console.log("replaceEdiotr", editor)
    let value = editor.value
    if (value === ""){
        deleteItem(paragraph.parentElement)
    }
    paragraph.innerHTML = value
    paragraph.classList.remove("inEditing")
}

function replaceTextToEditor(paragraph){
    if (paragraph.classList.contains("inEditing")) return

    let text = paragraph.innerHTML
    paragraph.innerHTML = ""

    let input = document.createElement("input")
        input.value = text
        input.classList.add("toDoEditor")
        input.addEventListener("focusout", () => {
        replaceEditorToText(input)
    })
        input.addEventListener("keydown", () => {
        if (event.key === 'Enter'){
            replaceEditorToText(input)
        }
    })
    paragraph.classList.add("inEditing")
    paragraph.appendChild(input)    
}

