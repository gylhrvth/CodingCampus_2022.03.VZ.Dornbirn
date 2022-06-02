
 function myFunction(x) {
    x.classList.toggle("change");
    var x = document.getElementById("myLinks");
    if (x.style.display === "block") {
      x.style.display = "none";
    } else {
      x.style.display = "block";
    }
  }
  let parent = document.getElementsByName("header")
  let child = document.getElementsByName("heder1")
  child.classList.add(parent)

  