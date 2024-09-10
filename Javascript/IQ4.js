let str = "GeeksforGeeks"; 
function printDups(str) {
    let count = new Map();
    for (let i = 0; i < str.length; i++) {
      if (count.has(str[i])) {
        count.set(str[i], count.get(str[i]) + 1);
      } else {
        count.set(str[i], 1);
      }
    }
    for (let [key, val] of count) {
    //   if (val > 1) {
    //     console.log(key, ", count = ", val);
    //   }
    console.log(key, ", count = ", val);
    }
  }

  // printDups(str)

  function reverseString(str){
    let rev ="";
    for(let i=0;i<str.length;i++){
      rev = str[i]+rev;
    }
    console.log(rev);
    return rev;
  }
  // reverseString(str);

  function countChar(str){

    let map = new Map();
    for(let i=0;i<str.length;i++){
      let ch = str[i];
      if(map.has(ch)){
        map.set(ch,map.get(ch)+1);
      }
      else{
        map.set(ch,1);
      }
    }
    console.log(map);
    let text ="";
   map.forEach(function(key,value){
    text+=key +' '+value
   })
    
    console.log(text);
  }

  // countChar(str);

  // reverse sentence
  function reverseSentence(){
    let sen = 'I am in london';
    let words = sen.split(' ');
    let res = "";

    for(let word of words){
      res= word+" "+res;
    }
    console.log(res);


  }
  reverseSentence();
  //  string palindrome

  function plaindrome(){
    let s = "Madam";
    s = s.toLowerCase();
    let n = s.length;
    if(s[0]!=s[n-1]){
      console.log("String is not plaindrome")
    }
    else{
      let flag = reverseString(s); 
      if(flag===s){
        console.log("String is plaindrome")
      }
     
    }
  }
  // plaindrome();

  function removeDuplicates(){
    let s = "londonoo";
    let set = new Set()
    for( let x of s){
      set.add(x);
    }
    console.log(...set);
  }
  // removeDuplicates()

  function removeDuplicates1(){
    let s =  "londonoo";
    let res =""
    let n = s.length;
    for(let ch of s){
      if(res.includes(ch)==false){
        res+=ch;
      }
    }
    console.log(res);
  }
removeDuplicates1();