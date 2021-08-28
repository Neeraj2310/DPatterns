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
	
	public void setIFlyBehaviour(IFlyBehaviour fb) {
		//IFlyBehaviour fb1 = null;
		// TODO Auto-generated method stub
		flyBehaviour = fb;
		
	}
	
	}
