# Trees
<!-- Short summary or background information -->

## Challenge
<!-- Description of the challenge -->
* Binary Tree
    * Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.
* Binary Search Tree
    * Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
    * Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
* First approach was iterating through the trees and comparing values for the desired return values.
* After doing more research about recursive methods, then start implementing recursively and the code was much cleaner and much less.

## API
<!-- Description of each method publicly available in each of your trees -->
* getSize method, recursively iterate through the tree and return the appropriate size.
* inOrder method, recursively iterate through the tree and return an integer array with "Left - Root - Right" traversal.
* preOrder method, returns "Root - Left - Right"
* postOrder method, return "Left - Right - Root"
* add method, adding integer value to the Binary Search Tree with its appropriate location.
* contains method, return true or false if the element exist within the Binary Search Tree.

## Test
* Can successfully instantiate an empty tree
* Can successfully instantiate a tree with a single root node
* Can successfully add a left child and right child to a single root node
* Can successfully return a collection from a preorder traversal
* Can successfully return a collection from an inorder traversal
* Can successfully return a collection from a postorder traversal


