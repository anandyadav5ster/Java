
# reverse string

def reverse_string(s):
	rev =''
	for i in s:
		rev= i+rev

	print(rev)
	
# reverse_string("Anand")		

# reverse sentence 

def reverse_sentence(sen):

	words = sen.split(' ')
	print(len(words))
	rev = ""
	for word in words:
		rev = word+rev
	print(rev)	
# reverse_sentence("I am Anand")

def find_largest_number(nums):
	largest = nums[0]

	for n in nums:
		if n>largest:
			largest = n
	print(largest)		
# find_largest_number([10,5,8,20,3])	

def count_frequency_nums(nums):

	d= {}

	for i in nums:
		if i in d:
			d[i]= d.get(i,0)+1
		else:
			d[i] =1
	print(d)			
# count_frequency_nums([1,2,3,2,1,3,2,4,5,4])

def check_prime_number(n):

	for i in range(2,n+1):
		if(n%i)!=0:
			print(f'{n} is prime')
			break
		else:
			print(f'{n} is not prime')	
			break
# check_prime_number(7)	

def print_prime_nums(num):
	for n in range(2,num):
		for i in range(2,n):
			if n%i==0:
				break	
		else:
			print(n,end=' ')			
# print_prime_nums(10)	

def find_common_element_in_two_list():
	list_a = [1, 2, 3, 4, 5]
	list_b = [4, 5, 6, 7, 8]	
	list_3=[]
	for i in list_a:
		if i in list_b:
			list_3.append(i)
	print(list_3)		
# find_common_element_in_two_list()

def find_common_element_in_two_list1():
	list_a = [1, 2, 3, 4, 5]
	list_b = [4, 5, 6, 7, 8]	
	list_c= set(list_a).intersection(set(list_b))
	# for i in list_c:
	# 	print(i,end=' ')
	list_d = set(list_a)^set(list_b)
	print(f'common element in two list is {list_c}')	
	print(f'remove common in two list is {list_d}')		
# find_common_element_in_two_list1()

def bubble_sort():
	nums = [5, 2, 8, 1, 9]
	n = len(nums)
	for i in range(n-1):
		for j in range(n-i-1):
			if(nums[j]>nums[j+1]):
				nums[j],nums[j+1]=nums[j+1],nums[j]
	print(f'sorted list is : {nums}')			
# bubble_sort()

# find second largest
def find_second_largest():
	nums = [5, 2, 8, 1, 9]
	n = len(nums)
	for i in range(n-1):
		for j in range(n-i-1):
			if(nums[j]<nums[j+1]):
				nums[j],nums[j+1] = nums[j+1],nums[j]

	print(f'list in decending order {nums}')
	print(f'second largest number is {nums[1]}')			
# find_second_largest()	

def remove_duplicate_from_list():
	nums = [5, 2, 2,8, 1, 9]
	# print(f'remove duplicate from list{set(nums)}')
	new_list=[]
	for i in nums:
		if i not in new_list:
			new_list.append(i)
		new_list.sort()	
	print(f'remove duplicate from list{new_list}')
# remove_duplicate_from_list()	

def reverse_number(n):

	rev =0
	while(n!=0):
		digit = n%10
		rev = rev*10+digit
		n = n//10
	print(f'Reverse of the number is: {rev}')	
# reverse_number(121)

# ArmsString number

def check_number_armstrong(n):

	temp =n
	sum = 0
	if n>=1:
		while temp!=0:
			digit = temp%10
			sum = sum+digit**3
			temp = temp//10
		print(sum)
		
		if(sum==n):
			print(f'{n} is armstrong')	
		else:
			print(f'{n} is not armstrong')
	else:
		print(f'Number should be greater than 0')			
# check_number_armstrong(153)

# fabonacci series

def fabonacci(n):
	n1 =0
	n2 =1

	while n>0:
		print(n1,end=' ')
		n3=n1+n2
		n1=n2
		n2=n3
		n-=1

# fabonacci(10)

def check_perfect_number(n):
	sum =0
	temp =n
	while temp>0:
		digit = temp%10
		sum = sum+digit
		temp = temp//10
	if(sum==n):
		print(f'number is perfect')
	else:
		print(f'number is not perfect')		
# check_perfect_number(6)

def lcm_of_2_number(n1,n2):

	if n1>n2:
		greater = n1
	else:
		greater = n2
	while(True):
		if((greater%n1==0) and (greater%n2)==0):
			lcm = greater
			break
		greater+=1
	print(lcm)	
			
# lcm_of_2_number(9,9)

def hcf_of_two_number(n1,n2):

	if n1<n2:
		min = n1
	else:
		min = n2
	for i in range(1,min+1):
		if n1%i==0 and n2%i==0:
			hcf = i	
	print(f'Highest common factor is {hcf}')			

# hcf_of_two_number(10,3)

def check_leap_year(n):

	# if n%4==0:
	# 	if n%400==0:
	# 		if n%100==0:
	# 			print('year is leap')
	# 		else:
	# 			print('year is not leap')	
	# 	else:
	# 		print('year is not leap')				
	# else:
	# 	print('year is not leap')	
	if ((n%4==0 and n%100!=0) or n%400==0):
		print('year is leap')
	else:
		print('year is not leap')	
		

# check_leap_year(2004)

def celcius_to_Fahren(c):
	f = (c*1.8)+32
	print(f'temperature in fahrenheit {f}')
# celcius_to_Fahren(30)

def Fahren_to_celcius(f):
	c = (f-32)/1.8
	print(f'temperature in fahrenheit {c}')
# Fahren_to_celcius(86)

def remove_given_character():
	s = 'Anand'
	target = 'n'
	# for i in s:
	# 	if i==target:
	# 		pass
	# 	else:
	# 		print(i,end='')

	res = s.replace(target,'')
	print(res)
# remove_given_character()
# Program to count occurrence of given character in string
def print_given_character(s,ch):

	count =0
	for i in s:
		if i==ch:
			count+=1
	print(f'count of given character {ch} in string is {count}')		
# print_given_character("Anand",'n')

def check_anagram(s1,s2):

	if(len(s1)==len(s2)):
		s1 = sorted(s1)
		s2 = sorted(s2)

		if(s1==s2):
			print(f'Strings are anagram')
		else:
			print(f'Strings are not anagram')	
# check_anagram('race','care')	

# check given character is vowel or consonant
def check_vowel_or_consonent(s):
	s = s.lower()
	for i in s:
		if i in 'aeiou':
			print(f'{i} is vowel')
		else:
			print(f'{i} is consonent')	
# check_vowel_or_consonent('Anand')	

def count_check_vowel_or_consonent(s):
	s = s.lower()
	vowel =consonent =0
	for i in s:
		if i in 'aeiou':
			vowel+=1
		else:
			consonent+=1

	print(f'vowel count {vowel} : consonent count {consonent}')			
# count_check_vowel_or_consonent('Anand')		

# highest frequency Character in String in Python
def max_count_char(s):
	d ={}

	for i in s:
		if i in d:
			d[i] = d.get(i,0)+1
		else:
			d[i] =1
	# res = max(k for k,v in d.items() if v ==max(d.values()))
	# res = max(d.values())
	res = max(d.items(), key=lambda x: x[1])
	print(res)
# max_count_char("Anand")	

# Replace first occurrence of Vowel with ‘-‘ in String
def replace_first_occurence_vowels(s):

	for i in range(len(s)):
		if s[i] in 'aeiou':
			s= s[:i]+"_"+s[i+1:]
			break
	print(s)		
# replace_first_occurence_vowels("Anand")

def count_alpha_digit_spl(s):

	alpha=digit=spl=0
	for i in s:
		if i.isalpha():
			alpha+=1
		elif i.isdigit():
			digit+=1
		else:
			spl+=1
	print(f'alpha count is :{alpha}')	
	print(f'Digit count is {digit}')	
	print(f'special character count is {spl}')				
# count_alpha_digit_spl("An@and@123wipro")

# remove blank space from string

def remove_space_from_string(s):

	# res = s.replace(" ","")
	res =""
	for i in s:
		if i!=' ':
			res = res+i
	print(res)

# remove_space_from_string("Ana nd")	

def join_two_string(s1,s2):
	res = ' '.join([s1,s2])
	print(res)
# join_two_string('Hello','world')	

# remove duplicate character in string
def remove_duplicates(s):
	newstring = ""
	for i in s:
		if i not in newstring:
			newstring =newstring+i
	print(newstring)	
# remove_duplicates("Anand")

# calculate sum of integers in string.
def sum_integer_string(s):
	sum=0
	for i in s:
		if i.isdigit():
			sum = sum+int(i)
	print(sum)		
# sum_integer_string("An12nd24")	

# sort characters of string in ascending order.

def string_ascending_order(s):
	res = ''.join(sorted(s))
	print(res)
# string_ascending_order("Anand")

# sort characters of string in ascending order.

def string_descending_order(s):
	res = ''.join(sorted(s,reverse=True))
	print(res)
# string_descending_order("Anand")

# Program to find all pairs in Python
def find_pair_sum(a,target):
	pair =[]
	for i in range(len(a)):
		for j in range(i+1,len(a)):
			if a[i]+a[j]==target:
				pair.append((a[i],a[j]))
	print(pair)
	
# find_pair_sum([1, 2, 3, 4, 5, 6, 7, 8, 9, 10],12)	

# find largest and smallest number in an array
def find_largest_and_smallest(a):
	largest =a[0]
	smallest =a[0]
	for i in range(len(a)):
		if a[i]>largest:
			largest = a[i]
		if a[i]<smallest:
			smallest =a[i]
	print(f'largest number is {largest}')
	print(f'smallest number is {smallest}')			

# find_largest_and_smallest([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])

# find the top two maximum number in array
def maximum_top_two(a):

	# new_arr = sorted(arr)
	# print(new_arr)
	# print(new_arr[-1], new_arr[-2])
	new_list =[]
	for i in a:
		if i not in new_list:
			new_list.append(i)

	for i in range(len(new_list)):
		for j in range(i+1,len(new_list)):
			if new_list[i]<new_list[j]:
				new_list[i],new_list[j]=new_list[j],new_list[i]
	print(f'first max {new_list[0]} and second max: {new_list[1]}')			
# maximum_top_two([4, 5, 2, 5, 2])

# array(list) in reverse order using while loop

def array_reverse_order(a):
	rev =[]
	for i in range(len(a)-1,-1,-1):
		rev.append(a[i])
	print(f'reverse of array element is {rev}')	
# array_reverse_order([4, 5, 2, 5, 2])	

def sum_array_element(a):
	sum =0
	for i in a:
		sum= sum+i
	print(f'sum of the array element is {sum}')
	
# sum_array_element([4, 5, 2, 5, 2])		

# even number in array

def even_num_array(a):

	for i in a:
		if i%2==0:
			print(i)

# even_num_array([4, 5, 2, 5, 2])

