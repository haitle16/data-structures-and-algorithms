package java401challenges.quickSort;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right) {
        if(left < right) {
            int position = Partition(arr, left, right);
            quickSort(arr, left, position - 1); // Sort the left side of pivot'ed position
            quickSort(arr, position + 1, right);// Sort the right side

        }
    }
    public static int Partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int low = left - 1;
        for (int i = left; i <= right; i++ ) {
            if(arr[i] < pivot) {
                low++;
                Swap(arr, i, low);
            }
        }
        Swap(arr, right, low + 1);
        return low + 1;
    }

    public static void Swap(int[] arr, int i, int low) {
        int temp = arr[i];
        arr[i] = arr[low];// made the swap accordingly to the pivot's location
        arr[low] = temp;
    }
}
