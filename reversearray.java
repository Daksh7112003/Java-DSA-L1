import java.util.*;
public class reversearray{
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        System.out.println("orginal array:");
        printArray(array);
        reverseArray(array);
        System.out.println("reverse array");
        printArray(array);
    }
    public static void reverseArray(int[]array){
        int start=0; 
        int end= array.length-1;

        while(start<end){
            int temp=array[start];
            array[start] = array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }
    public static void printArray(int[]array)
{
    for(int i =0 ; i<array.length; i++){
        System.out.println(array[i]+" ");
    }
    System.out.println();
}
}