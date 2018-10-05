function reversedArr (arr) {
  let reversed = [];
  for(i=0; i<= arr.length-1; i++){
    let x = (arr.length-1) -i;
    reversed.push(arr[x].valueOf());
  }
  return reversed;
}