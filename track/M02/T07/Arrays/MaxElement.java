import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];
		 System.out.println("Enter the array Elemennts: ");
		 for(int i = 0;i <= a.length-1;i++) {
			 a[i] = scan.nextInt();
		 }
		 System.out.println("Enter the array Elemennts: ");
		 for(int i = 0;i <= a.length-1;i++) {
			 System.out.print(a[i] + " ");
		 }
		 int max = a[0];
		 for(int i = 0;i<=a.length-1;i++) {
			 if(a[i] > max) {
				 max = a[i];
			 }
			 
		 }
		 System.out.println();
		 System.out.println("Maximum Element is: " + max);
      scan.close();
	}

}
