'use strict';

const Stack = require('./stack-and-queues.js');
const Queue = require('./queues.js');

// let s = new Stack();

// s.push(1);
// s.push(2);
// s.push(3);
// s.push(4);

// console.log(s);

// console.log(s.pop());
// console.log(s.peek());

// console.log(s.pop(), s);
// console.log(s.pop(), s);
// console.log(s.pop(), s);
let x = new Queue();

x.enqueue(1);
x.enqueue(2);
x.enqueue(3);
x.enqueue(4);
console.log(x);

x.dequeue();
// x.dequeue();
// x.dequeue();
// x.dequeue();


console.log(x);
