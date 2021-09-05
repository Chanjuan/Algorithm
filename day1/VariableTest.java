/*
1.java定义变量的格式：数据类型 变量名 = 变量值；

2.说明
	1.变量必须先声明，后使用
	2.变量都定义在其作用域内。在作用于内，它是有效的
	3.同一个作用域内，不可以声明两个同名的变量
*/

class VariableTest{
	public static void main(String[] args) {
		int myAge = 12; //声明并赋值变量
		System.out.println(myAge);

//		System.out.println(myNumber);编译发生错误，因为使用myNumber之前并未对其进行定义
		int myNumber;//声明变量
//		System.out.println(myNumber); 编译发生错误，因为使用myNumber前没有对其进行赋值
		myNumber = 1;//对变量进行赋值
		System.out.println(myNumber);
	}
}

