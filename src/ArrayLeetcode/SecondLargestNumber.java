package ArrayLeetcode;

public class SecondLargestNumber {
    static void main() {
        int []arr1={10,22,23,15,24,55,11};
        int max=0;
        int secondMax=0;
        if(arr1[0]>arr1[1])
        {
            max=arr1[0];
            secondMax=arr1[1];
        }
        else {
            max=arr1[1];
            secondMax=arr1[0];
        }
        for(int i=2;i<arr1.length;i++)
        {
            if(arr1[i]>max)
            {
                secondMax=max;
                max=arr1[i];
            }
            else if (arr1[i]>secondMax) {
                secondMax=arr1[i];

            }

        }
        System.out.println("the second largest element in the array is = "+secondMax);
        }

    }


