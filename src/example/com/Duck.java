package example.com;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {
			
	}
	public abstract void display();
	
	public void performQuack() {
		quackBehavior.quack();	
	}
		
	public void performFly() {
		this.flyBehavior.fly();
	}
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
		
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
		
}
