public class BinarySearchTree {
    class TNode {
        int data;
        TNode parent = null, left = null, right = null;
        public TNode(int d) {
            data = d;
            parent = left = right = null;
        }
    }

    TNode root = null;

    void add(int d) {
        if(root == null) {
            root = new TNode(d);
        } else {
            addR(root, d);
        }
    }

    void addR(TNode p,int d){
        if(d < p.data){
            if(p.left == null)
            {
                p.left = new TNode(d);
                p.left.parent = p;
            }
            else addR(p.left,d);
        }
        else {
            if(p.right == null) {
                p.right = new TNode(d);
                p.right.parent = p;
            }
            else addR(p.right,d);
        }
    }

    void remove(int d) {
        TNode t = new TNode(d+1);
        t.left = root;
        root.parent = t;
        removeR(t, d);
    }

    void removeR(TNode t, int d) {
        if(t == null) return;
        if(d < t.data) {
            removeR(t.left, d);
        } else if (d > t.data) {
            removeR(t.right, d);
        } else {
            if(t.left == null || t.right == null) {
                TNode q = (t.left == null) ? t.right:t.left;
                if(q != null) q.parent = t.parent;
                if(t == t.parent.left) t.parent.left = q;
                else t.parent.right = q;
            } else {
                TNode p = maxP(t.left);
                swap(p, t);
            }
        }
    }

    TNode maxP(TNode p) {
        while(p.right != null)
        p = p.right;
        return p;
    }

    void swap(TNode p, TNode q) {
        int temp = p.data;
        p.data = q.data;
        q.data = temp;
    }

    /*void print() {
        System.out.println("== BST ==");
        TNode p = root;
        //print left
        System.out.println("Left: ");
        while(p != null) {
            System.out.print(p.data);
            p = p.left;
            if(p != null) System.out.print(", ");
        }
        System.out.println();
        //print right
        p = root;
        System.out.println("Right: ");
        while(p != null) {
            System.out.print(p.data);
            p = p.right;
            if(p != null) System.out.print(", ");
        }
	}*/

}
