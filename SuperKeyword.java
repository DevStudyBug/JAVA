//Using super to Call Superclass Methods
class animal{
    String name;
    public void display(){
        System.out.println("im parent ");
    }
}

class dog extends animal {
     @Override // override the display method
    public void display (){
        // super.display();
         System.out.println("im child  ");
         super.display(); //it change the sequence   
    }
}

public class Main
{
    
	public static void main(String[] args) {
	    dog labrador = new dog();
	    labrador .display();
	   // animal a = new animal();
	   // a.display();  for accessing superclass
	}
}
