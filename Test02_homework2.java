
package test01;
/*
 * (1)����һ���ֻ���
      ��Ϊ:��绰,������
   
   (2)����һ���ӿ�IPlay
      ��Ϊ:����Ϸ

   (3)����һ�����ֻ���̳��ֻ���
      ��Ϊ:�̳и������Ϊ

   (4)����һ�����ֻ��̳��ֻ���ʵ��IPlay�ӿ�
      ��Ϊ:�̳и������Ϊ,��д����Ϸ����

   (5)����һ��������
      �ڲ������ж���һ�� ���ֻ��ķ���,Ҫ��÷������ܽ������ֻ�����,Ҳ�ܽ������ֻ�����
      �ڸ÷����ڲ����ô�绰,�������Լ����ֻ����е�����Ϸ����

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
		System.out.println("��绰");
	}
	public  void sendMessage(){
		System.out.println("����Ϣ");
	}
}
class newPhone extends Phone implements IPlay{
	public void call(){
		System.out.println("��绰");
	}
	public  void sendMessage(){
		System.out.println("����Ϣ");
	}
	public void play(){
		System.out.println("����Ϸ");
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
