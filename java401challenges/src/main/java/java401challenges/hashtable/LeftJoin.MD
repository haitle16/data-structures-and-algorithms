# Hashmap LEFT JOIN
<!-- Short summary or background information -->

Implement a left join on two hashmaps

## Challenge
<!-- Description of the challenge -->
* Write a function that LEFT JOINs two hashmaps into a single data structure.
* The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
* The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
* Combine the key and corresponding values (if they exist) into a new data structure according to LEFT JOIN logic.
* LEFT JOIN means all the values in the first hashmap are returned, and if values exist in the “right” hashmap, they are appended to the result row. If no values exist in the right hashmap, then some flavor of NULL should be appended to the result row.
* The returned data structure that holds the results is up to you. It doesn’t need to exactly match the output below, so long as it achieves the LEFT JOIN logic.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
* Approached by iterating over HashMap one and HashMap two and check to see if the key of HashMap 1 exist within Hashmap 2. Then put the result in a array of arraylists.

## Solution
<!-- Embedded whiteboard image -->
![](../../../../../assets/left-join.jpg)