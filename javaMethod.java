//declaration of java method
public class javaMethod
{   
    int add(int a, int b){
        int sum= a+b ;
        return sum;
    }
	public static void main(String[] args) {
	    int n1=20;
	    int n2=30;
	    javaMethod obj = new javaMethod();
	    int result = obj.add(n1,n2);
		System.out.println("Result is: "+ result);
	}
}
