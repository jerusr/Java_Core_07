package ua.lviv.lgs;

public class Flanker extends Airplane implements Technology{
	
	int maxSpeed;
	String color;
	

	public Flanker(int length, int height, int weight, int maxSpeed, String color) {
		super(length, height, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	@Override
	public void becomeStealth() {
		int unvisibleTime = (int) (Math.random() * 1000);
		System.out.println("�������� ��������� �����. ˳��� ���� � ������ �� " + unvisibleTime + " c��");
	}

	@Override
	public void turboAccelerate() {
		int accSpeed = this.maxSpeed + (int) (Math.random() * this.maxSpeed);
		System.out.println("���������������� ��������. �������� ����� " + accSpeed + " ��/������");
	}

	@Override
	public void nuclearStrike() {
		int bombsAmount = (int) (Math.random() * (10 + 1));
		System.out.println("���������� ������� �������� �����. �� ��'��� ���� ������� " + bombsAmount + " ���������");
		
	}
	
	
}
