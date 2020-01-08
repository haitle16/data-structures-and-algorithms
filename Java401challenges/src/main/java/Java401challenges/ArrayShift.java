package Java401challenges;

import java.util.Arrays;

public class ArrayShift {
  public static void main(String[] args) {
    int [] arrTest = {1,2,3,4,5,6};
    mid(arrTest, 9);
  }

  public static int[] mid(int [] arr, int num){
    int[] newArr = new int[arr.length+1];
    int index = 0;
    int middle =(int)Math.ceil(((arr.length+1)/2));
      for(int i =0; i < arr.length; i++ ){
      if (index == middle){
          newArr[middle]= num;
          index = middle +1;
          i = i-1;
      }
      else if(index != middle){
          newArr[index] = arr[i];
          index++;
      }
  }
  System.out.println(Arrays.toString(arr)+ num);
  System.out.println(Arrays.toString(newArr));
  return (int[]) newArr;
}
}
