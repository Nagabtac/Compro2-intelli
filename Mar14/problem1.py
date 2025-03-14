def anagram():
    stack1=[]
    stack2=[]
    word1=input("Enter first word: ")
    word2=input("Enter first word: ")
    
    stack1.append(word1)
    stack2.append(word2)
    
    while(True):
        if len(stack1) != len(stack2):
            print("isAnagram: false")
            break
        else:
            print("isAnagram: True")
            break



def main():
    anagram()

if '__name__' == main():
    main()    

    """
    1.start
    2.initialize 2 stacks
    3.allow the user to input two words
    4.push word1 to stack1 and word2 to stack2
    5.measure each word length and if false return false and end program
    6.pop each word and sort.
    7.compare each word if theyre arreange in the same order if false return false
    """
