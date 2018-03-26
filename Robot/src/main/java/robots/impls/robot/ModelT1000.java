package robots.impls.robot;

import robots.interfaces.Hand;
import robots.interfaces.Head;
import robots.interfaces.Leg;
import robots.interfaces.Robot;

public class ModelT1000 implements Robot{

    private Hand hand;

    public ModelT1000() {
    }

    private Leg leg;
    private Head head;

    public ModelT1000(Hand hand, Head head, Leg leg) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    @Override
    public void fire() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing!");
    }

}
