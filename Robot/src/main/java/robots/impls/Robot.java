package robots.impls;

import robots.interfaces.Hand;
import robots.interfaces.Head;
import robots.interfaces.Leg;

public class Robot {
	
	private Hand hand;
	private Leg leg;
	private Head head;
	
	public Robot(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public void action(){
		head.calc();
		hand.catchSomething();
		leg.go();
	}

}
