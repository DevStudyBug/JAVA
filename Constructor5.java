//Constructor without parameter and with parameter
public class Main{
    Main(){
    System.out.println("no arg Constructor is called ");
    }   
    Main(int a){
    System.out.println(" arg Constructor is called ");
    }
  public static void main(String[] args) {
	Main obj1 = new Main();
	Main obj2 = new Main();
	Main obj3 = new Main(10);
	}
}
