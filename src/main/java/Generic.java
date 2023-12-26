public class Generic <T extends Comparable<T>>{
    private Object []input;
    int size;
    Generic(int n,T []arr){
        this.input=new Object[n];
        for(int i=0;i<n;i++){
            this.input[i]=arr[i];
        }
    }

    public T testMaximumInternally(){
        return testMaximum(input);
    }

    private T getElement(int index){
        return (T) input[index];
    }

    private T testMaximum(Object []input){
        T maximum=this.getElement(0);
        for(int i=0;i<input.length;i++){
            if(maximum.compareTo(this.getElement(i))<0) maximum=this.getElement(i);
        }

        return maximum;
    }

}