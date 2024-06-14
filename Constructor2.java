public class Main
{    
    private String name;
    Main(){
        System.out.println("constructor is called ! ");
        name = "Java Programmer";
    }
	public static void main(String[] args) {
	    Main obj = new Main();
	    System.out.println ( "hello "+obj.name);
	}
}
