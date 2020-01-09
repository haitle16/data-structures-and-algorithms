'use strict'

const array_shift = require('./array_shift.js');

describe('array_shift_test', () =>{
  it('Proper input test ', () => {
    let oldArr = [1,3,7,9];
    let testingAdd = array_shift(oldArr, 5);
    expect(testingAdd).toEqual([1,3,5,7,9]);
  });
  it('Test that new array length is one more than old array', () => {
    let oldArr = [1,3,7,9];
    let testingAdd = array_shift(oldArr, 5);
    expect(testingAdd.length).toEqual(oldArr.length+1);
  });
  it('Empty Array Test', () => {
    let oldArr = [];
    let testingAdd = array_shift(oldArr, 5);
    expect(testingAdd).toEqual([]);
  });

});