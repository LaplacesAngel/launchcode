//typescript practice
let cargoHold1: string[] = ["oxygen", "gas", "letpon"];
let cargoNum: number[]= [13,4,4];

let mixedCargo: [string, string, number, string];
mixedCargo = ["hi", "bye", 2, "9"];

function myFunction1 (x: number): number {
	return x*2;
}


let y: number = 0;
function yBoi (x: number): void {
	y = x*2;
}

let myFunction2 = function(x: number): number {return x*2};

//one way of doing optional
function myFunction3(a: number, b?: number): number {
	if(typeof b !== "undefined") {
		return a+b+5;
	} else {
		return a+5;
	}
}

//optional parameter 2 for typescript
function myFunction4(a: number, b = 5): number {
	return a+b+5;
}


function myFunction5(a: number, b =5):number {
   return a+b+5;
}

console.log(myFunction5(5));

let cargoHold: string[] = ['oxygen tanks', 'space suits', 'parrot', 'instruction manual', 'meal packs', 'slinky', 'security blanket'];

console.log(cargoHold);

class Astronaut {
    name: string;
    constructor(firstName: string, lastname: string) {
        this.name = firstName + " " + lastname;
    }
    greet() {
        return "Hello, " + this.name;
    }
}

let Bob = new Astronaut("Bob", "Smith")
console.log(Bob.greet());