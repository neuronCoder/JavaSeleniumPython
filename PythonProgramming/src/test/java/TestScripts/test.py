
def vowels(x):
    x.upper()
    count=0
    for i in x:
        if(i=='A' or i=='E' or i=='I' or i=='O' or i=='U'):
            count+=1
    
    return count


print(vowels("anuran"))