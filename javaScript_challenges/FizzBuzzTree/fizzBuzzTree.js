'use strict'

let FizzBuzzTree = tree =>{
  let arr = []
  for(let i=0; i<=tree.length-1; i++){
    if(i % 3 === 0 && i % 5 === 0){
      arr.push("FizzBuzz");
    }
    else if (i % 3 === 0){
      arr.push("Fizz");
    }
    else if (i % 5 === 0) {
      arr.push("Buzz");
    }
    else arr.push(tree[i]);;
  }
  return arr;
}

console.log(FizzBuzzTree([7,52,32,48,46,57,963,145,247,25,37]));
console.log(FizzBuzzTree([2,37,52,36,45,856,124,568,12]));
console.log(FizzBuzzTree([12,32,54,78,963,447,154,364,123]));
module.exports = FizzBuzzTree;