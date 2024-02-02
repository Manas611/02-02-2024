import java.util.Scanner;

public class SumOfZero {
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

        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j] == 0)
                {
                    if(i!=0 && arr[i-1][j] == 1)
                    {
                        cnt++;
                    }
                    if(j!=m-1 && arr[i][j+1] == 1)
                    {
                        cnt++;
                    }
                    if(i!=n-1 && arr[i+1][j] == 1)
                    {
                        cnt++;
                    }
                    if(j!=0 && arr[i][j-1] == 1)
                    {
                        cnt++;
                    }
                    
                }
            }
        }
        System.out.println(cnt);
    }
}
