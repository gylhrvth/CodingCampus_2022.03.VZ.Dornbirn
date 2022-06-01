console.log("index.js wurde\" geladen")
console.log('index.js wurde" schon mal geladen')

// Line comment

/*
 Block comment
 with mode than 1 line
 */

 function functionsName(param1, param2){
   return param1 * param2;
 }

 function errorHandling(){
  try {
    adddlert("Welcome guest!");
  }
  catch(err) {
    console.log(err);
  }
 }


 console.log(functionsName("all", "back"))
 errorHandling()

 var x = 0      // Bleibt überall erreichar
 let y = 0      // Nur innerhalb des Blocks {} ereichbar --> Java Standard
 const z = 0    // Gleich wie beim let, aber nach der Initilaisierung kann nicht überschrieben werden

 let myArray = [] // Leeres Array
 let myArray2 = [10, 20, 30, 40, 50, "Murat"] 
 
 myArray2[2] = 99     // Ereichen Ersetzen Element durch deren Index
 console.log("myArray2", myArray2)

 myArray2.push(10)
 console.log("myArray2", myArray2)
let value = myArray2.shift()
console.log("myArray2", myArray2, "value", value)

myArray2.splice(4,1)  // Löschen 1 Element aus dem Array
console.log("myArray2", myArray2)

myArray2.sort()       // Sortieren Aufsteigend
console.log("myArray2", myArray2)

myArray2.reverse()    // Sortieren Absteigend
console.log("myArray2", myArray2)

myArray2.forEach(element => { // Alle Elemente durchiterieren
  console.log("element", element)
})

console.log('2 == "2" ist ', 2 == "2")
console.log('2 === "2" ist ', 2 === "2")

// Arbeit mit dem Document Object Model (DOM)
let root = document.getElementById("root")
let header1 = document.createElement("h1")
let bdo = document.createElement("bdo");
bdo.textContent = "Hello World!"
bdo.dir = "rtl"
header1.appendChild(bdo)
header1.classList.add("bdo-text")
header1.style.fontSize = "48px"
header1.addEventListener("click", () => {
  header1.classList.toggle("important")
})
root.appendChild(header1)

let allImportantElements = document.querySelectorAll(".bdo-text")
allImportantElements.forEach(e => {
  e.addEventListener("mouseover", () => {
    e.style.border = "1px solid red";
  })
  e.addEventListener("mouseout", () => {
    e.style.border = "none";
  })
})



/*
let toDoList = [
  {
    id: 1,
    title: "Start dish washer",
    responsible: "me",
    ready: false,
  },
  {
    id: 2,
    title: "Repair garage door",
    responsible: "me",
    ready: false,
  },
  {
    id: 3,
    title: "Cook dinner",
    responsible: "my wife",
    ready: true,
  }
]

window.localStorage.setItem("toDo", JSON.stringify(toDoList))
*/

let root2 = document.getElementById("root")
let toDoList = JSON.parse(window.localStorage.getItem("toDo"))
toDoList.forEach(toDoItem =>{
  let divElement = document.createElement("div")
  divElement.classList.add("todoTable")
  let status = document.createElement("p")
  divElement.appendChild(status)
  let title = document.createElement("p")
  title.textContent = toDoItem.title
  if (toDoItem.ready){
    status.textContent = "X"
    title.style.textDecoration = "line-through"
  }
  divElement.appendChild(title)
  root2.appendChild(divElement)
})
console.log(toDoList)
/*
  console.log("append Item")
  toDoList.push({
    id: 4,
    title: "Read the newspaper",
    responsible: "my wife",
    ready: true,
  })
  window.localStorage.setItem("toDo", JSON.stringify(toDoList))
*/