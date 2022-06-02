function toggleToDoItem(oval) {
  let parent = oval.parentElement
  parent.classList.toggle("ready")

  if (parent.classList.contains("ready")) {
    let parentsParent = parent.parentElement
    parentsParent.removeChild(parent)
    parentsParent.appendChild(parent)
  }
}

function deleteItem(deleteI) {
  deleteI.parentElement.removeChild(deleteI);
}

function createNewElement() {
  let txtNewInputBox = document.createElement('div');
  txtNewInputBox.classList.add("toDoItem")
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
  p.classList.add("inEditing")
  let input = document.createElement("input")
  input.classList.add("toDoEditor")
  input.addEventListener("focusout", () => {
    replaceEditorToText(input)
  })
  input.addEventListener("keydown", () => {
    if (event.key === 'Enter') {
      try {
        replaceEditorToText(input)
      } catch (exc) {
        console.log("TODO fixme STILL!!!2")
      }
    }
  })

  setDragListener(txtNewInputBox)
  p.appendChild(input)
  /*
          p.addEventListener("click", () => {replaceTextToEditor(p)})
          */
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

  // Finally put it where it is supposed to appear.
  let parent = document.getElementById('newtoDoItem')
  if (parent.firstChild == undefined) {
    parent.appendChild(txtNewInputBox);
  } else {
    parent.insertBefore(txtNewInputBox, parent.firstChild)
  }
  input.focus()

}

function replaceEditorToText(editor) {
  let paragraph = editor.parentElement
  console.log("replaceEditor", editor)
  let value = editor.value
  if (value === "") {
    deleteItem(paragraph.parentElement)
  }

  paragraph.innerHTML = value;
  paragraph.classList.remove("inEditing")
}

function replaceTextToEditor(paragraph) {
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
    if (event.key === 'Enter') {
      replaceEditorToText(input)
    }
  })
  paragraph.classList.add("inEditing")
  paragraph.appendChild(input)
}

function setDragListener(node) {
  node.addEventListener('dragstart', () => {
    node.classList.add('dragging')
  })

  node.addEventListener('dragend', () => {
    node.classList.remove('dragging')
  })
}

/*Drag and Drop*/
const containers = document.getElementsByName("container");
const draggables = document.getElementsByName("draggable")

draggables.forEach(draggable => {
  setDragListener(draggable)
})

containers.forEach(container => {
  container.addEventListener('dragover', e => {
    e.preventDefault()
    const afterElement = getDragAfterElement(container, e.clientY)
    const draggable = document.querySelector('.dragging')
    if (afterElement == null) {
      container.appendChild(draggable)
    } else {
      container.insertBefore(draggable, afterElement)
    }
  })
})

function getDragAfterElement(container, y) {
  const draggableElements = [...container.querySelectorAll('.draggable:not(.dragging)')]

  return draggableElements.reduce((closest, child) => {
    const box = child.getBoundingClientRect()
    const offset = y - box.top - box.height / 2
    if (offset < 0 && offset > closest.offset) {
      return { offset: offset, element: child }
    } else {
      return closest
    }
  }, { offset: Number.NEGATIVE_INFINITY }).element
}


