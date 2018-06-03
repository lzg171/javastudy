package workspacejava;

public class TestSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9};
		int i = 5;
		System.out.println(search(a, i));
	}
	public static int search(int[] a,int num) {
		for(int i=0;i<a.length;i++) {
			if(a[i] == num) {
				return i;
			}			
		}
		return -1;
	}

}
