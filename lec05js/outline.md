# 第5讲 ：Web前端开发 JQuery/JavaScript基础
by ZHAO Jing


## JQuery 概述
###  JQuery库
- local mode:``` <script src="jquery.js"></script>```
- CDN mode: ```<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js"></script>```

### JQuery 

```
<script>
$(document).ready(function(){
  $("p").click(function(){
    $(this).hide();
  });
});
</script>
```

### JQuery 
- $("tagName")
- $(".className")
- $("#idName")
- $().parent()
- $().children()
- $().css()
- $().html()
- $().prop()

## JavaScript基本知识
- ES5
- ES6语法