from _overlapped import NULL
class Node:
    
    def __init__(self,data):
        self.data=data
        self.next=NULL
        self.previous=NULL
        

def displayList(head):
    
    node=head
    if(node.previous==NULL and node.next!=NULL):
        while(node.next!=NULL):
            print(node.data)
            node=node.next
    elif(node.previous!=NULL and node.next==NULL):
        while(node.previous!=NULL):
            print(node.data)
            node=node.previous
            
        
    print(node.data)
    
def createList(values):
    
    head=Node(values[0])
    
    node=head
    
    for i in range(1,len(values)):
        temp=Node(values[i])
        node.next=temp
        temp.previous=node
        node=temp
    
    tail=node    
    return [head,tail]


def Main():
    
    displayList(createList([2,3,5,7,11,19,23,29])[1])


if __name__=="__main__":
    Main()
        