function openinputfield() {
    let inputfield = document.getElementById("inputfield")
    inputfield.classList.toggle("visible")
    inputfield.focus
}

var arr = []
var tmp = localStorage.getItem("listEntry");
if (tmp) {
    arr = JSON.parse(tmp)
}

window.onload = () => {
    for (entry of arr) {
        createentryText(entry, "Enter", false)
    }
}

function createentry(event) {
    createentryText(document.getElementById("inputfield").value, event.key, true)
}

function createentryText(userinput, key, save) {
    let pattern = /([a-zA-Z]|[0-9])/;
    let result = pattern.test(userinput);

    if (result === true) {
        let container = document.getElementById("container")
        let entry = document.createElement("div")

        entry.classList.add("gridentry")
        if (key == "Enter") {
            entry.textContent = userinput
            container.appendChild(entry)

            if (save) {
                arr.push(userinput)
                localStorage.setItem("listEntry", JSON.stringify(arr))
                console.log(localStorage.getItem("listEntry"))
            }

            let deleteButton = document.createElement("button")
            deleteButton.innerHTML = "X"
            deleteButton.style.width = "fit-content"
            deleteButton.style.marginLeft = " 5%"
            entry.appendChild(deleteButton)

            deleteButton.addEventListener("click", () => {
                container.removeChild(entry)
                let index = arr.indexOf(userinput)
                arr.splice(index, 1)
                localStorage.setItem("listEntry", JSON.stringify(arr))
            })
        }
    }
}