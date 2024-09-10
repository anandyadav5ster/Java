
def printPyramid():
    n =5
    for i in range(n):
        for j in range(n-i-1):
            print(" ",end="")
        for j in range(i+1):
            print('*',end=" ")
        print()    

printPyramid()            

def fab(num):
    n1 =0
    n2 =1
    while(num>0):
        print(n1,end=',')
        n3 = n1+n2
        n1 = n2
        n2 = n3
        num=num-1
fab(10)        




def findFactorial(num):
    fact=1
    if num<1:
        print(num)
    else:
        for i in range(1,num+1):
            fact=fact*i
    print(fact)    
findFactorial(5)       
        

def stringArmstrong(s1,s2):
    if(sorted(s1)==sorted(s2)):
        print("{} and {} are Armstrong".format(s1,s2))
    else:
        print("{} and {} are Armstrong".format(s1,s2))
        
stringArmstrong('listen','silent')

def checkNumberarmstrong(num):
    temp = num
    rev =0
    while temp>0:
        digit = temp%10
        rev = rev+digit**3
        temp =temp//10
    print(rev)    
    if(rev==num):
        print("{} is Armstrong".format(num))
    else:
        print("{} is not Armstrong".format(num))
        
# checkNumberarmstrong(407)

def palindromeNumber(num):
    temp =num
    rev=0
    while(temp>0):
        digit = temp%10
        rev = rev*10+digit
        temp = temp//10
    if num==rev:
        print("{} is plaindrome".format(num))
    else:
        print("{} is not plaindrome".format(num))

palindromeNumber(121)

def palindrome():
    s= "raj"
    s.lower()
    if s==s[::-1]:
        print('String is palindrome')
    else:
        print("String is not plaindrome")
# palindrome()

def palindrome1(s):
    s=s.lower()
    rev = ""
    for i in s:
        rev = i+rev;
    print(rev)    
    if rev==s:
         print('String is palindrome')
    else:
         print("String is not plaindrome")
         
# palindrome1("Madam")
# palindrome1("Raj")

def reverseString():
    s= "Banglore"
    # print(s[::-1])
    # return "".join(reversed(s))
    res = ""
    for i in s:
        res= i+res
    print(res)    
    
# res = reverseString()    
# reverseString()