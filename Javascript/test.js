// reverseString
function reverseString(){
	let str = 'Bangalore';
	let res = '';
	for(let i=0;i<str.length;i++){
		res = str[i]+res;
	}
	console.log(res);
}

//reverseString();

// reverseSentence
function reverseSentence(){
	let sen = 'I am in london';
	let words = sen.split(' ');
	let res ='';
	for(let word of words){
		res = word+' '+res;
	}
	console.log(`reverse of the string is ${res}`);
}
//reverseSentence();

// remove duplicates
function removeduplicates(){
	let str = 'londonooo';
	let res ='';
	let n = str.length;
	
	for(let i=0;i<n;i++){
		let ch = str[i];
		if(res.includes(ch)==true){
			continue;
		}
		else{
			res+=ch;
		}
	}
	console.log(res);
}
//removeduplicates();
// maximum_squence of character

function maximum_squence_char(){
	let str = "londdddddonoooo";
	let n = str.length;
	let maxcount =1;
	let currcount =1;
	let maxchar = str[0];
	let currchar = str[0];
	
	for(let i=0;i<n;i++){
		currchar = str[i];
		currcount =1;
		for(let j=i+1;j<n;j++){
			if(currchar===str[j]){
				currcount+=1;
				if(currcount>maxcount){
					maxcount=currcount;
					maxchar= currchar;
				}
			}
			else{
				break;
			}
		}
	}
	console.log(maxchar+' '+maxcount);
}
//maximum_squence_char();

//swap_negative_positive_array()
function swap_negative_positive_array()
{
	let a = [-1,2,-3,6,7,8,-4];
	let j=0;
	for(let i=0;i<a.length;i++){
		if(a[i]<0){
			if(i!=j){
				let temp=a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			j++;
		}
	}
	console.log(a);
}
//swap_negative_positive_array();

//count_alpha_digit_spl()
function count_alpha_digit_spl(){
	let s = 'An@nd@123wipro';
	let n = s.length;
	let alpha,digit,spl;
	alpha=digit=spl=0;
	
	for(let i=0;i<n;i++){
		let ch = s[i];
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
			alpha++;
		}
		else if(ch>='0' && ch<='9'){
			digit++;
		}
		else{
			spl++;
		}
	}
	console.log(`count of alpha is-->${alpha}`);
	console.log(`count of alpha is-->${digit}`);
	console.log(`count of special character -->${spl}`);
}
//count_alpha_digit_spl();

//removeSpecialCharacterFromString
function removeSpecialCharacterFromString(){
	let str = "ana@an@+-?";
	let res = str.replace(/[^a-zA-Z0-9]/g,"");
	console.log(res);
}
//removeSpecialCharacterFromString();

function checkAnagram(){
	let s1 = 'Listen';
	let  s2 = 'Silent';

	s1 = s1.toLowerCase().split("").sort().join("");
		console.log(s1);
	s2 = s2.toLowerCase().split("").sort().join("");
	console.log(s2);

	if(s1== s2){
		console.log(`Strings are anagram`);
	}
	else{
			console.log(`Strings are not anagram`);
	}
}
//checkAnagram();

function checkLeapYear(){
	let year = 2024;
	
	if(year%400==0 && year%100!=0 || year%4==0){
		console.log(`${year} is a leap year`);
	}
	else{
		console.log(`${year} is not a leap year`);
	}
	
}
//checkLeapYear();

function sort_string(){
	let a = ['Raj','Amar','Chandan','Ranjan'];
	let n = a.length;
	
	for(let i=0;i<n;i++){
		
		for(let j=0;j<n;j++){
			if(a[j]>a[j+1]){
				let temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
	}
	console.log(a);
}
sort_string();