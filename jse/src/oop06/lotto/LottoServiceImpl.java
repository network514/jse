package oop06.lotto;

public class LottoServiceImpl implements LottoService{
	private int money;
	int [][] lottos;
	int [][] arr;
	
	@Override
	public void extractLottos(int money) {
		inputMoney(money);
		int count = this.getCount(money);
		int i = 0;
		for(count=0;count<lottos.length;cont++){
			while(true){
				// ���δ� �������ּ���.
				// isDuplication() �޼ҵ� ����ؾ� �մϴ�. 
				// �ߺ����� ���� �����̸� lottos[count][i]=num��
				// ���·� ���� �˴ϴ�. 
			}
		}
	}

	@Override
	public void printLotto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputMoney(int money) {
		this.money = money;
		lottos = new int [money/1000][6];
	}

	@Override
	public int getRandomNum() {
		// TODO Auto-generated method stub
		return (int) ((Math.random()*14)+1);
	}

	@Override
	public boolean isDuplication() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					//�ϼ����ּ���
					//���п� ���� �˰��� �˻�
				}
			}
		}
	}

	@Override
	public int getCount(int money) {
		if(money<1000){
			return (int) Math.ceil(money/1000);
		}
		return 0;
	}
	
}
