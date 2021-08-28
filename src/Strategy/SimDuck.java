package Strategy;

public class SimDuck extends AbstractDuck {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
          MallardDuck mallard = new MallardDuck();
          System.out.println("I am a MallardDuck");
          mallard.performQuack();
          mallard.performFly();          
          mallard.performSwim();          
          System.out.println(" ");

          
          RubberDuck rubber = new RubberDuck();
          System.out.println("I am a RubberDuck");
          rubber.performQuack();
          rubber.performFly();          
          rubber.performSwim();
          System.out.println(" ");

          
          WoodDuck woody = new WoodDuck();
          System.out.println("I am a WoodDuck");
          woody.performQuack();
          woody.performFly();          
          woody.performSwim();
          woody.setIFlyBehaviour(new FlyRocketPowered() );
          woody.performFly();          

	}
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}


}