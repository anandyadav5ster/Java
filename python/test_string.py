# String problem
import re


#program to check if a string has at least one letter and one number
def check_string_has_number():
    input = 'thishasboth29'
    flag_a = False
    flag_d = False
    for i in input:
        if i.isalpha():
            flag_a = True
        if i.isdigit():
            flag_d = True
    return flag_a and flag_d
print(check_string_has_number())
# program to capitalize the first and last character of each word in a string
def capatalize_first_last():
    s ='hello world'
    words = s.split(' ')
    n = len(s)
    res =[]
    for i in words:
        res.append(i[0].upper()+i[1::])

    # res = s[:-1]+s[-1].upper()
    print('capitalize the first and last character of each word in a string {}'.format(res))
# capatalize_first_last()

# Uppercase Half String
def half_string():
    test_str = 'geeksforgeek'
    res =''
    n = len(test_str)
    mid = n//2
    for i in range(n):
        if(i<=mid):
            res+=test_str[i].upper()
        else:
            res+=test_str[i]
    print("capitaliz first half of string: {}".format(res))
# half_string()


def even_length_word():
    test_str = 'This is a python language'
    lst1 =[]
    res =''
    words = test_str.split(' ')
    for word in words:
        if len(word)%2==0:
            lst1.append(word)
            # res = res+word
    print('Remove space from string: {}'.format(' '.join(lst1)))

# even_length_word()

    # Python program to check whether the string is Symmetrical or Palindrome

def string_palindrome(input):
    input = input.lower()
    n = len(input)
    rev = ''
    for i in input:
        rev = i + rev
    # print(rev)
    if (rev == input):
        print("{} is symmetric/palindrome".format(input))
    else:
        print("{} is not symmetric/palindrome".format(input))

    # string_palindrome('Madam')


def string_symmetric(input):
    n = len(input)
    flag = 0
    if n % 2:
        mid = n // 2 + 1
    else:
        mid = n // 2
    start1 = 0
    start2 = mid
    while (start1 < mid and start2 < n):
        if (input[start1] == input[start2]):
            start1 = start1 + 1
            start2 = start2 + 1
        else:
            flag = 1
            break

    if (flag == 0):
        print("{} is symmetric".format(input))
    else:
        print("{} is not symmetric".format(input))


# string_symmetric("amaama")


# How to Remove Letters From a String in Python
def remove_char(input):
    input = 'Geeks123For123Geeks'
    res = input.replace('123', '')
    # res = re.findall('\S[a-z]+',input)
    print(res)


# remove_char(input)


def remove_char_position(input):
    input = 'Geeks123For123Geeks'
    res = input.replace('s','',1)
    # res = re.findall('\S[a-z]+',input)
    print(res)

# remove_char_position(input)

# nums = [5, 2, 2, 8, 1, 9]
# res = set(nums)
# print(res)
#
# names = ["Jacob", "Joe", "Jim"]
#
# if (name:= input("Enter a name: ")) in names:
# 	print(f"Hello, {name}!")
# else:
# 	print("Name not found.")

s = "Anand"
s = s.lower()
d= {}
for i in s:
    if i in d:
        d[i] = d.get(i,0)+1
    else:
        d[i] = 1
print(f'count of words in string is {d}')

res = max(d.items(), key = lambda x: x[1] )
print(res)

s = "i am anand"
lst1 =[]
words = s.split(' ')
for word in words:
    lst1.append(word[0].upper()+word[1::])
print(f'capatalize of the first word of sentence {lst1}')
print(' '.join(lst1))

lst =[]
s = s.split(' ')
for i in s:
    for i in s:
        if i not in lst:
            lst.append(i)
print(f'remove duplicate from string {lst}')

import re
s = "An@nd@123wipro"
res = re.sub("[@123]","",s)
print(f'String after remove special character and digit {res}')

import re

s = "An@nd@123wipro"
res = re.sub("[@123]", "", s)

alpha = digit = spl = 0
for i in s:
    if i.isalpha():
        alpha = alpha + 1
    elif i.isdigit():
        digit = digit + 1
    else:
        spl = spl + 1

print(f'alphabets count is {alpha}')
print(f'Digit count is {digit}')
print(f'Special character count is {spl}')
