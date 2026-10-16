package ArraysExercise;

public class AdditionArray {
    static void main() {
        int [][]arr1={{1,2},{3,4},{5,6}};
        int [][]arr2={{9,8},{7,6},{5,4}};
        int[][] sumArray=new int [3][2];
        int rows= arr1.length;
        int columns=arr1[0].length;
        for(int i=0;i< arr1.length;i++)
        {
            for(int j=0;j<arr1[0].length;j++)
            {
                sumArray[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(sumArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
