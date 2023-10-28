import java.util.*;

public class DP13ArrangeBuildingDP{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
//     int dpBuilding[]= new int[n+1];
//    int dpSpace[]= new int[n+1];


//     dpBuilding[2]=1;
//     dpSpace[2]=1;
    

//     for(int i = 2  ; i <=n ; i++){
//         dpBuilding[i]= dpSpace[i-1];
//         dpSpace[i]= dpBuilding[i-1]+dpSpace[i-1];
//     }


// System.out.println((dpBuilding[n]+dpSpace[n] ) * (dpBuilding[n]+dpSpace[n] )  );




 /// other way




 int olderbuilding = 1 ; 
 int olderspace = 1 ; 
 for(int i = 2  ; i <=n ; i++){
    int newBuilding= olderspace;
    int newSpace = olderbuilding + olderspace; 
    olderbuilding = newBuilding;
    olderspace = newSpace;

 }
int total = olderbuilding+ olderspace;
total=total*total;


 System.out.println(total);
}

}

