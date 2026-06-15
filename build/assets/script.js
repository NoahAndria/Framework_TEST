var abuton = document.querySelector(".addbtn");
var bd = document.querySelector("body");

abuton.addEventListener("click", function(){
    var htable = document.getElementById("hidden-table");
    htable.style.display = "table";
});