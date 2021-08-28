package Strategy;

public class WoodDuck extends AbstractDuck {

	public WoodDuck() {
		// TODO Auto-generated constructor stub
		quackBehaviour = new Mute();
		flyBehaviour = new FlyNoWay();
		swimBehaviour = new Float();
	}
	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
