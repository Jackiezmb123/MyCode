package test01;

public class sleepInterrupted implements Runnable {
public void run(){
	try{
		System.out.println("���̱߳����ã�");
		Thread.sleep(10000);
	}catch(InterruptedException e){
		System.out.println("���̱߳��ж�");
		return;
	}
	System.out.println("�̻߳��Ѻ󣬼���ִ�У�");
	System.out.println("�߳������˳���");
}
public static void main(String[] args){
	sleepInterrupted s=new sleepInterrupted();
	Thread t=new Thread(s);
	t.start();
	try{
		Thread.sleep(2000);
	}catch(Exception e){
		e.printStackTrace();
	}
	System.out.println("main�߳���������");
	
	//interrupted()����ֻ���ж��������̣߳�������ִ�е��̲߳�������
	t.interrupt();
	System.out.println("main���������˳�");
}
}
