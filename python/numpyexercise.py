import numpy as np

'''This will allow to create a 2d array with random values'''
a = np.empty((3,4))
print((a))

'''This will allow to create a array with specified/fill value like 4'''
a = np.full((3,4),4)
print(a)

print('This wil allow to create a empty array with data type')
a = np.empty((3,4),dtype=int)
print(a)
