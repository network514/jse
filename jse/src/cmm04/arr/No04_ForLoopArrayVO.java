package cmm04.arr;
/*입력받은 다섯개의 숫자의 합을 구하시오.*/
public class No04_ForLoopArrayVO {
	
	private int a, b, c, d, e;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public void testFor(int a, int b, int c, int d, int e) {
		setA(a);
		setB(b);
		setC(c); 
		setD(d);
		setE(e);
		int[] val = {getA(),getB(),getC(),getD(),getE()};
		int sum = 0;
		for(int i=0;i<val.length;i++){
			System.out.println(val[i]);
			sum += val[i];
		}
		System.out.print("다섯개의 수의 합은 : ");
		System.out.println(sum);
	}
}