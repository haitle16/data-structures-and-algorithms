'use strict'

let repeatedWord = str =>{
  let arr = str.split(' ');
  for(let i = 0; i< arr.length-1; i++){
    for(let j= i+1; j< arr.length-1; j++){
      if(arr[i] === arr[j]) {
        return arr[i];
      }
    }
  }
  // if there are no reapeated word in the string
  return 'No repeated words found';
}

export default repeatedWord;