println "Groovy 学习"
println "第一次输入"
println "带分号输入";
println ("带括弧和分号输入");

// 定义变量
def i = 18;
println i;

def s = "dake"
println(s);

// 定义 list
def list = ['a', 'b']
list << 'c'
println(list.get(2))

// 定义 map
def map = ['key1':'value1', 'key2':'value2']
// 向 map 中添加键值对
map.key3 = 'value3'
// 打印 key3 的值
println map.get('key3')

// groovy 的闭包
// 什么是闭包？闭包就是一段代码块。在 gradle 中我们主要是把闭包当参数来使用。
def b1 = {
	println "hello b1"
}

// 定义一个方法，方法里面需要闭包类型的参数
def method1(Closure closure) {
	closure()
}

// 调用方法 method1
method1 (b1)