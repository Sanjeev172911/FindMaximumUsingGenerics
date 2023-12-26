import java.util.Scanner;

public class TestMaximum {
    static Scanner input=new Scanner(System.in);

    public static void findMaximumInteger(){
        System.out.println("Enter the Size of Input : ");
        int size=input.nextInt();
        System.out.println("Enter the elements of Array(Integer) : ");
        Integer []arr=new Integer[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        Generic<Integer> obj=new Generic<>(size,arr);
        System.out.println("Maximum Integer : "+obj.testMaximumInternally());

    }

    public static void findMaximumFloat(){
        System.out.println("Enter the Size of Input : ");
        int size=input.nextInt();
        System.out.println("Enter the elements of Array(Floating) : ");
        Float []arr=new Float[size];
        for(int i=0;i<size;i++){
            arr[i]=input.nextFloat();
        }

        Generic<Float> obj=new Generic<>(size,arr);
        System.out.println("Maximum Flaoting Number : "+obj.testMaximumInternally());

    }

    public static void findMaximumString(){
        System.out.println("Enter the Size of Input : ");
        int size=input.nextInt();
        System.out.println("Enter the elements of Array : ");
        String []arr=new String[size];
        for(int i=0;i<size;i++){
            arr[i]=input.next();
        }

        Generic<String> obj=new Generic<>(size,arr);
        System.out.println("Largest String : " + obj.testMaximumInternally());

    }
    public static void main(String[] args) {

        System.out.println("Type the data type for which u want to find Maximum: ");
        System.out.println("Type 1 for Integer");
        System.out.println("Type 2 for Float");
        System.out.println("Type 3 for String");

        Boolean flag=true;

        while(flag){
            int val=input.nextInt();

            switch (val){
                case 1:{
                    findMaximumInteger();
                    break;
                }

                case 2:{
                   findMaximumFloat();
                   break;
                }

                case 3:{
                   findMaximumString();
                   break;
                }

                default:{
                    flag=false;
                    break;
                }
            }

        }

    }
}

