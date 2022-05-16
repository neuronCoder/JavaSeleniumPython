from enum import auto

class Testers:
    
    def __init__(self,id,name):
        print("Constructor of Testers class")
        self.id=id
        self.name=name
        
    def get(self):
        print("get method of Testers class")
        return str(self.id)+self.name

class AutomationTesters(Testers):
    
    def __init__(self,id,name,tool):
        print("Constructor of AutomationTesters class")
        super().__init__(id,name)
        self.tool=tool
        
    def get(self):
        print("Get method of Automationtesters class")
        return self.tool
    
    def retParent(self):
        
        return super()
    
class ManualTesters(Testers):
    
    def __init__(self,id,name,ifUI):
        print("Constructor of manualTesters class")
        super().__init__(id, name)
        self.IfUI=ifUI
    
    def get(self):
        print("Get method of ManualTesters class")
        return self.IfUI
    
    def retParent(self):
        return super()
    
automater=AutomationTesters(1,"Anuran","Selenium")

automater.get()
automater.retParent().get()


print(automater.id)
print(automater.name)
print(automater.tool)

manual=ManualTesters(2,"Raj",True)

manual.get()
manual.retParent().get()

print(manual.id)
print(manual.name)
print(manual.IfUI)




