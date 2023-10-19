import java.io.IOException;
import java.util.Scanner;

public class PrimaryClass {
    public static void main(String[] args)throws IOException {
        Scanner Scanner = new Scanner(System.in);
        float firstNumber;
        float secondNumber;


        System.out.printf("Please enter the first number:");
        firstNumber = Scanner.nextInt();
        System.out.printf("Please enter the second number:");
        secondNumber = Scanner.nextInt();

//        This is all the operations and calculation
        float Sum = firstNumber + secondNumber;
        float Product = firstNumber * secondNumber;
        float Difference = firstNumber - secondNumber;
        float Quotient = firstNumber / secondNumber;

        System.out.println("/////RESULT/////");
        System.out.printf("\nThis is the result Sum of the numbers %.2f ",Sum);
        System.out.printf("\nThis is the result of the product of the numbers %.2f" , Product);
        System.out.printf("\nThis is the result of the difference of the numbers %.2f", Difference);
        System.out.printf("\nThis is the result of the division of the numbers %.2f ",  Quotient);

    }
}
