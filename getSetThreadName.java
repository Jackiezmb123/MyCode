package test01;
class startThread implements Runnable{
	public void run(){
		Thread t=Thread.currentThread();
		System.out.println("��ǰ���̵߳�������:"+t.getName());
	}
}
public class getSetThreadName {
public static void main(String[] args) {
	Thread th=new Thread(new startThread());
	th.setName("�߳��գ�������");
	th.start();
	
}
}
