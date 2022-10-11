import java.util.*;

class Phone {
    protected String owner;
    Phone(String owner) {
        this.owner = owner;
    }
    void talk() {
        System.out.println(owner + "가 통화 중이다.");
    }
}

class Telephone extends Phone {
    private String when;
    Telephone(String owner, String when) {
        super(owner);
        this.when = when;
    }
    void autoAnswering() {
        System.out.println(owner + "가 없다. " + when + "전화 줄래.");
    }
    public void setWhen(String when) {
    	this.when = when;
    }
    public String getWhen() {
    	return when;
    }
}

class Smartphone extends Telephone {
    private String game;
    
    Smartphone(String owner,String when, String game) {
        super(owner,when);
        this.game = game;
        
    }
    void playGame() {
        System.out.println(owner + "가 " + game + " 을 하는 중이다."+this.getWhen()+"전화줄래");
    }
}

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이","저녁때 ","갤러그") };
        phones[0].talk();
        ((Telephone)phones[1]).autoAnswering();
        ((Smartphone)phones[2]).playGame();


        
    }

}
