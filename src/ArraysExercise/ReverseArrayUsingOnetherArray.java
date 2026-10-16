package ArraysExercise;

import java.util.Arrays;

public class ReverseArrayUsingOnetherArray {
    static void main() {
        int[] arr={10,20,30,40,50};
        int[] revArray=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            revArray[j]=arr[i];
            j++;
        }
        System.out.println("reversed array is storing new Array :"+ Arrays.toString(revArray));
        System.out.println(Arrays.toString(arr));
    }
}
