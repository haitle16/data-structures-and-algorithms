'use strict'

module.exports = exports = (arr, number) => {
  let newArray = [];
  let midIndex = Math.round(arr.length/2);
  for (var i = 0; i < arr.length; i++) {
    if(i < midIndex){
      newArray[i] = arr[i];
    }
    else if( i >= midIndex){
      newArray[midIndex] = number;
      newArray[i+1] = arr[i];
    }
  }
  return newArray;
};


// let oldArr = [1,3,5,7,9,13,15,17,19,21];
// function reverseArray(arr, number) {
//   let newArray = [];
//   let midIndex = Math.round(arr.length/2);
//   for (var i = 0; i < arr.length; i++) {
//     if(i < midIndex){
//       newArray[i] = oldArr[i];
//     }
//     else if( i >= midIndex){
//       newArray[midIndex] = number;
//       newArray[i+1] = oldArr[i];
//     }
//   }
//   return newArray;
// };
// reverseArray(oldArr, 11);
