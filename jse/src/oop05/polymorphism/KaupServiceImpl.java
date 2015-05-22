package oop05.polymorphism;

public class KaupServiceImpl implements KaupInterface{
	private int idx;
	@Override
	public int getKaupIndex(double height, double weight) {
		KaupVO vo = new KaupVO();
		vo.setHeight(height);
		vo.setWeight(weight);
		this.idx = (int) ((weight)/(height*height)*10000);
		return this.idx;
	}

	@Override
	public String getResultMag() {
		String msg = null;
		if (this.idx>30) {msg = "��";}
		else if(this.idx>24){msg = "��ü��";}
		else if(this.idx>20){msg = "����";}
		else if(this.idx>15){msg = "��ü��";}
		else if(this.idx>13){msg = "����";}
		else if(this.idx>10){msg = "�������";}
		else {msg = "�Ҹ���";}
		return msg;
	}
}
