package cmm04.arr;

public class No03_ForLoopArrayVO {
	void ForLoopArray(){
		int[] arr = {1, 2, 3, 4, 5};
		//int[] arr;
		int sum = 0;
		/*
		 * 1���� 5������ ���� ���ϼ���.
		 * 
		 * */
		for(int i=0;i<arr.length;i++){
			//arr[i] = i+1;
			sum += arr[i];
		}
		System.out.print("1���� 5������ ���� : ");
		System.out.println(sum);
	}
}
