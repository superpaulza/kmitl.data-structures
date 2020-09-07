
public class MyArray {
	int S = 100;
	int a[] = new int[S];
	int n = 0;
	
	void add(int data) {
		a[n++] = data;
	}
	
	void insert(int data, int index) {
		for (int i = n; i > index; i--) {
			a[i] = a[i-1];
		}
		a[index] = data;
		n++;
	}
	
	int find(int data) {
		for (int i = 0; i < S; i++) {
			if (a[i] == data) return i;
		}
		return -1;
	}
	
	void delete(int index) {
		a[index] = a[--n];
	}
	
	void deleteA(int index) {
		for (int i = index; i < n-1; i++) {
			a[i] = a[i+1];
		}
		n--;
	}
	
	boolean IsFull(int data) {
		return n==S;
	}
	
	boolean IsEmpty(int data) {
		return n==0;
	}
	
	String toString(int data) {
		String st = "[";
		if (n>0) st+=a[0];
		for (int i = 1; i < n; i++) {
			st+=","+a[i];
		}
		st+="]";
		return st;
	}
	
	public static void main(String[] args) {
	
	}
	
	

}
