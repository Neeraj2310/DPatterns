package Strategy;

public class RubberDuck extends AbstractDuck {
	public RubberDuck() {
	quackBehaviour = new Squeak();
	flyBehaviour = new FlyNoWay();
	swimBehaviour = new Float();
}


@Override
public void display() {
	// TODO Auto-generated method stub
}
}

