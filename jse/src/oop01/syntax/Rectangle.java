package oop01.syntax;

public class Rectangle {
	public int width = 0;
	public int height = 0;
	public Point origin;
	
	public Rectangle(){
		origin = new Point(0,0);
	}
	public Rectangle(Point p){
		origin = p;
	}
	public Rectangle(Point p, int w, int h){
		origin = p;
		width = w;
		height = h;
	}
	//method for moving the rectangle
	public void move(int x, int y){
		/*������ ��ġ�� origin�̶� �Ҷ� 
		parameter ��ġ�� �ű�� ����� �ڵ�� ǥ���Ͻÿ�. 
		 */
		origin.x=x;
		origin.y=y;
	}
	public int getArea(){
		return width*height;//0��� ������ �����ϼ���
	}

}
