package ������ϰ;

public class ģ�������ϰ {
public static void main(String[] args) {
	
	Woman nv = new Woman();
    nv.add3();
    Man nan = new Man();
    nan.add3();
    
}

}


abstract class bank{
	//����������ȡ�Ź���
	public static void add1() {
		System.out.println("���ĺ���Ϊ **** ��");
	}
	//��abstract���η�����������ģ����ƵĹ��ӹ��ܣ�
	public abstract  void add();
	//���������еķ������ܣ�
	public static void add2() {
		System.out.println("��������������");
	}
	//�����Ƕ���ĵ��÷������Ҳ����޸�

	public final void add3() {
		this.add1();
		this.add();//���ӹ��ܣ��ṩ�ÿͻ�ѡ���Ȩ����
		this.add2();
	}
	
}
class Man extends bank{

	@Override
	public void add() {
		System.out.println("��ȥ����ȡǮ");
		
	}

}
class  Woman extends bank {

	@Override
	public void add() {
		System.out.println("��ȥ������ƣ���Ͷ��200w");
		
	}
	

}	
	
	
