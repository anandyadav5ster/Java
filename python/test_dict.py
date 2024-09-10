#  to get the maximum value from dictinary

ages = {
    'Matt': 30,
    'Katie': 29,
    'Nik': 31,
    'Jack': 43,
    'Alison': 32,
    'Kevin': 38
}

# maximum value in dictionary
res = [key for key,value in ages.items() if value==max(ages.values())]
print(res)

# maximum value in dictionary
res1= max(ages,key=ages.get)
print(res1)

# sort dictionary
mykeys = list(ages.keys())
mykeys.sort()
# print(mykeys)
sorted_dict = {i:ages[i] for i in mykeys}
print(sorted_dict)

ages = {
    'Matt': 30,
    'Katie': 29,
    'Nik': 31,
    'Jack': 43,
    'Alison': 32,
    'Kevin': 38
}
# res = [v for k,v in ages.items() if v==max(ages.values())]

# res = max(ages.items() ,key = lambda x: x[1])

res = max(ages, key=lambda x: x[1])

print(f'maxiumum value in dic {res}')

ages = {
    'Matt': 30,
    'Katie': 29,
    'Nik': 31,
    'Jack': 43,
    'Alison': 32,
    'Kevin': 38
}

mykeys = list(ages.keys())
mykeys.sort()
print(mykeys)

sorted_dict = {i: ages[i] for i in mykeys}

print(f'sorted dic {sorted_dict}')