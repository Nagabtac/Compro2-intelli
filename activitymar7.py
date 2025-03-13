def hello():
    queue = []
    queue.append(3)
    queue.append(5)
    queue.append(9)
    queue.append(12)
    queue.append(15)
    
    print(queue)# prints queue
    #Dequeues index[0] or 3
    
    print("element removed: ",queue.pop(0))
    
    print("updated queue ", queue)#Prints the queue list

def main():
    hello()

if __name__ == "__main__":
    main()

#1 Start
#2.initialize a queue
#3. enqueue elements 3, 5,9,12,15
#4. print queue
#5.dequeue index[0] or 3
#6.print updated queue
#7.End