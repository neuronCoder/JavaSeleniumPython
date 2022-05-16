from _overlapped import NULL
class Node:
    
    
    def __init__(self,data):
        self.data=data
        self.next=NULL
        
        
    
def inputValues():
    
    values=[]
    
    ifMore=True
    
    while ifMore==True:
        values.append(int(input("Enter your value")))
        y=input("Do you want to enter more?")
        if(y=='n'):
            ifMore=False
        
    return values        

def createLinkedList(values):
    
    head=Node(values[0])
    node=head
    for i in range(1,len(values)):
        # print(values[i])
        node.next=Node(values[i])
        node=node.next
        
    return head

def dispLinkedList(head):
    
    node=head
    while node.next!=NULL:
        print(node.data)
        node=node.next
        
    print(node.data)
        

def main():
    
    dispLinkedList(createLinkedList(inputValues()))
    
    
    


if __name__=="__main__":
    main()
    