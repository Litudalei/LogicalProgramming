package ArraysExercise;

import java.util.Arrays;

public class JaggedArray {
    static void main() {
        int[][] jagged=new int[3][];
        int[] a1={12,13,14};
        int[] a2={};
        int[] a3={14,15};
        jagged[0]=a1;
        jagged[1]=a2;
        jagged[2]=a3;
        System.out.println(Arrays.deepToString(jagged));
        for(int i=0;i<jagged.length;i++)
        {
            for(int j=0;j<jagged[i].length;j++)
            {
                System.out.print(jagged[i][j]+" ");
            }
            System.out.println();
        }
    }
}
