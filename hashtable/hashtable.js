'use strict';
const util = require('util');
const LL = require('./linkedList.js');

class Hashmap {

  constructor(size) {
    this.size = size;
    this.map = new Array(size);
  }

  hash(key) {
    let letters = key.split('');
    let num = letters.reduce((p,n) => {
      let code = n.charCodeAt(0);
      let total = p + code;
      return total;
    },0) % this.size;
    return num;
  }

  add(key,value) {
    let hash = this.hash(key);
    console.log(hash, key, value);

    // Please use a LL instead of an array!
    if(! this.map[hash] ) { this.map[hash] = new LL(); }

    // We used an object here, but this could be anything...
    this.map[hash].append({[key]:value});
  }

  /**
   * Find a key in the hashmap and return its value
   * @param key
   * @return {string}
   */
  Find(key) {

    let hash = this.hash(key);
    let position = this.map[hash];
    let value = position.head.value
    console.log(value, ' Stored in Bucket', hash);
    return value;



    // console.log('FIND', position);
  }

  /**
   * Delete a key from the map
   * @param key
   */
  contains(key) {

  }

  /**
   * Take in a key and return the position of the key stored in.
   */
  GetHash(key) {
    let hash = this.hash(key);
    if(hash){
      return hash;
    }
  }

  // serialize() {

  // }

  // deserialize() {

  // }

}

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

let findTest = myhash.Find('Ovi');
console.log('FIND TEST',findTest);
let GetHashTest = myhash.GetHash('Ovi');
console.log('GETHASH  TEST', GetHashTest);

console.log(util.inspect(myhash,{showHidden:false,depth:null}));