package cmm03.flow;

import java.util.Scanner;

public class No08_NumberMatch {
	public static void main(String[] args) {
		No08_NumberMatchVO vo = new No08_NumberMatchVO();
		System.out.println("�� 3ȸ�� �Է°����մϴ�.");
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		
		for(int i = 0; i<3;i++){
			System.out.println("1���� 5���� ������ �Է��ϼ���");
			try{
				int input = scanner.nextInt();
				vo.setPlayer(input);
			}catch(Exception e){
				System.out.println("���ڴ� �ȵ˴ϴ�.");
			}
			if(vo.getPlayer()==0){
				System.out.println("�ٽ� �Է��� �ֽʽÿ�.");
			}else{
				vo.setCom();
				result = vo.game(vo.getCom(), vo.getPlayer());
			}
			if(result == 1){
				System.out.println("������ϴ�."
						+ "������ �����մϴ�.");
				break;
			}else if(i== 2){
				System.out.println("3ȸ ��� �����߽��ϴ�." 
						+ "\n���ӿ��� �й��߽��ϴ�." 
						+ "\n������ �����մϴ�.");
				break;
			}
		}
	}
}
