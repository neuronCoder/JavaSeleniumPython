class Solution:
    
    
    def ifPeak(self,arr,ind):
        
        if(ind==0):
            if(arr[ind+1]<=arr[ind]):
                return True
                
            else:
                return False
                
        
        if(ind==len(arr)-1):
            if(arr[ind-1]<=arr[ind]):
                return True
                
            else:
                return False
                
        else:
            
            if(arr[ind-1]<=arr[ind] and arr[ind]>=arr[ind+1]):
                return True
                
            else:
                return False
    
    
    def peakElement(self,arr, n):
        
        if(len(arr)==1):
            return 0
            
        for i in arr:
            
            if(self.ifPeak(arr,arr.index(i))):
                
                return arr.index(i)
            
            
sol=Solution()
print(sol.peakElement([1,2,3], 3))