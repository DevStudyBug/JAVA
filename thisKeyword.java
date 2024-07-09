class Main{
    int inst;
    Main(int inst ){
        this.inst = inst;
        System.out.println("this reference = " + this );
        System.out.println("this reference = " + this.inst );
    }
    
    public static void main(String [] arg){
        Main obj= new Main(8);
         System.out.println("object reference = " + obj );
        System.out.println("this reference = " + obj.inst );
    }
}
