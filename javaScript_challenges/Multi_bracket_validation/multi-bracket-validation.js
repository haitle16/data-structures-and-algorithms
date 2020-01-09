'use strict';

let  multiBracketValidation = (string) => {

  let correctBracket = '[]{}()',
    stack = [],
    character;

  for(let i=0; character = string[i]; i++){
    let bracePosition = correctBracket.indexOf(character);
    if(bracePosition === -1) {
      continue;
    }else if(bracePosition % 2 === 0) {
      stack.push(bracePosition + 1);
    } else {
      if(stack.pop() !== bracePosition) {
        return false;
      }
    }
  }
  return stack.length === 0;

}

export default multiBracketValidation;