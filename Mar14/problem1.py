def anagram():
    stack=[]
    isAnagram=True
    while(True):
        word=input("Enter two words: ")
        word.lower()
        word=word.split() 
        
        if len(word) !=2:
            print("Please make sure to enter two words")
        else:
            break    

    stack.extend(word)
    popped_word1=stack.pop()
    popped_word2=stack.pop()
    
    if len(popped_word1) != len(popped_word2):
        isAnagram=False
    elif sorted(popped_word1 ) != sorted(popped_word2):
        isAnagram= False
    
    print("The anagram word is: ",isAnagram)




def main():
    anagram()

if '__name__' == main():
    main()    

    """
    1.start
    2.initialize stack
    3.allow the user to input two words
    4. split the words to two to separate them
    5.use extend instead of append since it is split
    6.pop the two words and put them on two separate variable
    7.if measure each word length and if false return false
    8.else use sort and compare if false return false
    9.print isAnagram
    10.End
    """
