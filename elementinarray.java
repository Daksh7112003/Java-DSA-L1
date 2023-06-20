import java.util.*;
public class elementinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ;i <a.length; i++){
            a[i]= sc.nextInt();


        }
        int idx=-4; // your choice put anything ........
        int data = sc.nextInt();
        for (int i = 0 ;i<a.length;i++){
            if(data==a[i]){
                idx=i;
                break;


            }
        }
        System.out.println(idx);
    }
}
