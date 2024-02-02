import java.util.*;

public class SetMatrixZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int a = sc.nextInt();
                arr[i][j] = a;
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j] == 0)
                {
                    // mark row
                    for(int k=0;k<m;k++)
                    {
                        if(arr[i][k]!=0)
                            arr[i][k] = -1;
                    }

                    //mark col
                    for(int k=0;k<n;k++)
                    {
                        if(arr[k][j] != 0)
                            arr[k][j] = -1;
                    }
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j] == -1)
                    arr[i][j] = 0;   
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
