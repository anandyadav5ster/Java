// sum of two numbers
 function sumoftwonumbers(x,y){
    var s;
    s = x+y
    console.log(s)
 }
    
//  Write a function that reverses a given string.

function reverseString(){

    let s = 'Anand'
    let rev =''
    for(let i=0;i<s.length;i++){
        rev = s[i]+rev
    }
    console.log(rev)
}
// reverseString()

function reverseSentence(){
    let s = 'I am Anand'
    let words = s.split(' ')
    let rev = ''
    for(let i =0;i<words.length;i++){
        rev =words[i]+rev
    }
    console.log(rev)
}
// reverseSentence()

function reverseString1(s){
    let rev= '';
    for(let i of s) {
        rev = i+rev;
    }
return rev;
}
// let reverseStringresult = reverseString('Bangalore');
// console.log(reverseString)

let result = reverseString('Bangalore');
console.log(result)
function wordinstring(){
    let s = 'I am Anand'
    let words = s.split(' ')
    let res ={}

    for(let i=0;i<words.length;i++)
    {
        let ch = words[i];
        if(!res[ch]==1){
            res[ch]=1
        }
        else{
            res[ch]+=1
        }
    }
    console.log(res)
}

wordinstring()
function countcharacter(){
    let s = 'Anand'
    let res ={}
    for(let i=0;i<s.length;i++)
    {
        let ch = s[i]
        if(!res[ch]){
            res[ch]=1
        }
        else{
            res[ch]+=1
        }
    }
    console.log(res)
}
// countcharacter()

function findmissingnumber(){

    let a= [1,2,3,4,5,7]
    let n = a.length;
    let total = ((n+1)*(n+2))/2;

    for(let i =0;i<n;i++){
        total-=a[i]
    }
    console.log(`Missing number is ${total}`)

}
// findmissingnumber()
function fab(){
    n =10
    n1 = 0;
    n2 =1
    res = ''
    for (let i=1;i<=n;i++){
        // console.log(n1)
        res = res+' '+n1
        n3 = n1+n2
        n1 = n2
        n2 = n3

    }
    console.log(res);
}
// console.log(fab())

function fibonacci(n) {
    if (n <= 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
  
  console.log(fibonacci(2));