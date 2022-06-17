package syncex;

/*
	����ȭ : �������� �����ϴ� ���� ���� �ϱ� ���ѹ��
	
		�Ӱ迵��
		- ��Ƽ �����忡 ���� �����ڿ��� ������ �� �ִ� �ڵ��� ������ �ǹ��Ѵ�..
		- ��Ƽ ������ ���α׷����� �Ӱ迵���� ó���� ��� �ɰ��� ������ �����
		- �̷��� ��Ȳ�� �ذ��� �� �ִ� ����� ����ȭ��
		
		����ȭ�� ó���ϱ� ���� ��� ��ü�� ���� ���Խ�Ŵ
		
		��
		- ������ü�� ���� �����尡 ���ÿ� �������� ���ϵ��� �ϱ� ���� ����
		  ��� ��ü�� �� ������ �����ɶ� �ڵ����� ��������� ���� ���̶�� ��
		- ����ȭ�� �߸��Ǹ� Dead Lock�� �ɸ�
		
		����ȭ ���� ���
		
		1. public Synchronized void SynchronizeMethod() {
		
		   }
		   
		2. public void SynchronizeMethod() {
		       synchrronized(��ü �Ǵ� Ŭ������) {
		       
		       }
		   }
 */

class ATMTwo implements Runnable { // ����ȭ�� ����Ǿ��µ� ���� �߻�
	
private long depositeMoney = 10000;
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i = 0; i < 10; i++) {
				
				if(getDepositeMoney() <= 0) {
					break;
				}
				
				withDraw(1000);
				
				if(getDepositeMoney() == 2000 || 
					getDepositeMoney() == 4000 || 
					getDepositeMoney() == 6000 || 
					getDepositeMoney() == 8000) {
					
					try {
						this.wait();
					} catch (InterruptedException ie) {
						ie.printStackTrace();
					}
				} else {
					this.notify();
				}
			}
		}
		
	}
	
	public long getDepositeMoney() {
		return depositeMoney;
	}
	
	// ���
	public void withDraw(long howMuch) {
		if(getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.printf("�ܾ� : %d��%n", getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.println("�ܾ��� �����մϴ�");
		}
	}
	// �Ա�
}


class ATM implements Runnable {
	private long depositeMoney = 10000;
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
				
				if(getDepositeMoney() <= 0) {
					break;
				}
				withDraw(1000);
			}
		}
		
	}
	
	public long getDepositeMoney() {
		return depositeMoney;
	}
	
	// ���
	public void withDraw(long howMuch) {
		if(getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.printf("�ܾ� : %d��%n", getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName() + ", ");
			System.out.println("�ܾ��� �����մϴ�");
		}
	}
	// �Ա�
	
	
}

public class SynchronizedEx01 {

	public static void main(String[] args) {

//		ATM atm = new ATM();
//		Thread mother = new Thread(atm, "mother");
//		Thread son = new Thread(atm, "son");
		
		ATMTwo atm = new ATMTwo();
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		
		mother.start();
		son.start();
		
	}

}
