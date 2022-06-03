console.log("localStorage.js loaded")

function loadCheck() {
    let data = window.localStorage.getItem("myToDoList");
    if (!data) {
        putTasksToString()
    } else {
        let oldData = document.getElementsByName("draggable"), element;
        while (element = oldData[0]) {
            element.parentNode.removeChild(element)
        }

        let todolist = JSON.parse(data);
        for (var todo of todolist) {
            createNewToDoElement(todo);
        }
    }

}

function putTasksToString() {
    let myToDoList = []
    let toDoItems = document.getElementsByClassName("draggable")
    let txtValue = document.getElementsByTagName("p")
    for (let index = 0; index < toDoItems.length; index++) {
        txtSave = txtValue[index].textContent
        myToDoList.push({
            status: toDoItems[index].classList.contains("ready"), txt: txtSave

        })
        console.log(myToDoList[index])
    }
    console.log(myToDoList)

    window.localStorage.setItem("myToDoList", JSON.stringify(myToDoList))
}
/*
function getTasksFromStorage() {
    let main = document.getElementById("main")
    let toDoListItems = JSON.parse(window.localStorage.getItem("toDoList"))
    toDoListItems.forEach(toDoItem => {
        main.appendChild(createNewToDoElement(toDoItem));
    })

}
*/
function createNewToDoElement(toDoItem) {
    let txtNewInputBox = document.createElement('div');
    if (toDoItem.status) {
        txtNewInputBox.classList.add("toDoItem")
        txtNewInputBox.classList.add("draggable")
        txtNewInputBox.classList.add("ready")
    } else {
        txtNewInputBox.classList.add("toDoItem")
        txtNewInputBox.classList.add("draggable")
    }
    txtNewInputBox.classList.add("draggable")
    txtNewInputBox.setAttribute('name', 'draggable')
    txtNewInputBox.draggable = true

    let oval = document.createElement('img')
    oval.className = "checkBox"
    oval.src = 'oval.png'
    oval.alt = "oval"
    oval.addEventListener("click", () => {
        toggleToDoItem(oval)
    })
    txtNewInputBox.appendChild(oval)

    let p = document.createElement('p')
    p.textContent = toDoItem.txt

    setDragListener(txtNewInputBox)

    txtNewInputBox.appendChild(p)

    let drag = document.createElement('img')
    drag.className = "edit"
    drag.src = 'edit.png'
    drag.alt = "edit"
    drag.addEventListener("click", () => { replaceTextToEditor(p) })
    txtNewInputBox.appendChild(drag)

    let xmark = document.createElement('img')
    xmark.className = "xmark"
    xmark.src = 'x-mark.png'
    xmark.alt = "x-mark"
    xmark.addEventListener("click", () => { deleteItem(txtNewInputBox) })
    txtNewInputBox.appendChild(xmark)
    let parent = document.getElementById('newtoDoItem')
    parent.appendChild(txtNewInputBox);
}




