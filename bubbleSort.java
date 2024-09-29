import java.util.Scanner;
public class bubbleSort{
    public static void main(String[] args){
        int[] arr = {7, 6, 5, 4, 3, 2};
        System.out.println("elements before sorting:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        bubbleSort(arr);
        System.out.println("elements after sorting:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }



    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}