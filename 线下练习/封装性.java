package ������ϰ;
class wzx{
	private  String num ;
	private int age ;
	private  String add;
	  
	public void setage(int i ) {
		if(i>=0) {
			age = i;	
		}else {
			age =0;
		}	
	}
	public int getage() {
		return age;
	}	
	}

 class ��װ�� {
	public static void main(String[] args) {
		wzx add = new wzx();
	add.setage(7);
		;
	
System.out.println(add.getage());
	}

}
