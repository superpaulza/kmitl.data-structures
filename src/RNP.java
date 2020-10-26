import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class RNP {
    //Reverse Polish Notation (RPN) Calculation
    // Ex. 3 + 8 / (5 - 1) --> infix (Left->Root->Right)
    //              (+)
    //             /   \
    //            3     (/)
    //                 /   \
    //                8     (-)
    //                      /  \
    //                      5   1
    //     3 8 5 1 - / +    --> postfix (Left->Right->Root)
    //     R1: 5 1 - = 4
    //     R2: 8 / 4 = 2
    //     R3: 3 + 2 = 5
    public static void main(String[] args) {
        String rpn = (new Scanner(System.in)).nextLine();
        MyStackA stack = new MyStackA();
        StringTokenizer st = new StringTokenizer(rpn," ");
        while(st.hasMoreTokens()) {
            String t = st.nextToken();
            if(t.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a+b);
            }
            else if (t.equals("-")) {
                
            }
            else if (t.equals("*")) {
                
            }            
            else if (t.equals("/")) {
                
            }
            else {
                stack.push(Integer.parseInt(t));
            }
            System.out.println("The answer is :" + stack.pop());

        }
    }
}
