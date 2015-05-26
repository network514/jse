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
		for(count=0;count<lottos.length;count++){
			while(true){
				// ���δ� �������ּ���.
				// isDuplication() �޼ҵ� ����ؾ� �մϴ�. 
				// �ߺ����� ���� �����̸� lottos[count][i]=num��
				isDuplication();
				lottos[count][i] = getRandomNum();
				// �ζ� ����
				// ���·� ���� �˴ϴ�. 
			}
		}
	}

	@Override
	public void printLotto() {
		for(int j = 0; j<lottos.length; j++){
			System.out.print(lottos[j]+"\t");
		}
		System.out.println();
	}

	@Override
	public void inputMoney(int money) {
		this.money = money;
		lottos = new int [money/1000][6];
	}

	@Override
	public int getRandomNum() {
		return (int) ((Math.random()*14)+1);
	}

	@Override
	public boolean isDuplication() {
		for(int j=0, i = 0;i<j; i++){ 
			if(lottos[j] == lottos[i]){
				j--;
				break;
				}	
		} return true;
	}

	@Override
	public void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					//�ϼ����ּ���
					//���п� ���� �˰��� �˻�
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
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
