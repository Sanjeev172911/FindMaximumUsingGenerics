import java.util.Scanner;

public class TestMaximum {
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Maximum among 3 Integer is "+findMaximumInteger(32,1,9)+" at 1st position");
        System.out.println("Maximum among 3 Integer is "+findMaximumInteger(3,1110,9)+" at 2nd position");
        System.out.println("Maximum among 3 Integer is "+findMaximumInteger(3,1,93)+" at 3rd position");
        System.out.println();
        System.out.println("Maximum among 3 float is "+findMaximumFloat(13.2F,4.67F,.89F)+" at 1st position");
        System.out.println("Maximum among 3 float is "+findMaximumFloat(3.2F,4.67F,.89F)+" at 2nd position");
        System.out.println("Maximum among 3 float is "+findMaximumFloat(3.2F,4.67F,23.89F)+" at 3rd position");
        System.out.println();
        System.out.println("Maximum among 3 String is "+findMaximumString("xyz","abc","sanjeev")+" at 1st position");
        System.out.println("Maximum among 3 String is "+findMaximumString("abc","pqrts","mno")+" at 2nd position");
        System.out.println("Maximum among 3 String is "+findMaximumString("a","ab","abc")+" at 3rd position");
    }

    private static String findMaximumString(String first, String second, String third) {
        String maximum=first;

        if(maximum.compareTo(second)<0)maximum=second;
        if(maximum.compareTo(third)<0) maximum=third;

        return maximum;
    }

    private static Float findMaximumFloat(Float v, Float v1, Float v2) {
        Float maximum=v;

        if(maximum.compareTo(v1)<0) maximum=v1;
        if(maximum.compareTo(v2)<0) maximum=v2;

        return maximum;
    }

    private static Integer findMaximumInteger(Integer number1, Integer number2, Integer number3) {
        Integer maximum=number1;

        if(maximum.compareTo(number2)<0) maximum=number2;
        if(maximum.compareTo(number3)<0) maximum=number3;

        return maximum;
    }

    private static int findMaximum(int number1, int number2, int number3) {
        return number1>number2?(number1>number3?number1:number3):(number2>number3?number2:number3);
    }


}

