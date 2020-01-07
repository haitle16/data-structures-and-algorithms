'use strict';

let LL = require('./kthReverse.js');

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
    it('kth_from_end functional test 1', () => {
        let lists = new LL();
        let value1 = 1;
        let value2 = 2;
        let value3 = 3;
        let value4 = 4;
        let value5 = 5
        lists.append(value1);
        lists.append(value2);
        lists.append(value3);
        lists.append(value4);
        lists.append(value5);
        let reverse = lists.kth_from_end(0)
        expect(reverse).toBe(5);
    });
    it('kth_from_end functional test 2 ', () => {
        let lists = new LL();
        let value1 = 1;
        let value2 = 2;
        let value3 = 3;
        let value4 = 4;
        let value5 = 5
        lists.append(value1);
        lists.append(value2);
        lists.append(value3);
        lists.append(value4);
        lists.append(value5);
        let reverse = lists.kth_from_end(10)
        expect(reverse).toBe('Exception');
    });
    it('kth_from_end functional testing 3 ', () => {
        let lists = new LL();
        let value1 = 'Hi';
        let value2 = 'How';
        let value3 = 'Are';
        let value4 = 'You';
        let value5 = '?'
        lists.append(value1);
        lists.append(value2);
        lists.append(value3);
        lists.append(value4);
        lists.append(value5);
        let reverse = lists.kth_from_end(4)
        expect(reverse).toBe('Hi');
    });
});