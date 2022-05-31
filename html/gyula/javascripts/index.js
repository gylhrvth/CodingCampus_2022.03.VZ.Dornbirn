const bestJokesEver =[
  {
    id: 1,
    text: "Chuck Noris has counted up to endless... Twice",
    author: "Gyula"
  },
  {
    id: 2,
    text: "Chuck Noris makes no pushups, he pushes the earth away",
    author: "Gyula"
  },
  {
    id: 3,
    text: "Chuck Noris speaks each language, latain inclusive",
    author: "Gyula"
  },
]

let myNumber = 3
console.log("Result of myFunction(): ", myFunction(myNumber, 5))

function myFunction(param1, param2){
  return param1 + param2;
}


function sayHello(){
  console.log("The function sayHello() has been called")
}


function textChange() {
  let newText = document.getElementById("textInput").value
  let headerText = document.getElementById("textOutput")
  if (newText === ""){
    newText = "Hello World!"
  }

  headerText.innerHTML = newText
}

function buttonClick() {
  let headerText = document.getElementById("textOutput")
  let randomColor = Math.floor(360 * Math.random())
  headerText.style.backgroundColor = `hsl(${randomColor}, 60%, 60%)`  
}

function toggleRadioButtons() {
  let element = document.getElementById("radioButtonsField")
  element.classList.toggle("visible")
}


function generateJoke(){
  let parent = document.getElementById("bestJokes")

  bestJokesEver.forEach(element => {
    let divElement = document.createElement("div")

    let childElement = document.createElement("p")
    childElement.classList.add("singleJoke")
    childElement.innerText = element.text
    divElement.appendChild(childElement)

    let authorElement = document.createElement("p")
    authorElement.innerText = element.author
    divElement.appendChild(authorElement)

    parent.appendChild(divElement)    
  });
}