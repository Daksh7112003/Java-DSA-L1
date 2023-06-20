import java.util.*;
public class differenceofarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n1 = sc.nextInt();
        int a1[] = new int[n1];
         for(int i = 0; i<a1.length;i++){
            a1[i]=sc.nextInt();

         }
         int n2= sc.nextInt();
         int a2[]= new int[n2];
for(int i = 0 ; i<a2.length;i++){
    a2[i] =sc.nextInt();
}
int diff[]= new int[n2];
int c = 0 ;
int i = a1.length -1;
int j = a2.length -1;
int k = diff.length-1;
while(k>=0){

    int d=0;
    if(a2[j]+c>=a1[i]){
        d=a2[j]+c-a1[i];
        c=0;
    }
    else{
        d=a2[j]+c+10-a1[i];
        c=-1;

    }
    diff[k]=d;
    i--;
    j--;
    k--;


}
int idx=0;
while(idx<diff.length){
    if(diff[idx]== 0 ){
        idx++;

    }
    else{
        break;
    }
}
while(idx<diff.length){
System.out.println(diff[idx]);
idx++;
}

        
    }
}
