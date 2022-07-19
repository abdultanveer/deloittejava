package abstraction;

public class Wiring {
	
	public static void main(String[] args) {
		SwitchBoardListener sbl;
		sbl = new GeApplliances();
				//new HavellsAppliances();
		
	//click the switches one by one
		sbl.switchOne();
		sbl.switchTwo();
		sbl.switchThree();
		sbl.switchFour();
	}

}
