package oop01.encapsule;

public class NumberMatchService {//������
	NumberMatchVO vo = new NumberMatchVO();
	public int game(int com, int player){
		int result;
		if(vo.getPlayer()==vo.getCom()){
			System.out.println("��ǻ�Ͱ� ������ ���� "+vo.getCom());
			System.out.println( vo.getPlayer() + "���� !!");
			result = 1;
		}else{
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println("��ǻ�Ͱ� ������ ���� "+vo.getCom()+" �Դϴ�");
			result = 0;
		}
		vo.setResult(result);
		return result;
	}
	public void repeat(int inputParam){
		int result;
		//��... for�� ��� ����... 
			System.out.println("1���� 3���� ������ �Է��ϼ���");
			try {
				int input = inputParam;
				vo.setPlayer(input);
			} catch (Exception e) {
				System.out.println("���ڴ� �ȵ˴ϴ�.");
			}
			if (vo.getPlayer() == 0) {
				System.out.println("�ٽ� �Է��� �ֽʽÿ�.");
			} else {
				vo.setCom();
				result = game(vo.getCom(), vo.getPlayer());
				vo.setResult(result);
			}
			if (vo.getResult() == 1) {
				System.out.println("������ϴ�." + "������ �����մϴ�.");
			} else if (vo.getResult() == 2) {
				System.out.println("\n���ӿ��� �й��߽��ϴ�."
						+ "\n������ �����մϴ�.");
		}
	}
}
