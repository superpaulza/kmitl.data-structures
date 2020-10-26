class MyLinkedList {
    
    public static void main(String[] args) {
	
    }
    
	class Node {
		int data;
		Node next;
		public Node(int data) 
		{
			this.data = data;
			next = null;
		}
	}

	Node head = null;

	//add
	void add(int data) {
		Node p = new Node(data);
		p.next = head;
		head = p;
	}

	//insert
	void insert(int data, Node p) {
		if(p == null) add(data);
		else {
			Node q = new Node(data);
			q.next = p.next;
			p.next = q;
		}
	}

	//find
	Node find(int data) {
		Node p = head;
		while(p != null && p.data != data)
			p = p.next;
		return p;
	}

	//delete
/*	void delete(Node p) {
		p.next = p.next.next;
	}

	void delete(int data) {
		if(head.data == data)
			head = head.next;
		else {
			Node p = head;
			while(p.next != null && p.next.data != data)
				p = p.next;
			if(p.next != null) {
				p.next = p.next.next;
			}
		} //else
	}*/

	//delete with search
	void delete(int data) {
		Node t = new Node(data);
		t.next = head;
		Node p = t;
		while(p.next != null && p.next.data != data)
			p = p.next;
		if(p.next != null)
			p.next = p.next.next;
		head = t.next;
	}

	//IsFull
	boolean IsFull() {
		return head != null;
	}

	//IsEmpty
	boolean IsEmpty() {
		return head == null;
	}

	//toString
	String toString(int d) {
		String str = "List: ";
		Node p = head;
        while(p != null) {
			str += p.data;
            if(p.next != null) {
				str += ", ";
            }
				p = p.next;
        }
		return str;
	}
}
