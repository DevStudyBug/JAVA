// Solution 1: Making the fact method static
public class Main {
    static int fact(int num) {
        if (num != 0) {
            return num * fact(num - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int num = 4;
        int result = fact(num);
        System.out.println("Factorial of " + num + " is " + result);
    }
}

/* Solution 2: Creating an instance of the Main class
public class Main {
    int fact(int num) {
        if (num != 0) {
            return num * fact(num - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int num = 4;
        int result = obj.fact(num);
        System.out.println("Factorial of " + num + " is " + result);
    }
} */
