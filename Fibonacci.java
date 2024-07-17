public class Main
{
	public static void main(String[] args) {
 	    int n=10; 
        for (int i =0; i<=n ;i++){
             int sum= fibo(i);
             System.out.println("fibonacci number is "+sum); // System.out.print(sum + " ");
        }
	}
         
    public static int fibo (int n){
 	     if (n<=1){
 	         return n ;
 	     }else {
 	         return fibo(n-1)+fibo (n-2);
 	     }
    }
}

