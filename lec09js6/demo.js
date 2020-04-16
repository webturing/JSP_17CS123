let str = "To be or not to be, it is a question."
let words = str.toLowerCase().replace(',', '').replace('.', '').split(' ');
console.log(words);

console.log(words.join());//,
console.log(words.join('-'));//,

let a = "To be or not to be, it is a question.";
console.log(a.toLowerCase());//产生了一个新的字符串副本
console.log(a);//字符串的不可变性
a = a.toLowerCase();//
console.log(a);//字符串的不可变性
console.log(a.replace('e', 'A'));//只替换一次
console.log(a.replace(/e/g, 'A'));//g所有都替换
a = a.replace(/e/g, 'A');
console.log("a=", a);//
console.log(a = a.replace(/a/ig, '***'));//g所有都替换 i 忽略大小写
console.log(a.replace(/\*|,|\./g, ''));// * + . \ （ | ） 是元字符 都需要被转义 正则表达式中的| OR
console.log("a+b".replace(/\+/, ''));
console.log("(a,b)".replace(/\(/, ''));//删除左括号

console.log("AB123123CD78789%^*&^DS".replace(/[0-9]/g, ''));
console.log("AB123123CD78789%^*&^DS".replace(/\d/g, ''));
console.log("AB123123CD78789%^*&^DS".replace(/[^0-9]/g, ''));//not
console.log("AB123123CD78789%^*&^DS".replace(/\D/g, ''));//not digit
// /^$/

a = " To be    or  not  to be, it   is a question11 .  ";
console.log(a = a.toLowerCase().trim());
console.log(a.replace(/\s+/g, ' ').split(' '));
console.log("a+      b".replace(/\s*\+\s*/g, ' '));