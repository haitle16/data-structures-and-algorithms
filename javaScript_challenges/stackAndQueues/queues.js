'use strict';

const Node = require('./node.js');

class Queues{
  constructor(){
    this.back = null;
    this.length = 0;
  }

  enqueue(value){
    let node = new Node(value);
    node.next = this.back;
    this.back = node;
    this.length ++;
    return this;
  }

  dequeue(){
    let currVal = this.back;
    while(currVal.next && currVal.next.next){
      currVal = currVal.next;
    }
    let fnode = currVal.next;
    currVal.next = null;
    this.length --;
    console.log(fnode);
    return fnode;
  }
}
module.exports = Queues;