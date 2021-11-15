package ua.lviv.lgs;

public class Control {

	public void MoveUp () {
		double Km = (double) (20 + Math.random() * 200);
		System.out.println("Flanker is moving up " +Km +" kilometer");
	}
	public void MoveDown () {
		double Km = (double) (20 + Math.random() * 100);
		System.out.println("Flanker is moving down " +Km +" kilometer");
	}
	public void MoveLeft () {
		double Km = (double) (20 + Math.random() * 30);
		System.out.println("Flanker is moving left " +Km +" kilometer");
	}
	public void MoveRight () {
		double Km = (double) (20 + Math.random() * 30);
		System.out.println("Flanker is moving right " +Km +" kilometer");
	}

}
