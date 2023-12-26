import java.util.Scanner;

public class TestMaximum {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the first Number ");
        Integer number1=input.nextInt();
        System.out.println("Enter the Second Number ");
        Integer number2=input.nextInt();
        System.out.println("Enter the third Number ");
        Integer number3=input.nextInt();

        System.out.println("Maximum among the 3 Number is "+findMaximumInteger(number1,number2,number3));
    }

    private static Integer findMaximumInteger(Integer number1, Integer number2, Integer number3) {
        Integer maximum=number1;

        if(maximum.compareTo(number2)<0){
            maximum=number2;
        }

        if(maximum.compareTo(number3)<0){
            maximum=number3;
        }

        return maximum;

    }

    private static int findMaximum(int number1, int number2, int number3) {
        return number1>number2?(number1>number3?number1:number3):(number2>number3?number2:number3);
    }


}

