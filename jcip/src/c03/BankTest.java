package c03;
/**
 * @project: jcip
 * @filename: BankTest.java
 * @version: 0.10
 * @author: JM Han
 * @date: 12:40 PM 5/30/2016
 * @comment: Test Purpose
 * @result:
 */

public class BankTest {
	public static void main(String args[]){
		final Bank bank=new Bank();

		Thread tadd=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					bank.addMoney(100);
					bank.lookMoney();
					System.out.println("\n");

				}
			}
		});

		Thread tsub = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					bank.subMoney(100);
					bank.lookMoney();
					System.out.println("\n");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		tsub.start();

		tadd.start();
	}
}
