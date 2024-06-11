public class labeledContinue {
    public static void main(String[] args) {
        int i;
        first:
        for (i = 1; i < 5; i++) {
            second:
            for (int j = 1; j < 3; j++) {
                System.out.println("value of i = " + i + " value of j = " + j);
                if (i == 2) {
                    continue first;
                }
            }
        }
    }
}

//output 
/*value of i = 1 value of j = 1
value of i = 1 value of j = 2
value of i = 2 value of j = 1
value of i = 3 value of j = 1
value of i = 3 value of j = 2
value of i = 4 value of j = 1
value of i = 4 value of j = 2*/
