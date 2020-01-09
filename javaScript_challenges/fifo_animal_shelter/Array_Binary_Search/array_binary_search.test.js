'use strict';

const arrBinarySearch = require('./array_binary_search.js');


describe('Array Binary Search', () =>{
  it('Input test', () =>{
    let testArr = [1,2,3,4,5,6,7,8,9,10,11,12]
    let inputTest = arrBinarySearch(testArr, 11);
    expect(inputTest).toEqual(10);
  });
  it('Checking if input is empty Array', () =>{
    let testArra = [];
    let itest = arrBinarySearch(testArra, 0);
    expect(itest).toBe(-1 || null);
  });
  // it('Input test', () =>{

  // });
  // it('Input test', () =>{

  // });
});