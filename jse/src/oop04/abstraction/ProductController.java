package oop04.abstraction;

public class ProductController {
	public static void main(String[] args) {
		ComputerInfo ci = new ComputerInfo();
		ci.setComputerInfo("삼성", "센스", "a-1234-4567", "dual-core", "8G", "500GB");
		ci.displayProductInfo();
		System.out.println();
		
		TvInfo ti = new TvInfo();
		// set 메소드 호출
		// TV 정보는 
		ti.setTvInfo("LG", "X캔버스", "productSerialID", "42인치", "16:9");
		// 회사 : LG
		// 제품명 : X캔버스
		// 제품ID : x-12345
		// 화면 사이즈 : 42인치
		// 화면 비율 : 16:9
		ti.displayProductInfo();
	}
}
