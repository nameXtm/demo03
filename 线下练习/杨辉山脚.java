package 线下练习;



public class 杨辉山脚 {

	public static void main(String[] args) {
		//创建数组
		int[][] yanghui = new int[10][];
		
		//初始化数组
		for (int i = 0 ; i < yanghui.length;i++) {
			yanghui[i] =  new int[i+1];	
			//给首位末位赋值为1；
			yanghui[i][0] = yanghui[i][i] = 1;
			//给中间数赋值；
			if(i>1) {
				for(int j = 1; j < yanghui[i].length-1;j++) {
					yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
					
				}
				
			}
		}	
for(int i = 0; i < yanghui.length;i++) {
	for(int j = 0; j<yanghui[i].length;j++) {
		System.out.print(yanghui[i][j]+" ");
	}
	System.out.println();
}
	}
}
