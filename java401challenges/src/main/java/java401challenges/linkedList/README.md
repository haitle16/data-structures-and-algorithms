# Singly Linked List
<!-- Short summary or background information -->

## Challenge
<!-- Description of the challenge -->
* Define a method called insert which takes any value as an argument and adds a new node with that value to the head of the list with an O(1) Time performance.
* Define a method called includes which takes any value as an argument and returns a boolean result depending on whether that value exists as a Node’s value somewhere within the list.
* Define a method called toString which takes in no arguments and returns a string representing all the values in the Linked List, formatted as:
  "{ a } -> { b } -> { c } -> NULL"
* Define a method called mergeLists which take two Linked Lists as arguments, zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
* Insert Method
  * Approached by creating a new node with its head equal the given value.
  * Time: O(1)
  * Space: O(n)
* Includes Method
  * Traversing the whole Linked List and return true if given value is found.
  * Time: O(n)
  * Space O(n)
* toString Method
  * Using StringJoiner to return a string with all the nodes in the Linked List.
  * Time: O(n)
  * Space: O(n)
* Append Method
  * Approached by creating a new node with given value, than traverse to the last node and insert the node there.
  * Time: O(n)
  * Space: O(n)
* InsertBefore Method
  * While traversing through the Linked List, check condition if next value of current node is equal to value, than add the newValue into that spot and reroute the current node. 
  * Time: O(n)
  * Space: O(n)
* InsertAfter Method
  * Similar to the InsertBefore Method but instead of checking the next value of current node, check for the current node value.
  * Time: O(n)
  * Space: O(n)
* kthFromEnd Method
  * Approached by saving 2 variables currentNode and lastNode, than move the last node over kth spot. Finally iterate over the Linked List moving currentNode and lastNode 1 by 1. Once the next last node hits end of LL, return the currentNode value.
  * Time: O(n)
  * Space O(n)
* mergeList Method
  * Approached by saving 2 temp variables that save the next node of each lists. Than linked next node to the other list and linked it back to the temp node.

## API
<!-- Description of each method publicly available to your Linked List -->
* Insert Method
* Includes Method
* toString Method
* Append Method
* InsertBefore Method
* InsertAfter Method
* kthFromEnd Method
* mergeList Method