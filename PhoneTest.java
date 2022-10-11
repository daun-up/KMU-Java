import java.util.*;

class Phone {
    protected String owner;
    Phone(String owner) {
        this.owner = owner;
    }
    void talk() {
        System.out.println(owner + "�� ��ȭ ���̴�.");
    }
}

class Telephone extends Phone {
    private String when;
    Telephone(String owner, String when) {
        super(owner);
        this.when = when;
    }
    void autoAnswering() {
        System.out.println(owner + "�� ����. " + when + "��ȭ �ٷ�.");
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
        System.out.println(owner + "�� " + game + " �� �ϴ� ���̴�."+this.getWhen()+"��ȭ�ٷ�");
    }
}

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = { new Phone("Ȳ����"), new Telephone("�浿��", "����"), new Smartphone("�α���","���ᶧ ","������") };
        phones[0].talk();
        ((Telephone)phones[1]).autoAnswering();
        ((Smartphone)phones[2]).playGame();


        
    }

}
