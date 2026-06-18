public class queueByLinkedList {
  Node front, rear;
  int capacity;

  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  public queueByLinkedList(int capacity) {
    this.capacity = capacity;
    front = rear = null;
  }

  public void enqueue(int item) {
    if (size() == capacity) {
      System.out.println("Queue is full");
      return;
    }
    Node new_node = new Node(item);
    if (rear == null) {
      front = rear = new_node;
      return;
    }
    rear.next = new_node;
    rear = new_node;
  }

  public void dequeue() {
    if (front == null) {
      System.out.println("Queue is empty");
      return;
    }
    front = front.next;
    if (front == null) {
      rear = null;
    }
  }

  public int size() {
    int count = 0;
    Node current = front;
    while (current != null) {
      count++;
      current = current.next;
    }
    return count;
  }
}