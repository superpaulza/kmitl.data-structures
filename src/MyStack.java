import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        
    }

    //implement with printBinary
    void printBinary(int n) {
        Stack s = new Stack();
        while(n>0) {
            s.push(n%2);
            n/=2;    
        }
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    

}
