package oop04.abstraction;

public class ProductController {
	public static void main(String[] args) {
		ComputerInfo ci = new ComputerInfo();
		ci.setComputerInfo("�Ｚ", "����", "a-1234-4567", "dual-core", "8G", "500GB");
		ci.displayProductInfo();
		System.out.println();
		
		TvInfo ti = new TvInfo();
		// set �޼ҵ� ȣ��
		// TV ������ 
		ti.setTvInfo("LG", "Xĵ����", "productSerialID", "42��ġ", "16:9");
		// ȸ�� : LG
		// ��ǰ�� : Xĵ����
		// ��ǰID : x-12345
		// ȭ�� ������ : 42��ġ
		// ȭ�� ���� : 16:9
		ti.displayProductInfo();
	}
}
