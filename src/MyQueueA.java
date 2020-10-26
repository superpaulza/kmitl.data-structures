public class MyQueueA {
   //implement with Array
    int size = 100;
    int queue[] = new int[size];
    int first = 0,last;

    void enqueue(int data) {
        if(!isFull()) {
            queue[last++] = data;
            if(last == size) last = 0;
        }
    }
    
    int dequeue() {
        int d = queue[first];
        if(isEmpty()) first = (first + 1) % size;
        return d; 
    }

    boolean isEmpty() {
        return first == last;
    }

    boolean isFull() {
        return first == ((last + 1) % size);
    }
   //
}
