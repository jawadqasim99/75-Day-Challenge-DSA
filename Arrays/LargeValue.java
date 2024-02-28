import java.util.*;
public class LargeValue {
    public static int largeValue(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smalLeast=Integer.MAX_VALUE;
        for(int i=0 ; i<numbers.length ; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smalLeast > numbers[i] ){
                smalLeast=numbers[i];
            }
        }
        System.out.println("Largest value is " + smalLeast);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,45,6,7};
        System.out.println("Largest Value is " + largeValue(numbers));

    }
}
