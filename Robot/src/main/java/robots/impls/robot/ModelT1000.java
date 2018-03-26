package robots.impls.robot;

import robots.interfaces.Hand;
import robots.interfaces.Head;
import robots.interfaces.Leg;
import robots.interfaces.Robot;

public class ModelT1000 implements Robot{

    private Hand hand;
    private Leg leg;
    private Head head;

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public ModelT1000() {
    }

    public ModelT1000(Head head, Leg leg, Hand hand) {
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
