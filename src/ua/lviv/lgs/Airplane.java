package ua.lviv.lgs;

public abstract class Airplane extends Control {
	
	private int length;
	private int height;
	private int weight;
	
	public Airplane(int length, int height, int weight) {
		this.length = length;
		this.height = height;
		this.weight = weight;
	}

	public void StartEngine () {
		int countdown = 20 + (int) (Math.random() * (68 + 1));
		System.out.println("�������� �������. ��� �������� ����� " + countdown + " ���");
	}
	
	public void TakeOff () {
		double distance = (Math.random() * 1000);
		System.out.println("������� ���. ˳��� � ������ ����� ��������� " + distance + " �");
	}
	
	public void Landing () {
		System.out.println("������� ������� �����. ������� ��������...");
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	


	
}
