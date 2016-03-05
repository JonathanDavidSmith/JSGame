window.onload = function()
{
	document.getElementById("test").innerHTML = "wooohoooooo";

};


function myFunction() {
	console.log("testing... testing...");
    var x = document.createElement("BUTTON");
    var t = document.createTextNode("you can click me.. but I do nothing.");
    x.appendChild(t);
    document.body.appendChild(x);
}

