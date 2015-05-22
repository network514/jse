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
		if (this.idx>30) {msg = "비만";}
		else if(this.idx>24){msg = "과체중";}
		else if(this.idx>20){msg = "정상";}
		else if(this.idx>15){msg = "저체중";}
		else if(this.idx>13){msg = "마름";}
		else if(this.idx>10){msg = "영양실조";}
		else {msg = "소모증";}
		return msg;
	}
}
