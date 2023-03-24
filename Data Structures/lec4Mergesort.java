import java.util.*;

public class lec4Mergesort{

    //STEP3-CREATE CONQUER FUNCTION
    public static void conquer(int arr[],int si,int mid,int ei){
        int mergedArr[] = new int[ei-si+1];
        int idx1 = si; //track arr1
        int idx2 = mid+1; //track arr2
        int x = 0; //track mergedArr
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                mergedArr[x++] = arr[idx1++];
            }else{
                mergedArr[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            mergedArr[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            mergedArr[x++]=arr[idx2++];
        }
        //STEP4-mergedArr[] to arr[]
        for(int i=0,j=si;i<mergedArr.length;i++,j++){
            arr[j]=mergedArr[i];
        }
    }

    //STEP2-CREATE DIVIDE FUNCTION
    public static void divide(int arr[], int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String args[]){
        //STEP1-TAKE INPUT
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();;
        }
        System.out.println();
        System.out.println("BEFORE SORTING");
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        //STEP5
        System.out.println();
        System.out.println("AFTER SORTING");
        divide(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}