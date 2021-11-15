package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		Flanker Z367 = new Flanker (2600, 50, 100, 200, "Черный");
		
		Z367.StartEngine();
		Z367.TakeOff();
		Z367.MoveUp();
		Z367.MoveLeft();
		Z367.MoveDown();
		Z367.MoveRight();
		Z367.becomeStealth();
		Z367.nuclearStrike();
		Z367.turboAccelerate();
		Z367.Landing();
	}

}

