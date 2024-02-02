import java.util.Scanner;

public class Search {

    public static boolean SearchR(int i,int m,int x,int[][] arr)
    {
        System.out.println("I value is " + i);
        for(int j=0;j<m;j++)
        {
            if(arr[i][j] == x)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean SearchC(int j,int n,int x,int[][] arr)
    {
        System.out.println("J value is " + j);
        for(int i=0;i<n;i++)
        {
            if(arr[i][j] == x)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = 8;

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
            if((arr[i][m-1] >= x) && (arr[i][0] <= x))
            {
                //search in row
                if(SearchR(i,m,x,arr) == true)
                {
                    System.out.println("true");
                }
            }
        }


        for(int j=0;j<m;j++)
        {
            if((arr[0][j] <= x) && (arr[n-1][j] >= x))
            {
                if(SearchC(j,n,x,arr) == true)
                {
                    System.out.println("true");
                }
            }
        }

        System.out.println("False");
    }
}
