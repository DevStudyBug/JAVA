// write java program to create private constructor 
class Test{
  // create private Constructor
   private Test(){
   System.out.println("This is private Constructor ");
   }
   // public static Method
   public static void instanceMethod(){
       Test obj = new Test();
   }
}
    class Main {
	public static void main(String[] args) {
	 //call instanceMethod
	Test.instanceMethod();
    }
}
