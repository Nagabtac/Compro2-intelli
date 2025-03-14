def queue():
    queue =[] 
    max_size =4
    while len(queue) <=max_size:
        queue.append("Grace")
        queue.append("Vienna")
        queue.append("Charlie")
        queue.append("David")
        queue.append("Eve")
        
        if len(queue)>max_size:
            print("Queue is Full! Cannot Enqueue")
            
            print("Front Element: ", queue[0])
            peek= queue.pop(0)
            
            print("Front Element Removed", peek )
            queue.append(peek)
            
            print("Front Element: ", queue[0])
            
            print("Front Element: ", queue[0])
            break
        
def main():
    queue()

if '__name__' == main():
    main()   
    
    """
    1.Start
    2.Initialize queue
    3. make a variable for max queue size
    4.append element using while loop that checks if the queue is <= max_size
    5.use if statement that when queue exceeds the max_size it'll print Queue is full and pop the first Element
    6.End
    """