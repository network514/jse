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
		/*원래의 위치를 origin이라 할때 
		parameter 위치로 옮기는 기능을 코드로 표현하시오. 
		 */
		origin.x=x;
		origin.y=y;
	}
	public int getArea(){
		return width*height;//0대신 공식을 대입하세요
	}

}
