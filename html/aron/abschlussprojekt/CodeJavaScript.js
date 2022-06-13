function myFunction2() {
  var x = document.getElementById("myDIV2");

  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

function myFunction3() {
  var x = document.getElementById("myDIV3");

  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}

function myFunction4() {
  var x = document.getElementById("myDIV4");

  if (x.style.display === "none") {
    x.style.display = "block";
  } else {
    x.style.display = "none";
  }
}



async function NoHumanhtml() {
  let myDivElement = document.getElementById("myDIV");

  let response = await fetch("NoHuman.html")
  let blob = await response.blob()
  let text = await blob.text()
  myDivElement.textContent = text
}

async function NoHumanStyle() {
  let myDivElement = document.getElementById("myDIV");

  let response = await fetch("NoHumanStyle.css")
  let blob = await response.blob()
  let text = await blob.text()
  myDivElement.textContent = text
}

async function Codehtml() {
  let myDivElement = document.getElementById("myDIV");

  let response = await fetch("Code.html")
  let blob = await response.blob()
  let text = await blob.text()
  myDivElement.textContent = text
}

async function CodeStyle() {
  let myDivElement = document.getElementById("myDIV");

  let response = await fetch("CodeStyle.css")
  let blob = await response.blob()
  let text = await blob.text()
  myDivElement.textContent = text
}

async function CodeJavaScript() {
  let myDivElement = document.getElementById("myDIV");

  let response = await fetch("CodeJavaScript.js")
  let blob = await response.blob()
  let text = await blob.text()
  myDivElement.textContent = text
}

async function UberMichhtml() {
  let myDivElement = document.getElementById("myDIV");

  let response = await fetch("UberMich.html")
  let blob = await response.blob()
  let text = await blob.text()
  myDivElement.textContent = text
}

async function UberMichStyle() {
  let myDivElement = document.getElementById("myDIV");

  let response = await fetch("UberMichStyle.css")
  let blob = await response.blob()
  let text = await blob.text()
  myDivElement.textContent = text
}

async function Strukturhtml() {
  let myDivElement = document.getElementById("myDIV");

  let response = await fetch("Struktur.html")
  let blob = await response.blob()
  let text = await blob.text()
  myDivElement.textContent = text
}

async function StrukturStyle() {
  let myDivElement = document.getElementById("myDIV");

  let response = await fetch("StrukturStyle.css")
  let blob = await response.blob()
  let text = await blob.text()
  myDivElement.textContent = text
}

async function common() {
  let myDivElement = document.getElementById("myDIV");

  let response = await fetch("common.css")
  let blob = await response.blob()
  let text = await blob.text()
  myDivElement.textContent = text
}

async function JavaScriptCommon() {
  let myDivElement = document.getElementById("myDIV");

  let response = await fetch("JavaScriptCommon.js")
  let blob = await response.blob()
  let text = await blob.text()
  myDivElement.textContent = text
}

