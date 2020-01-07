'use strict'
const FizzBuzzTree = require('./fizzBuzzTree.js')

describe('fizz-buzz-tree.js', () => {

  let test1 = [7,52,32,48,46,57,963,145,247,25,37];
  let test2 = [2,37,52,36,45,856,124,568,12];
  let test3 = [12,32,54,78,963,447,154,364,123];


  it('test for correct output', () => {
    let outputArr = FizzBuzzTree(test1)
    let solutionArr = [ 'FizzBuzz',
    52,
    32,
    'Fizz',
    46,
    'Buzz',
    'Fizz',
    145,
    247,
    'Fizz',
    'Buzz' ];
    expect(outputArr).toEqual(solutionArr);

  });

  it('output test 2', () => {
    let outputArr = FizzBuzzTree(test2)
    let solutionArr = [ 'FizzBuzz', 37, 52, 'Fizz', 45, 'Buzz', 'Fizz', 568, 12 ];
    expect(outputArr).toEqual(solutionArr);
  });

  it('array output test', () => {
    let outputArr = FizzBuzzTree(test3)
    let solutionArr = [ 'FizzBuzz', 32, 54, 'Fizz', 963, 'Buzz', 'Fizz', 364, 123 ];
    expect(outputArr).toEqual(solutionArr)
  });
});