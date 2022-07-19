package abstraction;

public class GeApplliances implements SwitchBoardListener{

	@Override
	public void switchOne() {
		System.out.println("GE fan is on");
	}

	@Override
	public void switchTwo() {
		System.out.println("GE ac is on");
		
	}

	@Override
	public void switchThree() {
		System.out.println("GE bulb is on");
		
	}

	@Override
	public void switchFour() {
		System.out.println("GE tubelight is on");
		
	}
}
