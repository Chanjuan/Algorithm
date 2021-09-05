/*
对第一个java程序进行总结
1.java程序编写-编译-运行的过程

2.在一个java源文件中可以声明多个class，但是最多只能有一个类为pulic，且源文件名和public类名保持一致

3.程序的入口是main()方法，格式是固定的

4.输出语句：System.out.println()   换行
			System.out.print()
5.编译的过程：编译以后，会生成一个或多个字节码文件，字节码文件的文件名与java源文件的类名相同


*/

/**
	文档注释
	@author:Charlene
	@version:1.0
	This is my first documentation!
*/

public class HelloWord{
	/*
	Multi-line commnet
	the main method is the entry of a program
	*/
	/**
	Main method is the entry of a program
	*/
	public static void main(String[] args){
		System.out.println("Hello,World!");
	}
}
