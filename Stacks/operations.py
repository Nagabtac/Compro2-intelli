class Stack:
    def __init__(self, max_size):
        self.stack = []
        self.max_size = max_size

    # Push method to add elements to the stack
    def push(self, value):
        if len(self.stack) < self.max_size:
            self.stack.append(value)
            print(f"Push: {value}")
        else:
            print("Stack is full! Cannot push.")

    # Pop method to remove elements from the stack
    def pop(self):
        if self.is_empty():
            print("Stack is empty! Cannot pop.")
        else:
            popped_value = self.stack.pop()
            print(f"Pop: {popped_value}")

    # Peek method to view the top element without removing it
    def peek(self):
        if self.is_empty():
            print("Stack is empty! Cannot peek.")
        else:
            print(f"Peek: {self.stack[-1]}")

    # Check if the stack is full
    def is_full(self):
        return len(self.stack) == self.max_size

    # Check if the stack is empty
    def is_empty(self):
        return len(self.stack) == 0


# Create a stack with maximum size of 6
stack = Stack(6)

# Push elements to the stack
stack.push(10)
stack.push(20)
stack.push(30)

# Peek the top element
stack.peek()

# Pop elements from the stack
stack.pop()
stack.pop()
stack.pop()

# Check if the stack is empty
if stack.is_empty():
    print("Stack is empty!")
