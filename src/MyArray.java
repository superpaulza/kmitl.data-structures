
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
		
	}
	
	void delete(int index) {
		
	}
	
	void deleteA(int index) {
		
	}
	
	boolean IsFull(int data) {
		
	}
	
	boolean IsEmpty(int data) {
		
	}
	
	String toString(int data) {
		
	}
	
	public static void main(String[] args) {
	}
	
	

}
