package Strategy;
public class Mute implements IQuackBehaviour{
	public Mute() {

}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Silence");

	}
}
