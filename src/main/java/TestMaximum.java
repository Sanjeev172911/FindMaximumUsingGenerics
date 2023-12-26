import java.util.Scanner;

public class TestMaximum {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the first NUmber ");
        int number1=input.nextInt();
        System.out.println("Enter the Second NUmber ");
        int number2=input.nextInt();
        System.out.println("Enter the third NUmber ");
        int number3=input.nextInt();

        System.out.println("Maximum among the 3 Number is "+findMaximum(number1,number2,number3));

    }

    private static int findMaximum(int number1, int number2, int number3) {
        return number1>number2?(number1>number3?number1:number3):(number2>number3?number2:number3);
    }
}
