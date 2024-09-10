def reverseString():
        s = "Bangalore"
        res=''
        for i in s:
            res=i+res;
        return res;

# result = reverseString()
# print(result)

def reverseSentence():
    s = 'I am in london'
    res =''
    words = s.split(" ")
    for word in words:
        res = word+' '+res
    print(f'reverse of the sentence is ',res)    

# reverseSentence()    

# count maximum continuous sequence
def count_maximum_seq():
    s = 'aabbccdddppppp'
    l = len(s)
    maxcount =1
    currcount =1
    maxchar =s[0]
    currchar=s[0]
    # print(maxchar,' ',currchar)
    for i in range(len(s)+1):
        currcount =1
        for j in range(i+1,len(s)):
            if(currchar==s[j]):
                currcount+=1;
                if(currcount>maxcount):
                    maxcount=currcount
                    maxchar=currchar
            else:
                break
        

    print(maxchar,' ',maxcount);                

count_maximum_seq()