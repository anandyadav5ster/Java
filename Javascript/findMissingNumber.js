function findMissingNumber(arr)
{
    var n = arr.length;
    var total = ((n+1)*(n+2))/2;

    for(let i =0;i<arr.length;i++)
    {
        total-=arr[i];
    }
    return total;
}

// var arr1 = [1, 2, 4, 5, 6, 7, 8];
// let res = findMissingNumber(arr1)
// console.log(res);

// using Math

function missingNumber1(a)
{
   let n = a.length
   let total = ((n+1)*(n+2))/2;

   for (let i = 0; i< a.length; i++) {
  total-= a[i];
       }
       return total;
}
var arr1 = [1, 2, 4, 5, 6, 7, 8];
let res1 = missingNumber1(arr1)
console.log(res1);