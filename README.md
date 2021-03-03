# Java Queue
From scratch implementation using an array to store our elements

## Code

We define a `public` `class` with the following fields:

- arr: the array to store our elements (in this case numbers)
- front: points to the front number
- rear: points to the back number
- capacity: the size of the queue (optional)
- count: current amount in the queue

```
  public class QueueExample {
  
	private int[] arr;
	private int front;
	private int rear;
	private int capacity; (optionally declare a capacity)
	private int count; 

	public QueueExample(int size) {
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}

	// ...member methods
}
```

Next we need to implement the following member methods:

- dequeue: removes the front element
- enqueue: adds an element to the rear
- peek: return but do not remove the front element
- size: returns the current size
- isEmpty: returns a boolean if the queue is empty or not
- isFull: returns boolean if size is equal to capacity

```
	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Underflow");
		}

		System.out.println("Removing " + arr[front]);

		front = (front + 1) % capacity;
		count--;
	}

	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("Overflow");
		}

		System.out.println("Inserting " + item);

		rear = (rear + 1) % capacity;
		arr[rear] = item;
		count++;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Underflow");
		}
		return arr[front];
	}
  
	public int size() {
		return count;
	}

	public Boolean isEmpty() {
		return (size() == 0);
	}

	public Boolean isFull() {
		return (size() == capacity);
	}
```

## Underflow & Overflow: What are they?

Overflow is when you try to add extra items above the defined capacity (if you want your queue to have a capacity).
Underflow is when you try to get an element when there is no elements in the queue.

dequeue - we check for underflow by calling the isEmpty() method
enqueue - we check for overflow by calling the isFull() method
