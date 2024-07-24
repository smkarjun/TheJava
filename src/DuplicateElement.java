import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElement {

    public static void main(String a[]){
        Set numSet=new HashSet();
        int num[]={1, 2, 3, 4, 5, 2, 6, 7, 8, 3};
        List dupNum=new ArrayList();
        for(int n:num){
            if(!numSet.isEmpty() && numSet.contains(n)){
                dupNum.add(n);
            }else{
                numSet.add(n);
            }

        }

        System.out.println("Dulicate lelements:"+dupNum);


    }
}
