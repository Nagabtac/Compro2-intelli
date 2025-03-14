class FixedStringQueue:
    def __init__(self, max_size):
        self.queue = []
        self.max_size = max_size

    # Enqueue method to add a string to the queue
    def enqueue(self, value):
        if len(self.queue) < self.max_size:
            self.queue.append(value)
            print(f"Enqueue: {value}")
        else:
            print("Queue is full! Cannot enqueue.")

    # Dequeue method to remove the front element from the queue
    def dequeue(self):
        if self.is_empty():
            print("Queue is empty! Cannot dequeue.")
        else:
            removed_value = self.queue.pop(0)
            print(f"Removed: {removed_value}")

    # Peek method to view the front element without removing it
    def peek(self):
        if self.is_empty():
            print("Queue is empty! Cannot peek.")
        else:
            print(f"Front element: {self.queue[0]}")

    # Check if the queue is full
    def is_full(self):
        return len(self.queue) == self.max_size

    # Check if the queue is empty
    def is_empty(self):
        return len(self.queue) == 0


# Create a queue with a fixed siz
