// sum of whole number using Java Recursive function
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   // int n=5; 
	    Scanner Input = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int n = Input.nextInt();
	    int sum=fun(n); 
	    System.out.println("sum is "+sum);
	    Input.close();
	}
	public static int fun (int n){
	     if (n==1){
	       return 1;
	     }
    	else{
	       return n+ fun(n-1);
      }
	 }
}
