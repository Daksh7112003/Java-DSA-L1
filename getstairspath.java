import java.util.*;

public class getstairspath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add(""); // Adding an empty path for the base case
            return bres; // Return the base case result
        } else if (n < 0) {
            ArrayList<String> bres = new ArrayList<>(); // Creating an empty list for negative cases
            return bres; // Return the empty list
        }

        ArrayList<String> paths1 = getStairPaths(n - 1);
        ArrayList<String> paths2 = getStairPaths(n - 2);
        ArrayList<String> paths3 = getStairPaths(n - 3);

        ArrayList<String> paths = new ArrayList<>();
        for (String path : paths1) {
            paths.add(1 + path);
        }
        for (String path : paths2) {
            paths.add(2 + path);
        }
        for (String path : paths3) {
            paths.add(3 + path);
        }

        return paths;
    }
}
