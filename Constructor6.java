//Constructor without parameter and with parameter
public class Main{
    String language;   
    Main(String lang){
    language=lang;
    System.out.println("parameterized Constructor is called and language is " + language);
    }

    public static void main(String[] args) {
    
	Main obj1 = new Main("java");
	Main obj2 = new Main("python");
	Main obj3 = new Main("c++");

	}
}
