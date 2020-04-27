var s="hello world";
console.log(s.charCodeAt(1));//'a'=97 'A'=65 '0'=48

console.log(String.fromCharCode(97,98,99,100));
console.log(String.fromCharCode(97,98,99,100-32));

//789123=>0789123
//00000000ASCII => 00000000 00000000UNICODE