def append():
    stack=[None]*6
    stack.append(10)
    stack.append(20)
    stack.append(30)
    
    print("push: ",stack[0])
    print("push: ",stack[1])
    print("push: ",stack[2])
    
    peek= stack.pop()
    print("Peek: ", peek)
    stack.append(peek)
    
    
    while(len(stack) !=0):
        print("Pop: ",stack.pop()) #pops 30, 20,10
        
        if len(stack) == 0:
            print("Stack is Empty!")
            break
    

def main():
    append()

if '__name__' == main():
    main()   
    
    """
    1.Start
    2.Initialize stack with 6 maximum size
    3.push elements 10,20,30
    4.peek the top element
    5.use while loop to pop, and break when it detects the stack is empty
    6.End
    """