import java.util.Scanner;

public class lec5Quicksort{
    //STEP3-CREATE PARTITION FUNCTION
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        //STEP4-PLACE PIVOT ELEMENT
        int temp = arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i; //pivot index
    }
    //STEP2-CREATE QUICKSORT FUNCTION
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pivotidx = partition(arr, low,high);
            quicksort(arr, low, pivotidx-1);
            quicksort(arr, pivotidx+1, high);
        }
    }
    //STEP1-TAKE INPUT
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("ENTER THE ELEMENTS: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("BEFORE SORTING");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");;
        }
        System.out.println();
        System.out.println("AFTER SORTING");
        //STEP5-OUTPUT`
        quicksort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");;
        }
    }
}
