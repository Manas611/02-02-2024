import java.util.Scanner;

public class PrintingD {
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

        int k = 0;
        int l = 0;

        for(int i=0;i<n;i++)
        {
            l = 0;
            for(int j=0;j<m;j++)
            {
                if(l+k < m)
                    System.out.print(arr[l][l+k]+" ");
                l++;
            }
            k++;
            System.out.println();
        }
    }
}
