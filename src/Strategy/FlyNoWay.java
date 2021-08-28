package Strategy;


public class FlyNoWay implements IFlyBehaviour{
    public FlyNoWay() {
    }
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I Can't Fly");
	}
}