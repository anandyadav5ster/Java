
def printdoc(msg):
    print(msg)

''' 1. Check If All Items In A List Are Equal'''
printdoc("1. Check If All Items In A List Are Equal")
my_list = [1,1,1, ]
print(len(set(my_list)) == 1)

''' 2. Delete All the Items in a List Using Slicing'''
printdoc(' 2. Delete All the Items in a List Using Slicing')
my_list = [11,22,33,44,55]
del my_list[:]
print(my_list)

printdoc('3. Loop Over 2 or More Sequences Using zip()')
text = ['get','real', 'with', 'python']
numbers = [1,2,3,4]
for text,numbers in zip(text,numbers):
    print(f'{numbers} ---> {text}')

printdoc('Merge two dictionaries')
x = {'a':1,'b':2}
y = {'c':3,'d':4}
z = {**x,**y}
print(z)

printdoc('5. Sort a Dictionary By Value')
x = {'a':4,'b':2,'c':6,'d':1}
'''lambda x:x[1] -->sorted by value
lambda x:x[0]-->sorted by key'''
res = sorted(x.items(),key=lambda x:x[1])
print(res)

printdoc('6. Pretty Print a Dictionary')
import json
x = {
    'a1':10,
    'a2':30,
    'a3':20
}
print(json.dumps(x,indent=4,sort_keys=True))

printdoc('7. Remove Duplicates from a List')
items= [1,2,1,3,4,5]
print(list(set(items)))

printdoc('8. Get Multiple Items from a List/Dictionary using Itemgetter')
from operator import itemgetter
text = ['get','real', 'with', 'python']
r = itemgetter(1,3)(text)
print(r)


printdoc('9. Get All Permutations of a String')
import itertools

for p in itertools.permutations('kal'):
    print(p)

printdoc('10. all() Method in Python')
printdoc('all the functionwill return True, if all the elemnts are True')

l = [4,5,1]
print(all(l))

l = [4,5,'String']
print(all(l))