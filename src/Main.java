import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean palindrome=true;
        int n = sc.nextInt();

        int[][] arr = new int [n][n];
        for (int i=0 ; i<n ; i++)
            for (int j=0 ; j<n ; j++)
                arr[i][j] = sc.nextInt();

        // checks if the rows are palindrome
        for (int i=0;i<n;i++)
            for (int j=0 ; j<= n/2 ; j++)
            {
                if (arr[i][j] == arr[i][n-j-1])
                    continue;
                else
                    palindrome = false;
            }

        // checks if the columns are palindrome
        for (int j=0;j<n;j++)
            for (int i=0 ; i<= n/2 ; i++)
            {
                if (arr[i][j] == arr[i][n-j-1])
                    continue;
                else
                    palindrome = false;
            }
        if (palindrome == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
