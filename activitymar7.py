def hello():
    stack = []
    stack.append("Hello")#adds "Hello" to the stack
    stack.append("World")#adds "World" to the stack
    
    stack.pop()#Removes or pops the top element which is "World"
    
    print(stack)#Prints the stack list

def main():
    hello()

if __name__ == "__main__":
    main()

#1.  Undo Operation Using Stack: Implement an undo feature for a text editor using stack operations. Push changes to the stack, and pop them to undo.Expected:
#stack.push("Change 1: Add 'Hello'") 
#stack.push("Change 2: Add 'World'") 
#stack.push("Change 3: Remove 'World")