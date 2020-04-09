let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
console.log(arr);
let arr2 = arr.map(x => 2 * x);//map
console.log(arr2);
let sum = arr.reduce(function (s, y) { //reduce sum,product,max,min
    return s + y;

}, 0);
console.log('sum=', sum);

let max = arr.reduce(function (s, y) { //max
    return s > y?s:y;
}, arr[0]);
console.log('max=', max);


let even = arr.filter((x) => (x % 2 === 0));
console.log('even=', even);

even.reverse();//修改型算法
console.log('even=', even);

arr.sort();//修改型算法，默认是按照转化为字符串的字典序
console.log(arr);

arr.sort((x, y) => (x - y));//数值升序
console.log(arr);

arr.sort((x, y) => (y - x));//数值降序
console.log(arr);

let str = "To be or not to be, it is a question."
let words = str.toLowerCase().replace(',', '').replace('.', '').split(' ');
console.log(words);

console.log(words.join());//,
console.log(words.join('-'));//,