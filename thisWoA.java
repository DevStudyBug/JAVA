class Main{
    int age;
    Main(int age ){
       this.age=age; // Without Ambiguity
    }
    
    public static void main(String [] arg){
        Main obj= new Main(8);
         System.out.println("object reference = " + obj.age );
    }
}
