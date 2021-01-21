class MyPriorityQueue {
    int SIZE = 100;
	int n = 0;
	int heap[] = new int[SIZE];
	
	//enqueue
	void enqueue (int d) {
		int p = n++;
		heap[p] = d;
		while ((p > 0) && (heap[p] < heap[(p-1)/2])) {
			swap(p,(p-1)/2);
		}
	}

	void swap (int i, int j) {
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
    }
	
	//dequeue
	int dequeue() {
		int d = heap[0];
		heap[0] = heap[--n];
	    int p = 0, q;
	    while (true) {
		    int left = 2*p+1;
		    int right = 2*p+2;
		    //no child
		    if (n < right) return d;
		    //one child
		    if (n == right) {
			q = left;
		    //two childs
		    } else {
				if (heap[left] < heap[right]) {
					q = left;
				} else {
					q = right;
				}
			    //q = heap[left] < heap[right] ? left:right;
		    }
	    if (heap[p] < heap[q]) return d;
	    swap(p, q);
	    p = q;
	    } //while
	}
	
    void printAll() { 
		System.out.print("[");
		if (n > 0) System.out.print(heap[0]);
		for(int i = 1; i < n ; i++) {
			System.out.print(", "+ heap[i]);
		}
		System.out.println("]");
    } 
}