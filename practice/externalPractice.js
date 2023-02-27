console.log("Hello from outside page");
console.log("It's a me, jario");
console.log("the page title:", document.title);
console.log("the protocol:", window.location.protocol);
let p = document.getElementById("meat");
p.append("..and I hope you're doing well and having a good day. Screeee");
console.log(p.innerHTML);
let poop = document.getElementById('description');
console.log('poop contents:', poop.innerHTML);
poop.style.color = 'blue';
//script store
console.log("Hello from inside the web page!"+ "\n" + 'hi chunnies');
let response = window.confirm("Click okay if you're NOT a bobi trongino");
   if (response) {
   console.log("Click okay if you're NOT a bobi trongino");
   } else {
   console.log("I WANNA BE A NEW YORKA");
}
let m = document.querySelector('.main');
    console.log(m.innerHTML.trim())
    m.style.color = 'black';
let d = document.querySelector('div');
    d.style.color = 'green';
    console.log(d.innerHTML.trim());
let listItems = document.querySelectorAll('li');
for (let i=0; i < listItems.length; i++) {
    listItems[i].innerHTML += 'is yummy';
}
let purpFruits = document.querySelectorAll('.purple li');
for (let i=0; i < purpFruits.length; i++) {
    purpFruits[i].innerHTML += '!!!'
}
let firstRed = document.querySelector('.red li');
console.log("contents of first red fruit:", firstRed.innerHTML);
let firstPurp = document.querySelector('.purple li');
console.log("first purple fruit:", firstPurp.innerHTML);