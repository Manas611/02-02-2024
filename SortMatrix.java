import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortMatrix {
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

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ans.add(arr[i][j]);
            }
        }

        Collections.sort(ans);

        System.out.println(ans);


    }
}
