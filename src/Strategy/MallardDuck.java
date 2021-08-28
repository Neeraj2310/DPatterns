package Strategy;

public class MallardDuck extends AbstractDuck {
	public MallardDuck() {
		quackBehaviour = new Squeak();
		flyBehaviour = new FlyWithWings();
		swimBehaviour = new Butterfly();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
	}


}
