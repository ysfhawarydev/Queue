public class queueByArray {
  int front, rear, capacity;
  int queue[];

  public queueByArray(int c) {
    front = rear = 0;
    capacity = c;
    queue = new int[capacity];
  }

  void enqueue(int item) {
    if (capacity == rear) {
      System.out.println("Queue is full");
      return;
    }
    queue[rear] = item;
    rear++;
  }

  void dequeue() {
    if (front == rear) {
      System.out.println("Queue is empty");
      return;
    }
    for (int i = 0; i < rear - 1; i++) {
      queue[i] = queue[i + 1];
    }
    rear--;
  }

  void display() {
    if (front == rear) {
      System.out.println("Queue is empty");
      return;
    }
    for (int i = front; i < rear; i++) {
      System.out.print(queue[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    queueByArray q = new queueByArray(5);
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);
    System.out.println("Queue after enqueuing elements:");
    q.display();
    
    q.dequeue();
    System.out.println("Queue after dequeuing an element:");
    q.display();
    
    q.enqueue(60);
    System.out.println("Queue after enqueuing another element:");
    q.display();
  }
}