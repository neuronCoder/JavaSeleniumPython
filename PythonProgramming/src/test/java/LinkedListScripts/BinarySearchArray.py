import math

def binarysearch(arr, n, k):
        
        if(arr[0]==k):
            return 0
        
        first=0
        last=len(arr)-1
        
        while(first<last):
        
            # print("First: "+str(first))
            # print("Last: "+str(last))
            
            if(math.trunc((last-first)/2)>0):
                
                mid=first+math.trunc((last-first)/2)
            
            else:
                mid=first+1
                
            # print("Mid: "+str(mid))
            mid=math.trunc(mid)
            # print("truncated mid: "+str(mid))
            # print("arr[mid]: "+str(arr[mid]))
            if(k==arr[mid]):
                return mid
                
            elif(k<arr[mid]):
                last=mid
                
            elif(k>arr[mid]):
                first=mid
                
        return -1
    

print(binarysearch([1,2,3,4,5], 5, 6))
