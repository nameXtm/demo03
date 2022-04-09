package 线下练习;
class Student{
	int number;//学号
	int stae;//年级
	int score;//成绩
	
	public String add() {
		return "学号"+number+ "年纪"+stae+"成绩"+score;
	}
	//遍历数组
	public void add3( Student[] arr ) {
		for(int i = 0 ; i < arr.length;i++) {
			System.out.println(arr[i].add());
		}
		}
		
	//打印出年级为stae的学生信息；
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

public class 方法练习3 {

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
	//实例化方法
	Student test = new Student();
	//打印
	test.add3(arr);
	System.out.println();
	//打印年级为3的学生
	test.add1(arr, 3);
	System.out.println();
	//排序成绩并打印
	test.add2(arr);
	test.add3(arr);
	
	
	}
}
