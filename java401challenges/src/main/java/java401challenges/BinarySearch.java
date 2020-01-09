package java401challenges;

public class BinarySearch {

    public static int binSearch (int [] arr, int num){
        int start = 0;
        int finish = arr.length - 1;
        int mid = (start + finish) / 2;
        while(start <= finish ){
            if(arr[mid] < num) { start = mid +1;}
            else if (arr[mid] == num) return mid;
            else finish = mid -1;
            mid = (start + finish)/2;

        }
        return -1;
    }
}
