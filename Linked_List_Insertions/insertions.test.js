'use strict';

let LL = require('./insertions.js');

describe('Linked List', () => {

    it('constructor()', () => {
        let list = new LL();
        expect(list.head).toBeNull();
    });

    it('append() functional test', () => {
        let list = new LL();
        let initialValue = 'First One';
        list.append(initialValue);
        expect(list.head.value).toEqual(initialValue);

        let newValue = 'Soemthing Else';
        list.append(newValue);
        expect(list.head.value).toEqual(initialValue);

        let anotherOne = 'Another One';
        list.append(anotherOne);
    });
    it('prepend() functional test', () => {
        let lists = new LL();
        let firstValue = 'First Value';
        lists.prepend(firstValue);
        let secondValue = 'Second Value';
        lists.prepend(secondValue);
        expect(secondValue).toEqual(lists.head.value);
    });
    it('insertAfter() functional testing', () => {
        let list = new LL();
        let val = 7;
        let newVal = 13;
        list.insertAfter(val, newVal);
        expect(list.head.value).toBe(13);

    });
    it('insertBefore() functional test', () => {
        let list = new LL();
        let val = 1000;
        let newVal = 999;
        list.insertBefore(val, newVal);
        expect(list.head.value).toBe(999);
    });

});