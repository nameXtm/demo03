package ������ϰ;

public class Arrays_2 {

	public static void main(String[] args) {
		Arrasy_1 add = new Arrasy_1();
           int[] arr =new int[] {32,52,3,5,85,-56,5};
           int max = add.getMax(arr);
          System.out.println("���ֵ" +max);
        add.print(arr);
          add.add1(arr);
          int age2 = add.add2(arr, 5);
         if(age2>0) {
        	 System.out.println("�ҵ��ˣ��±�Ϊ��"+age2);	 
         }else {
        	 System.out.println("δ�ҵ�");
         }
          
	}

}
