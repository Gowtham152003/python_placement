n=int(input("Enter the no.of.days:"))
a=[]
max_days=0
c_days=0
for i in range(0,n):
    n2=int(input("Enter the hours worked:"))
    a.append(n2)
print("Entered no.of.hours worked\n")
print(a)
for i in a:
    if(i>6):
       c_days+=1
    else:
       max_days=max(max_days,c_days)
       c_days=0 

print("Consecutive working days:",max_days)
