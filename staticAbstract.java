package test01;
abstract class Book{
	public abstract  void print();
	
	//static���εĳ����ڲ�����һ���ⲿ�࣬������̳�ʱ��ֻ��Ҫ��д�ó����ڲ���ķ�������
	static abstract class CD{
		public abstract void get();
	}
}
//�����ڲ�������ó����ⲿ������ . �����ڲ��������������ڲ������࣬��Ϊ��static���κ󣬱������أ�Ҳ�����ⲿ���һ������
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
