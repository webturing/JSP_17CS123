function add(a,b) {
    return a+b;

}

alert(add(3,4));
alert(add("hello","world"));


var sub=function (a,b) {
    return a-b;

}
console.log(sub(3,4));


//一次性函数，没有变量名，调用一次就失效

document.write(
    (
        function(a,b){
            return a*b;
        }
    )(3,4)

);
//ES5

//ES6 let const lambda函数

//const div=((x,y)=>(x/y));

