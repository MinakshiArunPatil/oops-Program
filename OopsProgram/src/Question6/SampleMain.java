package Question6;
import java.util.Scanner;

public class SampleMain {
	    
	        public static void main(String[] args) {
	             Scanner sc = new Scanner(System.in);
	             System.out.println("Find maximum of 3 ,4 or 5 for n number");
	             int n = sc.nextInt();
	             if (n == 3) {
	                 System.out.println("Enter 3 digit number");
	                 int number = sc.nextInt();
	                 Sample2 sam2 = new Sample2();
	                 sam2.getNumbers(number);
	              }
	             if (n == 4) {
	                 System.out.println("Enter 4 digit number");
	                 int number = sc.nextInt();
	                 Sample3 sam3 = new Sample3();
	                 sam3.getNumbers(number);
	              }
	             if (n == 5) {
	                 System.out.println("Enter n digit number");
	                 int number = sc.nextInt();
	                 Sample4 sam4 = new Sample4();
	                 sam4.getNumbers(number);
	              }
	        }
	        

}
