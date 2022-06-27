
let isDarkModeText = window.localStorage.getItem("dark-mode")
let isDarkMode = (isDarkModeText === "false" ? false : true)


function myFunctionButton() {
    isDarkMode = !isDarkMode
    setColorSchema()
}



function pageInit() {
    setColorSchema()
}

function setColorSchema() {
    window.localStorage.setItem("dark-mode", isDarkMode)
    if (isDarkMode) {
        document.documentElement.style.setProperty("--text-color-1", "#2d0f53")
        document.documentElement.style.setProperty("--text-color-2", "#485058")
        //document.documentElement.style.setProperty("--text-color-3", "#acacac")
        document.documentElement.style.setProperty("--text-color-3", "#080728")
        //document.documentElement.style.setProperty("--text-color-4", "#451B61")
        document.documentElement.style.setProperty("--text-color-4", "#B09CBC")
    } else {
        document.documentElement.style.setProperty("--text-color-1", "#ddedf8")
        document.documentElement.style.setProperty("--text-color-2", "#4B4B4B")

        document.documentElement.style.setProperty("--text-color-3", "#b7b7c7")
        document.documentElement.style.setProperty("--text-color-4", "#4B4B4B")

    }
}
