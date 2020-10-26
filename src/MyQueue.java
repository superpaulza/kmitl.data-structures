public class MyQueue {
   //implement with linkedlist
   class Node {
       int data;
       Node next;
       public Node(int _data) {
            data = _data;
            next = null;
       }
   }

   Node first = null,last; 

   void enqueue(int data) {
       if(isEmpty()) {
            first = last = new Node(data);
       }
       else {
            last.next = new Node(data);
            last = last.next;
       }
   }

   boolean isEmpty() {
       return first == null;
   }

   boolean IsFull() {
    return first != null;
   }

   Node dequeue() {
        Node p = first;
        if(isEmpty()) {
            first = first.next;
        }
        return p;
   }
   //


   public static void main(String[] args) {
       
   } 
}
