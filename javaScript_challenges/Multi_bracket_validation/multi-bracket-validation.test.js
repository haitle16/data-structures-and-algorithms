'use strict';

import multiBracketValidation from './multi-bracket-validation.js'

describe('Multi Bracket Validation', () => {
  let a = '{}';
  let b = '()[[Blah Blah Blah]]';
  let c = '(](';

  it('should return true with proper brackets', () => {
    let newTest = multiBracketValidation(b);
    expect(newTest).toBeTruthy;
  });

  it('should return true with proper brackets test 2', () => {
    let newTest = multiBracketValidation(a);
    expect(newTest).toBeTruthy;
  });

  it('should return false with improper brackets', () => {
    let newTest = multiBracketValidation(c);
    expect(newTest).toBeFalsy;
  })
});