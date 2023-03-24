import java.util.*;

public class lec1Sorting {

    public static void pritArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        //1.BUBBLE SORT - works by repeatedly swapping the adjacent elements if they are in the wrong order.
        //Time complexity = 0(n^2)
        // for(int i=0;i<size-1;i++){
        //     for(int j=0;j<size-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }

        //2.SELECTION SORT - The algorithm repeatedly selects the smallest (or largest) element from the unsorted portion of the list and swaps it with the first element of the unsorted portion. This process is repeated for the remaining unsorted portion of the list until the entire list is sorted.
        //Time Complexity = O(n^2)
        // for(int i=0;i<size-1;i++){
        //     int smallest = i;
        //     for(int j=i+1;j<size;j++){
        //         if(arr[j]<arr[smallest]){
        //             smallest = j;
        //         }
        //     }
        //     int temp =arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;
        // }

        //3.INSERTION SORT - The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.
        // for(int i=1;i<size;i++){
        //     int current = arr[i];
        //     int j =i-1;
        //     while(j>=0 && arr[j]>current){
        //         arr[j+1]=arr[j];
        //         j--;
        //     }
        //     arr[j+1]=current;
        // }
        for(int i=1;i<size;i++){
            int current  = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        pritArr(arr);
    }
}
