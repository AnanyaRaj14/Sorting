import java.util.Scanner;
public class selectionSort{
    public static void main(String[] args){
        int[] a = {7, 6, 5, 4, 3, 2};
        System.out.println("elements before sorting:");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        selectionSort(a);
        System.out.println("elements after sorting:");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }



    static void selectionSort(int[] a){
        int n = a.length;
        for(int i = 0; i<n-1; i++){
            int min_index = i;
            for(int j = i+1; j<n; j++){
                if(a[j] < a[min_index]){
                    min_index  = j;
                }
                if(min_index!=i){
                    int temp = a[min_index];
                    a[min_index] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
}