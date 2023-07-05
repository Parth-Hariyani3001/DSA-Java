public class MergeSort{
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;  //To get mid
        mergeSort(arr, si, mid); //left part
        mergeSort(arr, mid+1, ei); //Right part
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[],int si, int mid,int ei){
        //left(0,3) = 4  right(4,6) = 3  ->  6-0+1 = 7
        int tempArr[] = new int[ei - si + 1];
        int i = si; //iterator for left part
        int j = mid + 1; //iterator for right part
        int k = 0;  //iterator for temp array

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                tempArr[k] = arr[i];
                i++;   
            }   
            else {
                tempArr[k] = arr[j];
                j++;      
            }
            k++;
        }
        //Agar left part me kuch bacha hia
        while(i <= mid){
            tempArr[k++] = arr[i++];
        }
        //Agar right part me kuch bacha hai
        while(j <= ei){
            tempArr[k++] = arr[j++];
        }
        //copy temporary array to the original array
        for(k = 0,i = si; k < tempArr.length ;k++,i++){
            arr[i] = tempArr[k];
        }
    }
    public static void main(String args[]){
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}