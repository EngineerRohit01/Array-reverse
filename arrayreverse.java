import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the size");
        int size = input.nextInt();
        
        int[] arr = new int[size];
        
        int i = 0;
        while(i<arr.length){
            System.out.print("enter the no "+(i+1)+": ");
            arr[i] = input.nextInt();
            i++;
        }
        
        reverse(arr);
        
        System.out.print("Reersed array is: ");
        
        i =0;
        while(i<arr.length){
            System.out.println(arr[i]);
            i++;
        }
        
    }
    
    public static void reverse(int[] arr){
        int i = 0;
        while(i<arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = swap;
            i++;
        }
    }
}
