public class MyStackL {
    //implement with linkedlist
    class Node {
        int data;
        Node next;
        Node(int _data) {
            data = _data;
        }
    }

    Node top = null;
    
	boolean IsFull() {
		return top != null;
	}

	//IsEmpty
	boolean IsEmpty() {
		return top == null;
    }
    
    void push(int data) {
        Node p = new Node(data);
        p.next = top;
        top =  p;
    }

    int pop() {
        int data = top.data;
        top = top.next;
        return data;
    }

    int top() {
        return top.data;
    }
    //
}
