
package test01;
/*
 * (1)定义一个手机类
      行为:打电话,发短信
   
   (2)定义一个接口IPlay
      行为:玩游戏

   (3)定义一个旧手机类继承手机类
      行为:继承父类的行为

   (4)定义一个新手机继承手机类实现IPlay接口
      行为:继承父类的行为,重写玩游戏方法

   (5)定义一个测试类
      在测试类中定义一个 用手机的方法,要求该方法既能接收老手机对象,也能接收新手机对象
      在该方法内部调用打电话,发短信以及新手机特有的玩游戏方法

 */
interface IPlay{
	public void play();
}
abstract class Phone{
	public abstract void call();
	public abstract void sendMessage();
}     
class oldPhone extends Phone{
	public void call(){
		System.out.println("打电话");
	}
	public  void sendMessage(){
		System.out.println("发信息");
	}
}
class newPhone extends Phone implements IPlay{
	public void call(){
		System.out.println("打电话");
	}
	public  void sendMessage(){
		System.out.println("发信息");
	}
	public void play(){
		System.out.println("玩游戏");
	}
}
public class Test02_homework2 {
public static void main(String[] args) {
	usePhone(new oldPhone());
	usePhone(new newPhone());
}
public static void usePhone(Phone p){
	p.call();
	p.sendMessage();
	if(p instanceof newPhone){
		newPhone p1=(newPhone)p;
		p1.play();
	}
	
}
}
