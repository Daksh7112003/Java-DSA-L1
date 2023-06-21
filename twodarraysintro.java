import java.util.*;
public class twodarraysintro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        int[][]arr = new int[n][m];
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0; j<arr.length ; j++){
arr[i][j]=sc.nextInt();
            }

        }
        for(int i = 0 ; i<arr.length; i++){
            for(int j = 0 ; j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
