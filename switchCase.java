import java.util.Scanner;
public class switchCase 
{
	public static void main(String[] args) {
	System.out.println("Choose an operator +,-,*,/,%,^ : ");
	Scanner op = new Scanner(System.in);
	char operator = op.next().charAt(0);
    System.out.println("Choose number1 ");
    int num1 = op.nextInt();
    System.out.println("Choose number2 ");
    int num2 = op.nextInt();
    int result;
        switch(operator){
            case '+':
                result = num1 + num2;
                 System.out.println("Result : " + result);
                break;
            case '-':
                result = num1 - num2 ;
                System.out.println("Result : " + result);
                break;
            case '*':
                result = num1 * num2 ;
                System.out.println("Result : " + result);
                break;
            case '/':
                result = num1 / num2 ;
                System.out.println("Result : " + result);
                break;
            case '%':
                result = num1 % num2 ;
                System.out.println("Result : " + result);
                break;
            case '^':
                result = num1 ^ num2 ;
                System.out.println("Result : " + result);
                break;
            default:
             System.out.println(" Invalid operator" );
             break;
        }	
	}
}
