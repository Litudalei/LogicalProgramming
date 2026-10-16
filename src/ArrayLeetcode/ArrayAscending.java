package ArrayLeetcode;

import java.util.Arrays;

public class ArrayAscending {
    static void main() {
        int[] arr1={19,12,13,6,23,};
        for(int i=0;i<arr1.length;i++)
        {
            int temp=0;
            for(int j=0;j< arr1.length-1;j++)
            {
                if(arr1[j]>arr1[j+1])
                {
                    temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));

    }
}
