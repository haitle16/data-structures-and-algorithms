'use strict'
let HashMap = require('./hashtable.js');

describe('Linked List', () =>{
  let myhash = new Hashmap(14);
  myhash.add('John','Boss');
  myhash.add('Cathy','The Real Boss');
  myhash.add('Zach','Kid 1');
  myhash.add('Allie','Kid 2');
  myhash.add('Rosie','Dog');
  myhash.add('Cat','TA');
  myhash.add('Justin','Student');
  myhash.add('Jason','Student');
  myhash.add('Ben','Student');
  myhash.add('Timea','Student');
  myhash.add('Jen','Student');
  myhash.add('Khalil','Student');
  myhash.add('Michael','Student');
  myhash.add('Ovi','Student');

  it('Find Test', () =>{
    let findTest = myhash.Find('Ovi');
    expect(findTest).toBe("{ Ovi: 'Student' }");
  })

  it('GetHash Test', () =>{
    let findTest = myhash.GetHash('Ovi');
    expect(findTest).toBe(8);
  })

  it('Contain Test', () =>{
    let findTest = myhash.contains('Ovi');
    expect(findTest).toBe(true);
  })

})