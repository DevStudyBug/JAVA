class Main {   
        //method with no parameter()
        public void display1(){
            System.out.println("Method without parameter");
        }
        //method with single parameter
        public void display2(int a){
            System.out.println("Method with parameter");
        }
    	public static void main(String[] args) {
	    //create an object
	    Main obj = new Main();
	    obj.display1();
	    obj.display2(5);
	}
