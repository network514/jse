package oop01.encapsule;
//������
public class PayService {
	PayVO vo = new PayVO();
	private double tax;
	public void scanname(String name){
		vo.setName(name);
	}
	public void scansalary(int salary){
		vo.setSalary(salary);
	}
	public int resultax(){
		tax = vo.getSalary()*vo.getTax();
		return (int)tax;
		//(vo.getSalary()*0.1) ����� �� ����
	}
	public int resultincome(){
		int result = (int)(vo.getSalary()-tax);
		return result;
	}
	
	
}
