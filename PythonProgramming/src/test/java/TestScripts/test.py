
x=[11,22,33,44,44]

def greatest(x):
    
    great=x[0]
    for i in x:
        if(x[x.index(i)]>great):
            great=i
            
    return great

def removeAll(x,y):
    
    for i in x:
        if(i==y):
            x.remove(i)
            removeAll(x, y)


def secondGreat(x):
    
    removeAll(x, greatest(x))
    
    print(greatest(x))
    
    

secondGreat(x)