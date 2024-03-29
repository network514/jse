package oop04.abstraction;

public class TvInfo extends ProductInfo{
	protected String inchInfo;
	protected String screenRatioInfo;

	@Override
	public void displayProductInfo() {
		System.out.println("제조회사 : " + this.productCompany);
		System.out.println("제 품 명 : " + this.productName);
		System.out.println("고유번호 : " + this.productSerialID);
		System.out.println("인치정보 : " + this.inchInfo);
		System.out.println("화면비율 : " + this.screenRatioInfo);
	}
	//아래 정보는 완성하시오.
	public void setTvInfo(String productCompany, String productName, String productSerialId, 
							String inchInfo, String screenRatioInfo){
		super.setProductInfo(productCompany, productName, productSerialId);
		this.inchInfo = inchInfo;
		this.screenRatioInfo = screenRatioInfo;
	}
}
