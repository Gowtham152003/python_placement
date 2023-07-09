class calculator:
    def __init__(self,a,b):
        self.input1=a
        self.input2=b
    def calc(self):
        print("Sum:",self.input1+self.input2)
        print("Difference:",self.input1-self.input2)
        print("Multiplication:",self.input1*self.input2)
        print("Division:",self.input1/self.input2)

t1=calculator(10,2)
t1.calc()
