package oop01.syntax;

public class Bicycle {
	private int cadence;
	private int gear;
	private int speed;
	private int id;
	private static int numberOfBicycle = 0;
	public Bicycle(int startCadence, int startGear, int startSpeed){
		super();
		this.cadence = startCadence;
		this.speed = startGear;
		this.id = ++numberOfBicycle;
	}
	public int getCadence() {
		return cadence;
	}
	public void setCadence(int cadence) {
		this.cadence = cadence;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void applyBrake(int decrement){
		speed -= decrement;
	}
	public void speedUp(int increament){
		speed += increament;
	}
}
