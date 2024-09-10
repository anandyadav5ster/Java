
 
def countlistValues():
 
    lst1 = [10,50,60,50,80,90]
    d = {}
    for i in lst1:
        if i in d:
            d[i] = d[i]+1
        else:
           d[i] =1
    print(d)		
	
#countlistValues()

def reverseString():
    s = 'Bangalore'
    rev =''
    for i in s:
        rev = i+rev
    print(rev)
    
#reverseString()

def countStringValues():
    s = 'Bangalore'
    d= {}
    for i in s:
        if i in d:
            d[i] = d.get(i,0)+1
        else:
            d[i] = 1
    print(d)     
    
    for k,v in d.items():
        print(f'key and values are {k} : {v}')
        
    max_key = max(d,key = d.get) 
    print(f'maximum value of key is {max_key}') 
    
    max_value = [v for k,v in d.items() if v==max(d.values())]
    print(f'maximum value of {max_value}') 
    
    max_key_value = max(d.items() ,key = lambda x:x[1])
    print(f'maxiumum key and value is {max_key_value}')     
            
#countStringValues()            

import re
def removes_special_symbols():
    s= 'An@and@/123wipro'
    s = s.lower()
    res = re.sub('[@123]','',s)
    res = res.replace('/','')
    print(res)
  
#removes_special_symbols()
  
 def  count_char_digit_spl():
        s = 'An@and@123wipro'
        alpha =digit=spl=0
        
        for i in s:
            if i.isalpha():
                alpha=alpha+1
            elif i.isdigit():
                digit =digit+1
            else:
                spl =spl+1
        print(alpha)
        print(digit)
        print(spl)
    
count_char_digit_spl()
            
    
