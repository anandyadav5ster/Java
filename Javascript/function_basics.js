/* callback function
 callback is is function which is passed to another function as an argument and it is executed after the 
 operation has been completed
*/ 
function modify_array(arr,callback){

    arr.push(100);

    callback();
}

let arr = [1,2,3];
modify_array(arr,function(){
console.log(`array has been modified: ${arr}`);
});

// Reverse each word in sentence

function reverse_word(string){
    return string.split(" ").reverse().join(' ')
}

let string ="Welcome to this Javascript guide";
let res = reverse_word(string)
console.log(`reverse of the string is: ${res}`)

// Write a JavaScript program to find the maximum number in an array. 

function findMaxNumber(arr){
    // ... is a spread operator expands an iterable into more elements
    let max = Math.max(...arr);
    console.log(`maximum number in array is ${max}`)
}
let arr1 = [1,3,8,7]
findMaxNumber(arr1);

// Write a JavaScript program to reverse a given string. 

function Palindrome(string){
    return string === string.split("").reverse().join('');
}

let st = "madam";
let pal = Palindrome(st);
if(pal){
    console.log(`${pal} is palindrome`);
}
else{
    console.log(`${pal} is not palindrome`);
}

/* Write a JavaScript function that takes an array of numbers and returns a new array 
with only the even numbers. 
*/
function EvenArray(arr){
    return arr.filter(num=>num%2==0);
}
let arr2 = [1,2,8,10];
let evenarr = EvenArray(arr2)
console.log(`New array is : ${evenarr}`);

/*
Write a JavaScript program to calculate the factorial of a given number.
*/
function findfactorial(num){
    if (num==0||num==1) {
        return 1;
    }
    else{
        return num*findfactorial(num-1);
    }
}

let fact = findfactorial(5);
console.log(`factorila of the number is ${fact}`);

// Write a JavaScript function to check if a given number is prime. 
function checkprime(num){
    if (num<=1) {
        return false;
    } else {
        // for(let i=2;i<num/2;i++)
        for(let i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0){
                return false;
            }
        }
    }
    return true;
}

let cp = checkprime(9);
if (cp) {
    console.log(`Number is prime`);
} else {
    console.log(`Number is not prime`);
}
// JavaScript function that returns the Fibonacci sequence

function fabonacciSeries(num){
    let n1=0 ,n2=1;

   for(let i=1;i<=num;i++){
  console.log(n1);
    n3 = n1+n2;
    n1=n2;
    n2 = n3;
   }
}
fabonacciSeries(10)

function capitalizefirstword(){
    let mysent = "freeCodeCamp is an awesome resource";
    let words = mysent.split(" ");
    for(let i =0;i<words.length;i++){
        words[i] = words[i][0].toUpperCase()+words[i].substring(1)
    }
    return words.join(' ');
}

let newsent = capitalizefirstword();
console.log(`New string is: ${newsent}`);

//Write a function that finds the longest word in a sentence
function findlongestword(str){
    let words = str.split(" ");
    let logestword ='';
    for (let i = 0; i<words.length; i++) {
      if(words[i].length>logestword.length){
        logestword = words[i];
      }
      
    }
    return logestword;
}
let reslongword= findlongestword('The quick brown fox jumps over the lazy dog');
console.log(reslongword);

// removes duplicates from an array.
function removeduplicates(arr){
return [... new Set(arr)]
}

console.log(removeduplicates([1,2,2,3,4,5,5]));

// find missing number
function findmissingnumber(arr){
    let n = arr.length;
    let total = ((n+1)*(n+2))/2;
   
    for(let i = 0; i < arr.length; i++) {
        total-=arr[i];
        
    }
    return total;
}

let resmiss = findmissingnumber([1,3,4,5])
console.log(`Missing number is : ${resmiss}`);

// 'this keyword referes to the property of that function' .

var obj=
{
    name: "John",
    getName:function()
    {
        console.log(this.name);
    }
    
}
obj.getName();

// Function which work on other function and parameter .

function A()
{
    console.log('function A');
}

function B(func)
{
    func();
    console.log('I am a higher order function B');
}
B(A)
//  Immediately Invoked Function
// no need to call explicitly
(function(){
    console.log(` Immediately Invoked Function`);
})();

//call by value and reference
// premitive data type -->call by value
// non-primitive data types are always passed by reference
function callByValueAndReference()
{
  var obj1 ={name:"Raj",surname:"Gupta"};
   
  var obj2 = obj1;
   
  obj1.name = "Akash";
   
  console.log(obj2);

    var x = 20;
    var y = x;
    
    x = 30;
    console.log(y);

}

// count string,alpha,number,special character
function countch()
{
    s = "An@an@123Wipro";
    let i, alpha,digi,spl;
    alpha=digi=spl=0;
    for(i=0;i<s.length;i++)
    {
        if((s[i]>="a" && s[i]<="z") || (s[i]>="A" && s[i]<="Z"))
        {
            alpha++;
        }
        else if(s[i]>="0" && s[i]<="9")
        {
            digi++;
        }
        else
        {
            spl++;
        }
    }
    console.log(alpha);
    console.log(digi);
     console.log(spl);
    
}
countch();