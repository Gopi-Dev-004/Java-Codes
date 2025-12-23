import java.util.Arrays;

public class MergeSort {
/* // step 1
    public static int[] mSort(int[] arr, int[] brr){

        int al = arr.length;
        int bl = brr.length;
        int cl = al+bl;

        int[] crr = new int[cl];

        int i=0 , j=0, k=0;

        while (i<al && j<bl){

            if(arr[i]<brr[j]){
                crr[k] = arr[i];
                i++;
                k++;
            }else {
                crr[k] = brr[j];
                j++;
                k++;
            }
        }
        while (i<al){
            crr[k] = arr[i];
            i++;
            k++;
        }
        while (j<bl){
            crr[k] = brr[j];
            j++;
            k++;
        }

        return crr;
    }
    public static void main(String[] args) {
        int[] arr ={1,3,7,9};
        int[] brr ={1,2,5,6};

        System.out.println(Arrays.toString(mSort(arr,brr)));

    }
*/

    // step 2
    public static void mSort(int[] arr, int start, int mid, int end) {

        int[] crr = new int[end];

        int i = start, j = mid, k = start;

        while (i < mid && j < end) {

            if (arr[i] < arr[j]) {
                crr[k] = arr[i];
                i++;
                k++;

            } else {
                crr[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i < mid) {
            crr[k] = arr[i];
            i++;
            k++;

        }
        while (j < end) {
            crr[k] = arr[j];
            j++;
            k++;

        }

        for (int itr = start; itr < end; itr++) {
            arr[itr] = crr[itr];
        }


    }

    public static void mergeSort(int[] arr, int start, int end){

        if(end-start == 1)return;

        int mid = (start+end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        mSort(arr, start, mid, end);
    }


    public static void main(String[] args) {
        int[] arr = {5,2,9,1};
        int end = arr.length;
        mergeSort(arr, 0,  end);
        System.out.println(Arrays.toString(arr));

    }
}
