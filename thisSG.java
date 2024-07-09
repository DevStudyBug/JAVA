//This with Getters and Setters 
class Main {
    // Private field
   String name;
    // Setter method for name
     void setName(String name) {
        this.name = name;
    }

// Getter method for name
  String getName() {
        return name;
    }
    
    public static void main(String[] args) {
        Main obj = new Main();
        obj.setName("John");          // Using setter to set the name
        System.out.println(obj.getName()); // Using getter to get the name
    }
}
