# find_maximum_value():
def find_maximum_value():       
    s = input("Enter a string ")
    d = {}
    for i in s:
    	d[i] = d.get(i,0)+1
    print(d)
    res = [k for k,v in d.items() if v==max(d.values())]
    print(res)
find_maximum_value()     