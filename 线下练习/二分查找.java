package 线下练习;

public class 二分查找 {

	public static void main(String[] args) {
		int[] arr = new int[] {10 ,20 ,50 ,60,80,90};
		int arr1 = 50;
int num = 0;
int num1 = arr.length-1;
while(num1>=num) {
	int num2 = (num+num1)/2;
	if(arr[num2]==arr1) {
		System.out.println("找到了，下标为：" +num2);
		break;
	}else if(arr[num2] < arr1) {
		num1 = num2-1;
	}else if(arr[num2]>arr1) {
		num = num2+1;
	}
}
	}
}
