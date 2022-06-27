console.log("index.js has been loaded")

//line comment

/*
block comment
*/

function testfunction(param1, param2){
    return param1 + param2;
}

function errorhandling(){
    try{
        adddlert("hello world");
    }catch(err){
        console.log(err)
    }
}

console.log("the solution is " + testfunction(1, 4));
errorhandling()

var x = 0 //var stays reachable everywhere
let y = 0 //let is only reachable inside of code block {} --> java standard
const z = 0 //same as the let but cannot be change after initialisation. It is a CONSTANT

let myArray = [] // empty array
let myArray2 = [1,2,3,4,10] //filleda array (duh!)
myArray2[2] = 99 // replaces element at given index. In this case 2

console.log("myArray2",myArray2)

myArray2.push(10)

console.log("myArray2",myArray2)

let value = myArray2.shift() //shift takes the element on the first index and returns it
myArray2.unshift(55) // inserts element into the first index of array

console.log("myArray2",myArray2,"value",value)

myArray2.splice(2) //removes element from given index out of array

console.log("myArray2",myArray2)

myArray2.sort() // sorts ascending
console.log("myArray2",myArray2)
myArray2.reverse() // sorts descending
console.log("myArray2",myArray2)

myArray2.forEach(element => { //Iterates trough all elements
    console.log("element",element)
})

console.log('2 == "2" is ', 2 == 2)
console.log('2 === "2" is ', 2 === 2)

//working with the Document Object Model (DOM)
function init(){
    let root = document.getElementById("testid")
    let header1 = document.createElement("h1")
    let header2 = document.createElement("h1")
    header2.textContent = "unhello world?"
    header2.classList.add("red-text")
    header2.style.fontSize = "48px"
    root.appendChild(header2)
    header1.textContent = "hello world!"
    header1.classList.add("red-text")
    header1.style.fontSize = "48px"
    root.appendChild(header1)

    let allHeaders = document.querySelectorAll("testid")

    /* does not work??

    allHeaders.forEach(e => {
        e.addEventListener("click",() =>{
           e.classList.toggle("important")
        })
    })
    
    */

    header1.addEventListener("click", () =>{
        header1.classList.toggle("important")
    })
    header2.addEventListener("click", () =>{
        header2.classList.toggle("important")
    })

}

