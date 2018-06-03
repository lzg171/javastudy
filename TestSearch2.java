package workspacejava;//¶þ·Ö·¨ËÑË÷

public class TestSearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,15};
		int value=12;
		System.out.println( binarySearch(a, value) );
	}
	public static int binarySearch(int[] a,int num) {
		int startPos=0;
		int endPos=a.length-1;
		int m=(startPos + endPos)/2;
		if(a.length == 0) {
			return -1;
		}
		while(startPos <= endPos) {
			if(a[m] == num) {
				return m;
			}
			if(a[m] < num) {
				startPos = m+1;				
			}
			if(a[m] > num) {
				endPos = m-1;				
			}
			m = (startPos + endPos)/2;
		}
		return -1;
	}

}
