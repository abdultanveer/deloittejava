package abstraction;


//implements -- provides a port for the switches to connect
public class HavellsAppliances implements SwitchBoardListener{

	@Override
	public void switchOne() {
		System.out.println("havells fan is on");
	}

	@Override
	public void switchTwo() {
		System.out.println("havells ac is on");
		
	}

	@Override
	public void switchThree() {
		System.out.println("havells bulb is on");
		
	}

	@Override
	public void switchFour() {
		System.out.println("havells tubelight is on");
		
	}

}
