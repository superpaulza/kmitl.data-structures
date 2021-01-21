
public class Main {

	public static void main(String[] args) {
		/*MyPriorityQueue a = new MyPriorityQueue();
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		a.enqueue(4);
		a.enqueue(5);
		a.enqueue(6);
		a.enqueue(7);
		//a.enqueue(6);
		a.printAll();
		a.dequeue();
		a.printAll();
		a.swap(3, 5);
		a.dequeue();
		a.printAll();*/
		BinarySearchTree a = new BinarySearchTree();
		a.add(5);
		a.add(10);
		a.add(2);
		a.add(3);
		a.remove(10);
		a.print();
	}

}
