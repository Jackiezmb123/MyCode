package test01;
/*��̬��Ϊ�������̬�ͷ�����̬(���������ؾ���һ�����ڱ�ʾ)
      
      ���أ�����˼�壬���Ǹ����з���������������д������static���η����Դﵽ����
               �����෽��û����static���εĻ���������ʵ��������ʱ�����õ���������д�ķ���
*
*
*/
class F{
	public static void show(){
		System.out.println("����д�����ң�����");
	}
}
class Z extends F{
	public static void show(){
		System.out.println("�ҾͲ�����д�����㣡������");
	}
}
public class hide {
public static void main(String[] args) {
	//����ת��(�����̬�ͣ��������ά��)
	F f=new Z();
	f.show();
	
    F.show();
    Z.show();
}
}
