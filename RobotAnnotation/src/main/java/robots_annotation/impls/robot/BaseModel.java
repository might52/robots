package robots_annotation.impls.robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.ResponseBody;
import robots_annotation.interfaces.Robot;
import robots_annotation.interfaces.Hand;
import robots_annotation.interfaces.Head;
import robots_annotation.interfaces.Leg;

public abstract class BaseModel implements Robot {
    @Autowired
    @Qualifier(value = "toshibaHand")
    private Hand hand;
    @Autowired
    @Qualifier(value = "toshibaGoldenHead")
    private Head head;
    @Autowired
    @Qualifier(value = "toshibaLeg")
    private Leg leg;

    public BaseModel() {
        System.out.println(this + " - BaseModel constructor()");
    }

    public BaseModel(Hand hand, Head head, Leg leg) {
        super();
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

}
