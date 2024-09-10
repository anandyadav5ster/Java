/*Generators
Regular functions return only one, single value (or nothing).

Generators can return (“yield”) multiple values, one after another, on-demand. They work great with iterables, allowing to create data streams with ease.

function*
*/

function* generateSequence(){
	
	yield 1;
	yield 2;
	yield 3;
	return 4;
}

let generate = generateSequence()
//console.log(generate.next())

for (let value of generate){
console.log(value)
}
	
