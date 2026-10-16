package ArrayLeetcode;

import javax.management.MBeanAttributeInfo;
import java.util.Arrays;

public class RemoveDuplicatesDEMO {
    static void main() {
        int[] arr2={10,20,20,30,30,40,50,60};
        int j=0;
        int newarray[]=new int[arr2.length];
        for(int i=1;i<arr2.length;i++)
        {
            if(arr2[i]!=arr2[j])
            {
                j++;
                arr2[j]=arr2[i];
            }
        }
        for(int k=0;k<=j;k++)
        {
            newarray[k]=arr2[k];
        }
        System.out.println(Arrays.toString(newarray));
        System.out.println("old array");
        System.out.println(Arrays.toString(arr2));

    }





}
