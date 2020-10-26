public class MyStackA {
    //implement with Array
    int size = 100;
    int stack[] = new int[size];
    int n = 0;
    
    boolean isEmpty() {
        return n == 0;
    }

    boolean isFull() {
        return n == size;
    }

    void push(int data) {
        stack[n++] = data;
    }

    int pop() {
        return stack[--n];
    }
    int top() {
        return stack[n-1];
    }
    //
}
