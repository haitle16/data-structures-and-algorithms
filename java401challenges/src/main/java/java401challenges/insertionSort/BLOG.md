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
* i = 2, j = 1, temp = 23
* Second pass through we evaluate temp to the last value at current position j. In this case 23 is greater than so it would just skip the while loop.

##### Pass 3: 
* i = 3, j = 2, temp = 42
* Third pass through we evaluate temp to the last value at current position j. Temp is greater than so it just skip through.

##### Pass 4:
* i = 4, j = 3, temp = 16
* Fourth pass through temp is less than the previous value, which is 42. 16 and 42 "swapped". Than it decrement j and check if 16 i less than 23, which is true so it "swap" again.

##### Pass 5:
* i = 5, j = 4, temp = 15
* On its last iteration through the for loop, pass 5 evaluate temp to the its previous value which is 42. Than it get "swap" and do the comparison again with 23 "swap", than 16 and "swap"

![](./assets/insertionSort.jpg)