package ������ϰ;
class Student{
	int number;//ѧ��
	int stae;//�꼶
	int score;//�ɼ�
	
	public String add() {
		return "ѧ��"+number+ "���"+stae+"�ɼ�"+score;
	}
	//��������
	public void add3( Student[] arr ) {
		for(int i = 0 ; i < arr.length;i++) {
			System.out.println(arr[i].add());
		}
		}
		
	//��ӡ���꼶Ϊstae��ѧ����Ϣ��
	public void add1( Student[] arr , int stae) {
		for(int i = 0 ; i < arr.length;i++) {
			if(arr[i].stae == stae) {
			System.out.println(arr[i].add());
			}
			
		}
		
	}
	public void add2(Student[] arr) {
		for (int i = 0 ; i <arr.length -1 ; i++) {
			for(int j = 0; j<arr.length - 1 - i ; j++) {
				if(arr[j].score > arr[j+1].score ) {
					Student arr1 = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = arr1;
				
				}
			}
		}
		
	}
}

public class ������ϰ3 {

	public static void main(String[] args) {
	Student[] arr = new Student[20];
	for(int i = 0; i<arr.length; i++) {
		arr[i]=new Student();
		arr[i].number = i+1;
		arr[i].stae = (int)(Math.random()*(6-1+1)+1);
		arr[i].score = (int)(Math.random()*(100+1));
		System.out.println(arr[i].add());
//		Student test = new Student();
//		test.add(arr);
//		System.out.println();
	}
	
//	for(int i = 0; i<arr.length; i++) {
//	System.out.println(arr[i].add());
//	}
//	
//	for(int i = 0; i<arr.length; i++) {
//		arr[i].add1(arr, 3);
//		System.out.println(arr[i].add());
//		}

//	for(int i = 0; i<arr.length; i++) {
//		arr[i].add2(arr);
//		System.out.println();
//		}
	//ʵ��������
	Student test = new Student();
	//��ӡ
	test.add3(arr);
	System.out.println();
	//��ӡ�꼶Ϊ3��ѧ��
	test.add1(arr, 3);
	System.out.println();
	//����ɼ�����ӡ
	test.add2(arr);
	test.add3(arr);
	
	
	}
}
