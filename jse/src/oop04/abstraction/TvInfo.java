package oop04.abstraction;

public class TvInfo extends ProductInfo{
	protected String inchInfo;
	protected String screenRatioInfo;

	@Override
	public void displayProductInfo() {
		System.out.println("����ȸ�� : " + this.productCompany);
		System.out.println("�� ǰ �� : " + this.productName);
		System.out.println("������ȣ : " + this.productSerialID);
		System.out.println("��ġ���� : " + this.inchInfo);
		System.out.println("ȭ����� : " + this.screenRatioInfo);
	}
	//�Ʒ� ������ �ϼ��Ͻÿ�.
	public void setTvInfo(String productCompany, String productName, String productSerialId, 
							String inchInfo, String screenRatioInfo){
		super.setProductInfo(productCompany, productName, productSerialId);
		this.inchInfo = inchInfo;
		this.screenRatioInfo = screenRatioInfo;
	}
}