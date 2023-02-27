console.log("Hello from outside page");
console.log("It's a me, jario");
console.log("the page title:", document.title);
console.log("the protocol:", window.location.protocol);
let p = document.getElementById("meat");
p.append("..and I hope you're doing well and having a good day. Screeee");
console.log(p.innerHTML);
