
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10, firstElement = 0, secondElement = 1;
		
		for(int i=1;i<n;i++) {
			System.out.print(firstElement+", ");
			int nextNumber = firstElement + secondElement;
			firstElement = secondElement;
			secondElement = nextNumber;
		}
		
	}

}
