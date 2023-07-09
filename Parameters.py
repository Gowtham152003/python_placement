class student:
    def __init__(self,name,regno):
        self.name=name
        self.regno=regno
    def display(self):
        print("Student Regno:",self.regno)
        print("Student Name:",self.name)

gowtham=student(192011090,"Gowtham")
gowtham.display()
        
