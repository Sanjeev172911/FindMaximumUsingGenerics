import java.util.Scanner;

public class TestMaximum {
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Maximum among 3 Integer is "+findMaximum(32,1,9)+" at 1st position");
        System.out.println("Maximum among 3 Integer is "+findMaximum(3,1110,9)+" at 2nd position");
        System.out.println("Maximum among 3 Integer is "+findMaximum(3,1,93)+" at 3rd position");
        System.out.println();
        System.out.println("Maximum among 3 float is "+findMaximum(13.2F,4.67F,.89F)+" at 1st position");
        System.out.println("Maximum among 3 float is "+findMaximum(3.2F,4.67F,.89F)+" at 2nd position");
        System.out.println("Maximum among 3 float is "+findMaximum(3.2F,4.67F,23.89F)+" at 3rd position");
        System.out.println();
        System.out.println("Maximum among 3 String is "+findMaximum("Peach","Apple","Banana")+" at 1st position");
        System.out.println("Maximum among 3 String is "+findMaximum("Banana","Peach","Apple")+" at 2nd position");
        System.out.println("Maximum among 3 String is "+findMaximum("Apple","Banana","Peach")+" at 3rd position");
    }

    private static <T extends Comparable<T>> T findMaximum(T first,T second,T third){
        T maximum=first;

        if(maximum.compareTo(second)<0) maximum=second;
        if(maximum.compareTo(third)<0) maximum=third;

        return maximum;
    }

}

