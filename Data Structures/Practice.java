import java.util.*;

public class Practice{
    //MERGE SORT
    // public static void conquer(int arr[],int si,int mid,int ei){
    //     int marr[]=new int[ei-si+1];
    //     int i1=si; //track arr1
    //     int i2 = mid+1; //track arr2       
    //     int x=0;
    //     while(i1<=mid&&i2<=ei){
    //         if(arr[i1]<=arr[i2]){
    //             marr[x++]=arr[i1++];
    //         }else{
    //             marr[x++]=arr[i2++];
    //         }
    //     }
    //     while(i1<=mid){
    //         marr[x++]=arr[i1++];
    //     }
    //     while(i2<=ei){
    //         marr[x++]=arr[i2++];
    //     }
    //     for(int i=0,j=si;i<marr.length;i++,j++){
    //         arr[j]=marr[i];
    //     }
    // }
    // public static void divide(int arr[],int si, int ei){
    //     if(si>=ei){
    //         return;
    //     }
    //     int mid=si+(ei-si)/2;
    //     divide(arr, si, mid);
    //     divide(arr, mid+1, ei);
    //     conquer(arr,si,mid,ei);
    // }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i = low-1; //for spaces
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                // swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pivotidx=partition(arr,low,high);
            quicksort(arr, low, pivotidx-1);
            quicksort(arr, pivotidx+1, high);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("BEFORE SORTING");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("AFTER SORTING");
        // divide(arr,0,n-1);
        quicksort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}