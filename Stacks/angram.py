def check_anagram_using_stack(str1, str2):
    # Convert both strings to lowercase and remove spaces
    str1 = str1.replace(" ", "").lower()
    str2 = str2.replace(" ", "").lower()

    # If lengths of both strings are not equal, they can't be anagrams
    if len(str1) != len(str2):
        return "The anagram word is: FALSE"

    # Create a stack and push characters of the first string
    stack = []
    for char in str1:
        stack.append(char)

    # Pop characters from the stack to form a new string
    reversed_str1 = ""
    while stack:
        reversed_str1 += stack.pop()

    # Sort both strings and check if they are the same
    if sorted(reversed_str1) == sorted(str2):
        return "The anagram word is: TRUE"
    else:
        return "The anagram word is: FALSE"


# Get user input for two strings
str1 = input("Enter String1: ")
str2 = input("Enter String2: ")

# Check if the strings are anagrams
result = check_anagram_using_stack(str1, str2)
print(result)
