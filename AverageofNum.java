public class AverageofNum
{
	public static void main(String[] args) {
       int [] numbers = { 1,5,10,14,20};
       int sum=0;
       double avg;
       System.out.println("calculate sum using for-each loop ");
       for ( int number:numbers){
           sum+=number;   
        }
       avg = ((double)sum/(double)numbers.length);
       System.out.println("Value of Sum is : "+ sum);
       System.out.println("Value of Average is : "+ avg);
    }
}
