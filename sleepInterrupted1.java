package test01;

public class sleepInterrupted1 {
public static void main(String[] args) {
	Thread t=Thread.currentThread();
	System.out.println("�̵߳�û���жϣ�"+t.isInterrupted());
	//�߳��ж�
	t.interrupt();
	System.out.println("�̱߳��жϣ�"+t.isInterrupted());
	
	try{
		//�̱߳��ж��ˣ�ִ�����ߣ��ᱨ�ж��쳣
		t.sleep(20000);
		System.out.println("˯��");
	}catch(InterruptedException e){
		//�߳��жϺ������־λ��true----false��
		System.out.println("�̱߳��ж��ˣ��߳��˳�");
	}
	//�ж��쳣�󣬻������־λ
	System.out.println("�жϺ���жϱ�־λΪ��"+t.isInterrupted());
}
}
