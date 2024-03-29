package oop06.lotto;

public interface LottoService {
	/*
	 * 금액만큼 로또용를 출력하는 메소드
	 * 1000원 단위로 출력.
	 * 만약 1000원 이하 금액이 있다면 거스름돈 같이 출력
	 */
	public void extractLottos(int money);
	/*
	 * 로또 번호를 출력하는 메소드
	 * 로또 번호는 1~45까지 이고
	 * 출력되는 결과는 오름차순 정렬이 되어있어야 한다. 
	 * 각 숫자들은 6개 묶으로 한줄이고 
	 * 1000원 단위 돈만큼 행이 출력된다.
	 * 예를 들어 7000원 어치를 샀다면 7줄의 6개의 숫자가 내림차순으로 찍힐 것이다. 
	 * 단, 주의할 점은 숫자는 중복되지 않아야 한다.
	 */
	public void printLotto();
	/*
	 * 돈을 입금한 후 필드에 저장하는 메소드
	 */
	public void inputMoney(int money);
	/*
	 * 랜덤번호를 생성하는 로직
	 * */
	public int getRandomNum();
	/*
	 * 로또는 중복된 숫자가 있어서는 안되므로 중복여부를 판단하는 로직
	 */
	public boolean isDuplication();
	/*
	 * 로또 번호를 출력할 때 오름차순으로 나타내야할 때 사용되는 로직
	 */
	public void sort(int[] arr);
	/*
	 * 금액이 결정된 뒤 몇번 extractLottos()를 돌릴 것인가?
	 * 예를 들면 7000원이면 7회 회전 하게끔 카운트 숫자를 결정하는 로직
	 */
	public int getCount(int money);
}
