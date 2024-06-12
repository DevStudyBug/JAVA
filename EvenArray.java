// PRINT THE even numbers OF 2D ARRAY
public class EvenArray{
	public static void main(String[] args) {
	    int [][] a={
	        { 1,-2,3},
	        {-4,-5,6,9},
	        {7},
	    };
	    for (int i =0;i<a.length;i++){
	    	 for (int j =0;j<a[i].length;j++)  { 
	    	      if (a[i][j]%2==0){
                      System.out.println("Even numbers are : " +a[i][j]);
	                }
              }
        }
   }
}
