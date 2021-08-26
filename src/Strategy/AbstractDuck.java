package Strategy;


public abstract class AbstractDuck {
	IFlyBehaviour flyBehaviour ;
	IQuackBehaviour quackBehaviour;
	ISwimBehaviour swimBehaviour;
	
	public AbstractDuck(){

}

	public abstract void display();
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void performSwim() {
		swimBehaviour.swim();
	}
}