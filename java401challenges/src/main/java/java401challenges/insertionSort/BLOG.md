#Insertion Sort

##### Insertion sort is a simple sorting algorithm that allows for efficient, in-place sorting of the array, one element at a time. 

### Pseudocode

    InsertionSort(int[] arr)
      
        FOR i = 1 to arr.length
        
          int j <-- i - 1
          int temp <-- arr[i]
          
          WHILE j >= 0 AND temp < arr[j]
            arr[j + 1] <-- arr[j]
            j <-- j - 1
            
          arr[j + 1] <-- temp


### Trace
Sample Array: [8, 4, 23, 42, 16, 15]

##### Pass 1:
* First iteration through the Insertion sort we declared i, j, and temp and evaluate the values as follows
    * i = 1, j = 1,temp = 4
* Inside the while loop we evaluate to see if j greater than 0 and temp is less than the number before it ( 4 < 8 ). If the condition are true then we swap the 2 numbers, decrement j and recheck the condition.
* At the end of this iteration, the array should return [4, 8, 23, 42, 16, 15]

##### Pass 2: 