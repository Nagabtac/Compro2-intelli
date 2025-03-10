def hello():
    stack = []
    palindrome = input("Enter what you want to get checked if it's a palindrome: ")
    stack.append(palindrome)
    is_palindrome = True 
    for i in range(len(palindrome) // 2):  
        if palindrome[i] != palindrome[len(palindrome) - 1 - i]:
            is_palindrome = False
            break
    if is_palindrome:
        print("is palindrome: true.")
    else:
        print("is palindrome: false.")

def main():
    hello()

if __name__ == "__main__":
    main()

#1.  Stack-Based Palindrome Checker
#Example input: string = "madam"
#Expected output: Is Palindrome: True