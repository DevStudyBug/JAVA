// constructor overloading in java
// java method overloading
public class Main
{  
   String lang;
   Main(){
       // keyword this is refrence of abject
       this.lang = "java";
       
   }
     Main(String lang){
       this.lang = lang;
   }
   
    public void getName(){
    System.out.println("programming language "+this.lang);

    }
	public static void main(String[] args) {
	    Main obj1 = new Main();
	    Main obj2 = new Main("Python");
	    obj1.getName();
	    obj2.getName();
	    }
	}

