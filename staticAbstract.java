package test01;
abstract class Book{
	public abstract  void print();
	
	//static修饰的抽象内部类是一个外部类，即子类继承时，只需要重写该抽象内部类的方法即可
	static abstract class CD{
		public abstract void get();
	}
}
//抽象内部类可以用抽象外部类类名 . 抽象内部类类名来调用内部抽象类，因为用static修饰后，变成类相关，也属于外部类的一个部分
class JavaCD extends Book.CD{
	public void get(){
		System.out.println("i want to get a basketball!!!!");
	}
}
public class staticAbstract {
public static void main(String[] args) {
	Book.CD cd=new JavaCD();
	cd.get();
	
	
}
}
