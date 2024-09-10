// const prompt = require("promptSync")();
// reverse a string
function reverseString(){
    let s = 'Bangalore';
    let res =''
    // for(let i in s){
    //     res = s[i]+res;
    // }
    for(let i of s){
        res = i+res;
    }
    console.log(res)
}
reverseString()

// reverse sentence
function reverseSentence(){

    let sen = 'I am in Bangalore'
    let words = sen.split(' ');
    let res ='';
    for(let word of words){
        res = word+' '+ res;
    }
    console.log(res);
}
// reverseSentence()

// check palindrome
function checkPalindrome(){
    let s = "Madam";
    s = s.toLowerCase();
    let res ='';
    for(let i of s){
        res= i+res;
    }
    console.log(`Reverse of the string is ${res}`);
    if(res==s){
        console.log("String is palindrome");
    }
    else{
        console.log("String is not palindrome");
    }
}
// checkPalindrome()

// find the factorial
function findFactorial(){
    let n = 5;
    let fact=1;
    for(let i=1;i<=n;i++){
        fact =i*fact;
    }
    console.log(`factorial of the number is ${fact}`);
}
// findFactorial()

// function evenArray(){
//     let a = [1,2,8,4,20];
//     let res = a.filter(n=>n%2==0)
//     console.log(res);  
// }
// evenArray()

function evenArray(){
    let a = [1,2,8,4,20];
    let b =[]
    a.forEach(n=>{
        if (n%2==0){
            b.push(n);
        }
    })
    console.log(b);  
}
// evenArray()

function printInfo(){
    const person = {
        'a':1,
        'b':2,
        'c':3
    }
    console.log("Object values are : ",Object.values(person))
    console.log("Object keys are : ",Object.keys(person))
}
// printInfo()

function printFabonacci(){
    let n = 10;
    let n1 = 0;
    let n2 =1;
    let a = []
    while(n!=0){
        a.push(n1);
        let n3 = n1+n2;
        n1 =n2;
        n2 = n3;
        n-=1;
    }
    console.log(...a);
}
// printFabonacci()

// remove duplicates

function removeDuplicates(){
    let s = 'Bangalore'
    let res = new Set(s);
    console.log(...res);
}
// removeDuplicates()

function countWords(){
    let s = 'Anand';

    // object to store the values
    let res = {};
    for(let i=0;i<s.length;i++){
        let ch = s[i];
        if(!res[ch]){
            res[ch] =1;
        }
        else{
            res[ch]+=1;
        }
    }
    
    console.log(res);
}
// countWords()

//  count the sent words

function countWordsSentence(){
    let s = 'I am in in Bangalore';
    let words = s.split(' ');
    let res = {};
    for(let word of words){
        if(!res[word]){
            res[word]=1;
        }
        else{
            res[word]+=1;
        }
    }
    // console.log(res);
    Object.entries(res).forEach(([key,value])=>{
        console.log(key,value)
    })
    // console.log(Object.keys(res)+ " "+Object.values(res));
}
countWordsSentence()