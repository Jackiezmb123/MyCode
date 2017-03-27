package test01;
/*多态分为：对象多态和方法多态(方法的重载就是一种外在表示)
      
      隐藏：顾名思义，就是父类中方法不想让子类重写，利用static修饰符可以达到隐藏
               若父类方法没有用static修饰的话，当子类实例化父类时，调用的是子类重写的方法
*
*
*/
class F{
	public static void show(){
		System.out.println("你重写不了我，哈哈");
	}
}
class Z extends F{
	public static void show(){
		System.out.println("我就不信重写不了你！！！哼");
	}
}
public class hide {
public static void main(String[] args) {
	//向上转型(对象多态型，方便后续维护)
	F f=new Z();
	f.show();
	
    F.show();
    Z.show();
}
}
