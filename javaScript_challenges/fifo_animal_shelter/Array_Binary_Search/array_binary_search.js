module.exports = exports =  (arr, num) => {
  var min = 0;
  var max = arr.length - 1;

  while (min <= max) {
    let middleIndex = ((min + max)/2 | 0);
    let currentNumber = arr[middleIndex];
    if (currentNumber === num){
      return middleIndex;
    } else if (currentNumber > num){
      max = middleIndex - 1;
    } else {
      min = middleIndex + 1;
    }
 }
 return -1;
}