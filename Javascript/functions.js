function add(a,b){
    return a+b
}
let sum = add(2,3)
console.log(sum)

let sumofnumbers = function(a,b){
    return a+b
}
// console.log(sumofnumbers(3,4))

let check_duplicate_in_array = (input_array) => {
	let duplicate_elements = []
	for (num in input_array) {
		for (num2 in input_array) {
			if (num === num2) {
				continue;
			}
			else {
				if (input_array[num] === input_array[num2]) {
					duplicate_elements.push(input_array[num]);
				}
			}
		}
	}
	return [...new Set(duplicate_elements)];
}
let arr = [1, 1, 2, 2, 3, 3, 4, 5, 6, 1];
// console.log(check_duplicate_in_array(arr));

let check_duplicate_in_array1 = (input_arr)=>{
    let duplicate = input_arr.filter((item,index) => input_arr.indexOf(item)!==index);
    return Array.from(new Set(duplicate))
}

// const res1 = check_duplicate_in_array1(arr);
// console.log(res1);

// Using Set

let check_duplicate_in_array2 = (input_arr)=>{
    let unique = new Set();
    let dup = []
    for(let i =0;i<input_arr.length;i++)
    {
        if(unique.has(input_arr[i]))
        {
            dup.push(input_arr[i]);
        }
        unique.add(input_arr[i]);
    }
    return Array.from(new Set(dup))
}

let res2 = check_duplicate_in_array2(arr)
// console.log(res2);

const str = "Anand";

const findRepeated = function(str){
    const inputStr = "GeeksforGeeks"; 
const sortedStr = inputStr.split('').sort().join(''); 
  
let duplicates = []; 
let prevChar = sortedStr[0]; 
  
for (const char of sortedStr.slice(1)) { 
    if (char === prevChar 
        && !duplicates.includes(char)) { 
        duplicates.push(char); 
    } 
    prevChar = char; 
} 
  
if (duplicates.length > 0) { 
    console.log(`The duplicate characters : ${duplicates.join(', ')}`); 
} else { 
    console.log(`The string "${inputStr}" has no duplicate characters.`); 
};
}

// findRepeated(str)


