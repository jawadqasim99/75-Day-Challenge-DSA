import java.util.*;

public class LinearSearch{

    public static int linerSearch(int numbers[] , int key){
         

        for(int i=0; i<numbers.length ; i++){
            if(numbers[i]== key)
            {
                return i;
            }

        }
        return -1;

    }
    public static void main(String args[]){
int numbers[]={2,3,4,5,2,4};
int key=0;
int index=linerSearch(numbers , key);
if(index == -1){
    System.out.println("Not Found");
}else{
    System.out.println("key is at index: " + index);
}

    }
}