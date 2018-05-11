package robots_annotation.impls.robot;

import robots_annotation.interfaces.Hand;
import robots_annotation.interfaces.Head;
import robots_annotation.interfaces.Leg;

public class Robot {
	
	private Hand hand;
	private Leg leg;
	private Head head;

	public Robot() {
	}

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
