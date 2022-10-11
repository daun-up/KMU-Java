package homework0927 ;

import java.util.Scanner;

class Dice {
	int value;
	public Dice() {
		value =0;
	}
	void roll() {
		value =(int)(Math.random()*6)+1;
	}
	public void setValue(int value) {this.value = value;}
	public int getValue() {return value;}
}

public class Diceguess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֻ��� ������ �Է��Ͻÿ� :");
		int n = sc.nextInt();
		
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		int cnt = 0;
		
		while(true) {
			if (n==2) {
				System.out.printf("�ֻ���1=%d �ֻ���2=%d\n",d1.getValue(),d2.getValue());
				if(d1.getValue()+d2.getValue()==2) {
					System.out.printf("(%d,%d)�� �����µ� �ɸ� Ƚ��=%d",d1.getValue(),d2.getValue(),cnt);
					break;
				}else {
					d1.roll(); d2.roll();
					cnt++;
				}
			}else if(n==3) {
				System.out.printf("�ֻ���1=%d �ֻ���2=%d �ֻ���3=%d\n",d1.getValue(),d2.getValue(),d3.getValue());
				if(d1.getValue()+d2.getValue()+d3.getValue()==3) {
					System.out.printf("(%d,%d,%d)�� �����µ� �ɸ� Ƚ��=%d",d1.getValue(),d2.getValue(),d3.getValue(),cnt);
					break;
				}else {
					d1.roll(); d2.roll(); d3.roll();
					cnt++;
				}
			}
			
		}	
	}
}