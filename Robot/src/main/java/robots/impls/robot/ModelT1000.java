package robots.impls.robot;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import robots.interfaces.Hand;
import robots.interfaces.Head;
import robots.interfaces.Leg;
import robots.interfaces.Robot;

public class ModelT1000 extends BaseModel implements InitializingBean, DisposableBean {

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


    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Head head, Leg leg) {
        super(hand, head, leg);
    }

    public ModelT1000(Hand hand, Head head, Leg leg, String color, int year, boolean soundEnabled) {
        super(hand, head, leg);
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
    public void action() {
        getHead().calc();
        getHand().catchSomething();
        getLeg().go();
        System.out.println("color: " + getColor());
        System.out.println("year: " + getYear());
        System.out.println("soundEnabled: " + isSoundEnabled());
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing!");
    }


    @Override
    public void destroy() {
        System.out.println("destroy  object");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this + " - metod init (afterPropertiesSet)");
    }
}
