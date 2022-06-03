
function addHeader() {
  let header = document.createElement("div")
  header.innerHTML = "<div class='header'>" +
    "<!-- X Menu-->" +
    "<div class='container' onclick='myFunction(this)'>" +
    "  <div class='bar1'></div>" +
    "  <div class='bar2'></div>" +
    "  <div class='bar3'></div>" +
    "  <!--DropDown Menu-->" +
    "  <div class='topnav'>" +
    "    <div id='myLinks'>" +
    "      <a href='newIndex.html'>News</a>" +
    "      <a href='newIndex.html'>Contact</a>" +
    "      <a href='newIndex.html'>About</a>" +
    "    </div>" +
    "    <a href='javascript:void(0);' class='container' onclick='myFunction()'>" +
    "    </a>" +
    "  </div>" +
    "</div>" +
    "<div class='search'>" +
    "  <div>" +
    "    <a href='Index2.html'><span class='material-symbols-outlined'>home</span>&nbsp;Home</a>" +
    "    <a href='#'><span class='material-symbols-outlined'></span>&nbsp;Weather</a>" +
    "  </div>" +
    "  <div>" +
    "    <input type='text' placeholder='Search...'>" +
    "  </div>" +
    "</div>" +
    "</div>"

  let headerContainer = document.getElementById("headerContainer")
  headerContainer.appendChild(header)
}

window.onload = () => {
  addHeader()
}

function myFunction(x) {
  x.classList.toggle("change");
  var x = document.getElementById("myLinks");
  if (x.style.display === "block") {
    x.style.display = "none";
  } else {
    x.style.display = "block";
  }
}






