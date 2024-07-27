import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Find Index of 2 elements that sum up to target elements
public class FIndIndexs {
    public static void main (String ar[]) {

        int arr[] = {1,3,2,5,6,5};
        int index1=0;
        int index2=0;

        for(int i=0 ; i<arr.length;i++){

            for (int j=i+1 ; j<arr.length;j++ ){

                if(arr[i]+arr[j]==6){
                   index1=i;
                   index2=j;
                }

            }
        }
        System.out.println("Indices are :" +index1 +" and "+ index2);

        // converting array into list
        int [] a= {2,3,1,4,7,5};

        List li= List.of(Arrays.stream(a).boxed().toArray());

       Collections.min(li);


    }

}
