public class Main
{
    //method defined
    private static int getSquare(int x){
	    return x*x;
         
     }
	public static void main(String[] args) {
	    for (int i=1;i<10;i++){
	        //method call 
	        int result=getSquare(i);
		    System.out.println("squar of "+i +" is : "+ result);
	    }
    }
}
