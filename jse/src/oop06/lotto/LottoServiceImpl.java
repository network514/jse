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
				// 내부는 구현해주세요.
				// isDuplication() 메소드 사용해야 합니다. 
				// 중복되지 않은 숫자이면 lottos[count][i]=num의
				isDuplication();
				lottos[count][i] = getRandomNum();
				// 로또 숫자
				// 형태로 들어가게 됩니다. 
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
					//완성해주세요
					//포털에 스왑 알고리즘 검색
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
