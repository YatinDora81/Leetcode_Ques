import java.util.*;

public class Merge_Sort {
    public static void main(String[] args) {
        int arr[] = {5,1,321,84,94,65,1,654,9874,98,47946,1,31,3};
        mergeSort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int arr[] , int l ,int r){
        if(l>=r) return;
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);

        mergeArray(arr , l , mid , r);
    }
    public static void mergeArray(int arr[],int l,int mid,int r){
        int i = l;
        int j = mid + 1;
        int dummy[] = new int[r-l+1];
        int k = 0;
        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                dummy[k] = arr[i];
                i++;
                k++;
            }
            else if(arr[i]>arr[j]){
                dummy[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            dummy[k] = arr[i];
            i++;
            k++;
        }
        while(j<=r){
            dummy[k] = arr[j];
            j++;
            k++;
        }

        for(int m = 0;m<dummy.length;m++){
            arr[m+l] = dummy[m];
        }


    }
}
