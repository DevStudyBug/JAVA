class Main{
    int age;
    Main(int age ){
       age=age; // Ambiguity
    }
    
    public static void main(String [] arg){
        Main obj= new Main(8);
         System.out.println("object reference = " + obj.age );
    }
}
