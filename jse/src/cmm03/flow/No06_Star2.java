package cmm03.flow;

public class No06_Star2 {
	public static void main(String[] args) {
		for(int i=0;i<6;i++){
			for(int j=1;j<(6-i);j++){
				System.out.print("¡Ú");
			}
			System.out.println("");
		}
	}
}

/*package cmm03.flow;

public class No06_Star2 {
	public static void main(String[] args) {
		for(int i=1;i<6;i++){
			for(int j=6;j>i;j--){
				System.out.print("¡Ú");
			}System.out.println("");
		}
	}
}*/
