const BinarySearchTree = require('trees/bt.js');

describe('Binary Search Tree', () => {
  it('checking the output of pre order', ()=>{
    let tree = new BinarySearchTree();
    let values = [9, 4, 17, 3, 6, 22, 5, 7, 20];
    values.map(val => tree.insert(val));
    expect(tree.preOrder()).toEqual([ 9, 4, 3, 6, 5, 7, 17, 22, 20 ])
  });
  it('checking the output of post order', ()=>{
    let tree = new BinarySearchTree();
    let values = [9, 4, 17, 3, 6, 22, 5, 7, 20];
    values.map(val => tree.insert(val));
    expect(tree.postOrder()).toEqual([ 3, 5, 7, 6, 4, 20, 22, 17, 9 ])
  });
  it('checking the output of in order', ()=>{
    let tree = new BinarySearchTree();
    let values = [9, 4, 17, 3, 6, 22, 5, 7, 20];
    values.map(val => tree.insert(val));
    expect(tree.inOrder()).toEqual([ 3, 4, 5, 6, 7, 9, 17, 20, 22 ])
  });
  it('checking the output of breathFirst', ()=>{
    let tree = new BinarySearchTree();
    let values = [9, 4, 17, 3, 6, 22, 5, 7, 20];
    values.map(val => tree.insert(val));
    expect(tree.levelOrder()).toEqual([ 9, 4, 17, 3, 6, 22, 5, 7, 20 ])
  });
  it('checking the output of breathFirst with boolean', ()=>{
    let tree = new BinarySearchTree();
    let values = [7, 26, 27,false, 37, 46, 25,true, 57, 63, 95];
    values.map(val => tree.insert(val));
    expect(tree.levelOrder()).toEqual(values)
  });
  it('checking the output of breathFirst with strings', ()=>{
    let tree = new BinarySearchTree();
    let values = [27,42,' ',52,84,65,74,'hi',12,36,48,24,63];
    values.map(val => tree.insert(val));
    expect(tree.levelOrder()).toEqual(values)
  });

})