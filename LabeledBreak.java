public class LabeledBreak {
    public static void main(String[] args) {
        int i;
        first:
        for (i = 1; i < 5; i++) {
            second:
            for (int j = 1; j < 3; j++) {
                System.out.println("value of i = " + i + " value of j = " + j);
                if (i == 2) {
                    break first;
                }
            }
        }
    }
}
