def common_letter():
    s1 = input('Enter the first string: ')
    s2 = input('Enter the second string : ')
    s1 = set(s1)
    s2 = set(s2)
    lst = s1 & s2
    print(''.join(lst))


# common_letter()

#  countr the frequency of words in string
def count_frequency():
    s1 = input('Enter the string: ')

    d = {}
    for i in s1:
        if i not in d.keys():
            d[i] = 1
        else:
            d[i] = d[i] + 1
    print(d)

# count_frequency()

def count_words_sentence():
    s1 = input("Enter the sentence")
    s1= s1.lower()
    lst1 = s1.split()
    d = {}
    for i in lst1:
        if i in d.keys():
            d[i] = d[i]+1
        else:
            d[i] =1
    print(d)

# count_words_sentence()

def check_unique_words_sentence():
    s1 = input("Enter the sentence")
    s1= s1.lower()
    # lst1 = s1.split()
    d = {}
    for i in s1:
        if i in d.keys():
            d[i] = d[i]+1
        else:
            d[i] =1
    print(d)
    res = max(d,key=d.get)
    print(res)
check_unique_words_sentence()

def count_words_sentence1():
    s1 = input("Enter the sentence")
    s1= s1.lower()
    lst1 = s1.split()
    d = {}
    for i in lst1:
       d[i] = d.get(i,0)+1
    print(d)

# count_words_sentence1()

def combine_two_list():
    keys = [1,2,3]
    values = ["one","two","three"]
    result = dict(zip(keys,values))
    print(result)

# combine_two_list()

def list_to_touple():
    d= {1: 'one', 2: 'two', 3: 'three'}
    for i in d.items():
        print(i)
list_to_touple()

def find_missing_number():
    a = [1,4,2,5,6]
    n = len(a)
    total = ((n+1)*(n+2)//2)
    for i in a:
        total=total-i
    print(total)

find_missing_number()

# find the sum equal to pair in array

def two_sum():
    a= [5,7,4,3,9,8,19,11]
    target = 17;
    a.sort()
    left =0;
    right = len(a)-1
    while(left<=right):
        if(a[left]+a[right]<target):
            left=left+1
        elif (a[left]+a[right]>target):
            right = right-1
        elif(a[left]+a[right]==target):
            print("values of pairs are",a[left] ,"and", a[right])
            left = left+1
            right = right-1

two_sum()

# minimum difference between array elements

def min_diff():
    a = [5, 7, 4, 3, 9, 8, 19, 11]
    a.sort()
    min_di= 9999*999
    for i in range(len(a)-1):
        if(a[i+1]-a[i]<min_di):
            min_di = a[i+1]-a[i]
    print(min_di)

min_diff()

# ind the maximum diference

def max_difference():
    a = [5, 32, 45, 4, 12, 18, 25]
    a1= a.sort()
    size = len(a)
    max_dif = -999*999
    for i in range(size-1):
        if(a[i+1]-a[i]>max_dif):
            max_dif = a[i+1]-a[i]
    print(max_dif)

# max_difference()

def eval_expression():
    a = ['2','1','+','3','*']
    operator = ["+","-","*","/","%"]
    stack=[]
    for item in a:
        if item not in operator:
            stack.append(item)
        else:
            first = int(stack.pop())
            second = int(stack.pop())

            if(item=='*'):
                stack.append(first*second)
            if (item == '+'):
                stack.append(first + second)
            if (item == '/'):
                stack.append(first / second)
            if (item == '%'):
                stack.append(first % second)
    return stack[-1]
# res = eval_expression()
# print(res)

def length_of_last_word(str):
    s = str.split(' ')
    size = len(s)
    if size==1:
        print(len(s))
    last_word = s[-1]
    print(len(last_word))

# A = "Hello World"
# length_of_last_word(A)

# remove duplicate from arry
def remove_duplicates():
    a = ['Anand',"Raj","Anand","Bangalore"]
    res = set(a)
    print(res)

# remove_duplicates()

def remove_duplicates1():
    a = [1,1,2,2,3,4,5,6]
    res = set(a)
    print(res)

# remove_duplicates1()

def find_number():
    sentence = "Nancy is 90 years old.She wants 12 toffees"
    num=[]
    for word in sentence.split(' '):
        if word.isdigit():
            num.append(word)
    print(num)
# find_number()

import re
def find_number1():
    sentence = "Nancy is 90 years old.She wants 12 toffees"
    res = re.findall('\d*\.?\d+',sentence)
    print(res)
# find_number1()

def find_common_elements():
    l1 = [2,4,6,8,10,12]
    l2 =[3,6,9,12,15,18]
    z =[]
    for i in l1:
        if i in l2:
            z.append(i)
    print(z)
find_common_elements()