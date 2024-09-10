let marks = Array(6)
var mark = new Array(20,30,40,50,60)

// or
var mark = [20,30,40,50,60]
console.log(mark[0])

console.log(mark.length)

mark.push(64)
console.log(mark)

mark.pop()
console.log(mark)

mark.unshift(12)
console.log(mark)

console.log(mark.indexOf(12))

// element present in the array or not
console.log(mark.includes(12))
console.log(mark.slice(2,5))

for(let i =0;i<mark.length-1;i++){
    console.log(mark[i])
}
// filter
let filter = mark.filter(m=>m%2==0)
console.log('filter value is ',filter)

// map
let mapvalue = mark.map(m=>m*3);
console.log('Map value is ',mapvalue)

// reduce
let totalvalue = mapvalue.reduce((sum,val)=>sum+val,0)
console.log('sum is ',totalvalue)

// sort the array
let fruits = ["banana","mango","pomegrante","apple"]
fruits.sort()
console.log(fruits)

var scores = [12,15,11,9]
scores.sort(function(a,b){return a-b})
console.log("score after sort is ",scores)