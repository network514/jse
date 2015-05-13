package cmm04.arr;

public class No03_ForLoopArrayVO {
	void ForLoopArray(){
		int[] arr = {1, 2, 3, 4, 5};
		//int[] arr;
		int sum = 0;
		/*
		 * 1부터 5까지의 합을 구하세요.
		 * 
		 * */
		for(int i=0;i<arr.length;i++){
			//arr[i] = i+1;
			sum += arr[i];
		}
		System.out.print("1부터 5까지의 합은 : ");
		System.out.println(sum);
	}
}
