package 线下练习;

public class 模板设计练习 {
public static void main(String[] args) {
	
	Woman nv = new Woman();
    nv.add3();
    Man nan = new Man();
    nan.add3();
    
}

}


abstract class bank{
	//假设是银行取号功能
	public static void add1() {
		System.out.println("您的号码为 **** 号");
	}
	//用abstract修饰方法，假设是模板设计的钩子功能；
	public abstract  void add();
	//假设是银行的反馈功能；
	public static void add2() {
		System.out.println("请输入您的评价");
	}
	//假设是对象的调用方法，且不能修改

	public final void add3() {
		this.add1();
		this.add();//钩子功能，提供让客户选择的权利；
		this.add2();
	}
	
}
class Man extends bank{

	@Override
	public void add() {
		System.out.println("我去银行取钱");
		
	}

}
class  Woman extends bank {

	@Override
	public void add() {
		System.out.println("我去银行理财，且投资200w");
		
	}
	

}	
	
	
