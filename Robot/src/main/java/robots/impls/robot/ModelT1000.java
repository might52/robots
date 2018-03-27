package robots.impls.robot;

import robots.interfaces.Hand;
import robots.interfaces.Head;
import robots.interfaces.Leg;
import robots.interfaces.Robot;

public class ModelT1000 implements Robot{

    private Hand hand;
    private Leg leg;
    private Head head;

    private String color;
    private int year;
    private boolean soundEnabled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

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

    public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    @Override
    public void fire() {
        head.calc();
        hand.catchSomething();
        leg.go();
        System.out.println("color: "  + getColor());
        System.out.println("year: "  + getYear());
        System.out.println("soundEnabled: "  + isSoundEnabled());
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing!");
    }

}
