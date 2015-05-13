package cmm04.arr;

public class No05_01MutiDimArrayDemo {
	public static void main(String[] args) {
		String[][] names = {
				{"Mr.", "Mrs.","Ms."},
				{"Smith","John"}
		};
		System.out.println(names[0][0] + names[1][0]); // Mr.Smith
		System.out.println(names[0][2] + names[1][1]); // Ms.John
		/*
		 * Mr.Smith
		 * Ms.John으로 출력시키세요.
		 * 
		 * */
	}
}
