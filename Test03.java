package test01;
//抽象类里可以没有抽象方法，又由于抽象类不能创建对象，所以要想调用抽象类里的普通方法，则普通方法必须用static修饰
abstract class A{
	public static void show(){
		System.out.println("hhhhhhhh");
	}
}
public class Test03 {
public static void main(String[] args) {
	A.show();
}
}
