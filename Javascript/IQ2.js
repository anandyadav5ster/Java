// find the sum of two numbers

function sum(x,y){
	let sum = x+y;
console.log(sum);
}
//sum(2,3)

// reverse string

function reverse_string(s){
	 let n = s.length;
	 let rev =''
	 for(let i of s){
		 rev = i+rev
	 }
	  console.log(rev);
}
reverse_string('Anand')

// reverse string2 
function reverse_string2(s){
	 let n = s.length;
	 let rev =''
	 try{
		 for(let i = n-1;i>=0;i--){
		 rev = rev+s[i];
	 }
	 }
	 catch( e){
		 console.log(e.message);
	 }
	 
	  console.log(rev);
}
//reverse_string2("Anand")

// convert object to array

const person = {
	a:1,
	b:2,
	c:3
};
const a = Object.values(person);
console.log(a);

function reverseString(){
	let s = 'Bangalore'
	let res =''
	for(let i in s){
		res = s[i]+res;
	}
	console.log(res);
}
// reverseString()

[1,2,3].print();

Array.prototype.print=()=>{
	let result='';
	this.forEach(ele => {
		result+=`${ele}`;
	});
}