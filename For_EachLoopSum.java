// calculate Sum of all elements of an array
public class Main
{
	public static void main(String[] args) {
       int [] numbers = { 1,5,10,14,20};
       int sum=0;
       System.out.println("calculate sum using for-each loop ");
       
       for ( int number:numbers){
           sum+=number;   
           }
           System.out.println("Value of Sum is : "+ sum);
    }
}
