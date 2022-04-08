# Ajax请求

## 	1.什么是Ajax

AJAX 即“Asynchronous Javascript And XML”（异步 JavaScript 和 XML），是指一种创建交互式网页应用的网页开发技术。

ajax 是一种浏览器通过 js 异步发起请求，局部更新页面的技术。 

Ajax 请求的局部更新，浏览器地址栏不会发生变化 

局部更新不会舍弃原来页面的内容

## 2.JQuery中的Ajax请求

**2.1$.ajax 方法 **

url ：表示请求的地址 

type ：表示请求的类型 GET 或 POST 请求 

data：表示发送给服务器的数据 

格式有两种： 

​		一：name=value&name=value 

​		二：{key:value} 

success ：请求成功，响应的回调函数 

dataType ：响应的数据类型 

常用的数据类型有： 

​			text 表示纯文本 

​			xml 表示 xml 数据 

​			json 表示 json 对象

**2.2$.get 方法和$.post 方法 **

url：请求的 url 地址 

data：发送的数据 

callback： 成功的回调函数 

type ：返回的数据类型 

**2.3$.getJSON 方法**

url：请求的 url 地址 

data： 发送给服务器的数据 

callback： 成功的回调函数 

#  JQuery

## 1.jQuery的属性操作

html() ：它可以设置和获取起始标签和结束标签中的内容。 

​				跟 dom 属性 innerHTML 一样。 

text() ：它可以设置和获取起始标签和结束标签中的文本。 

​				跟 dom 属性 innerText 一样。 

val() ：它可以设置和获取表单项的 value 属性值。 

## 2.DOM的增删改

内部插入：

appendTo()	 用法：a.appendTo(b) 

​						把 a 插入到 b 子元素末尾，成为最后一个子元素

prependTo()	用法：a.prependTo(b) 

​						把 a 插到 b 所有子元素前面，成为第一个子元素 

外部插入：

insertAfter()	用法：a.insertAfter(b) 

​						得到 ba 

insertBefore()	用法：a.insertBefore(b) 

​						得到 ab 

替换：

replaceWith()	用法：a.replaceWith(b) 

​						用 b 替换掉 a 

replaceAll()	用法：a.replaceAll(b) 

​						用 a 替换掉所有 b 

删除：

remove()	用法：a.remove(); 

​						删除 a 标签 

empty()	用法：a.empty(); 

​						清空 a 标签里的内容



## 3.CSS样式操作

addClass()：添加样式 

removeClass()：删除样式 

toggleClass() ：有就删除，没有就添加样式。 

offset() ：获取和设置元素的坐标

## 4.JQuery动画

addClass() 

添加样式 

removeClass() 

删除样式 

toggleClass() 

有就删除，没有就添加样式。 

offset() 

获取和设置元素的坐标。 

**7****、****jQuery** **动画** 

**基本动画** 

show() ：将隐藏的元素显示 

hide() ：将可见的元素隐藏。 

toggle() ：可见就隐藏，不可见就显示。 

以上动画方法都可以添加参数。 

1、第一个参数是动画 执行的时长，以毫秒为单位 

2、第二个参数是动画的回调函数 (动画完成后自动调用的函数) 

**淡入淡出动画** 

fadeIn() ：淡入（慢慢可见） 

fadeOut() ：淡出（慢慢消失） 

fadeTo() ：在指定时长内慢慢的将透明度修改到指定的值。0 透明，1 完成可见，0.5 半透明 

fadeToggle()：淡入/淡出 切换

