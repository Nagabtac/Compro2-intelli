#nahihilo na ako guyz

#variable assignment
x = 10
name = "Alice"
is_active = True
pi = 3.14



print("-----------")
print("For loop")

for i in range(5):
        print(i+ 1)     

print("-------")
print("While loop")

i=0
while i<5:
    print(i)
    i+=1

def greet(name):
    return f"Hello, {name}"
print(greet(name))

print("List")
fruits = ["apple","banana","cherry"]
print(fruits)
fruits.append("date")#adds date at the last of the list
print(fruits)

for i in range(4):
    print(fruits[i])

if x > 5:
    print("x is greater than 5")
    
else:
    print("x is less than or equal than 5")    

#tupples
coordinates = (1,2)
print(coordinates)

for i in range(len(coordinates)):
    print(coordinates[i])