// Hoisting in JavaScript is a behavior in which a function or a variable can be used before declaration. 
// For example,
// to over come hoisting use 'use strict';

console.log(a);
var a;


// program to print the text
fun(); // Calling before declaration
 
function fun() { // Declaring
  console.log("Function is hoisted");
}

 
//let example(global)
console.log(name);
var name = 'Mukul Latiyan';

fun() // Calling the expression
 
var fun = () =>{ // Declaring
    let name = 'Mukul Latiyan';
    console.log(name);
}
