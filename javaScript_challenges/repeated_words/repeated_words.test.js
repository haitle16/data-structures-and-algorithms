'use strict';

import repeatedWord from './repeated_words.js';

describe('repeated-word test', () => {
  let string1 = "Happy birthday to you, happy birthday to you, happy birthday dear so and so, happy birthday to you";
  let string2 = "This will be the string that doesnt have any mathces";
  let string3 = '';

  it('test for correct answer', () => {
    let newTest = repeatedWord(string1);
    expect(newTest).toEqual('birthday');
  });

  it('test for no matches', () => {
    let newTest = repeatedWord(string2);
    expect(newTest).toEqual('No repeated words found');
  });

  it('test for empty string', () => {
    let newTest = repeatedWord(string3);
    expect(newTest).toEqual('No repeated words found');
  });

})