import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Arrayrotate {
    public static void main(String ar[]) {

        List<Integer> arList = new ArrayList<>();
        arList.add(20);
        arList.add(30);
        arList.add(40);
        arList.add(50);

        int d = 2;

        int arrSize = arList.size();

        int a[] = new int[arrSize];
        for (int i = 0; i < arList.size(); i++)
            a[i] = arList.get(i);

        // Storing rotated version of array
        int temp[] = new int[arrSize];

        // Keeping track of the current index
        // of temp[]
        int k = 0;

        // Storing the n - d elements of
        // array arr[] to the front of temp[]
        for (int i = d; i < arrSize; i++) {
            temp[k] = a[i];
            k++;
        }

        // Storing the first d elements of array arr[]
        //  into temp
        for (int i = 0; i < d; i++) {
            temp[k] = a[i];
            k++;
        }

        // Copying the elements of temp[] in arr[]
        // to get the final rotated array
        for (int i = 0; i < arrSize; i++) {
            a[i] = temp[i];
        }

        List<Integer> ll = List.of(Arrays.stream(a).boxed().toArray(Integer[]::new));

        System.out.println(ll);

    }
}
