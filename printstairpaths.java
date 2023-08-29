import java.util.*;
public class printstairpaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printspaths(n,"");
    


    }
    public static void printspaths(int n , String path){
        if(n<0){
            return;


        }
        if(n==0){
            System.out.println(path);
            return;

        }
        printspaths(n-1, path+"1");
        printspaths(n-2, path+"2");
        printspaths(n-3, path+"3");
    }
}
