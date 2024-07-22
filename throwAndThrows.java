public class Main {
    public static void main(String[] args) {
        try {
            int result = division(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
  
    public static int division(int n1, int n2) throws ArithmeticException {
        if (n2 == 0) {
            throw new ArithmeticException("You can't enter zero as input here...");
        }
        return n1 / n2;
    }
}
