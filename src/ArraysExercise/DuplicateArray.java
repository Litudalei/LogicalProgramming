package ArraysExercise;

import java.util.HashSet;

public class DuplicateArray {
    static void main() {
        int[] arr1={10,20,30,10,40,10,20,20,60};
        HashSet<Integer> hasharr=new HashSet<>();
        HashSet<Integer> duplicates=new HashSet<>();
        for(int num:arr1)
        {
            if(!hasharr.add(num))
            {
                duplicates.add(num);
            }
        }
        System.out.println(duplicates.toString());
    }
}
