'use strict';

const Node = require('./node.js');

class Stack {
  constructor(){
    this.top = null;
  }

  push(value){
    let node = new Node(value);
    node.next = this.top;
    this.top = node;
  }

  pop(){
    let pNode = this.top;
    this.top = this.top.next;
    return pNode;
  }

  peek(){
    return this.top.value;
  }
}


module.exports = Stack;
