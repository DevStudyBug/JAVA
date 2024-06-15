public class Main{
   int i;
   private Main(){
    //Constructor with no parameter
   i =9;
   System.out.println("Constructor is called ");
}
    	public static void main(String[] args) {
	    //calling Constructor without parameter
	    Main obj = new Main();
		System.out.println("value of i is "+obj.i);
	    }
}
