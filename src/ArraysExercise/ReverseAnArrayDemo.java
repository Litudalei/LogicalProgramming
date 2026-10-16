package ArraysExercise;

import java.util.Arrays;

public class ReverseAnArrayDemo {
    static void main() {
        int[] arr={10,20,30,40,50};
        int temp=0;
        int first=0;
        int last= arr.length-1;
        while(first<last)
        {
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }

        System.out.println("-----after reversing-------");
        System.out.println(Arrays.toString(arr));
    }
}
