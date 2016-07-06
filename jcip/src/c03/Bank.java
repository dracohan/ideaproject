package c03;
/**
 * @project: jcip
 * @filename: Bank.java
 * @version: 0.10
 * @author: JM Han
 * @date: 12:39 PM 5/30/2016
 * @comment: Test Purpose
 * @result:http://www.codeceo.com/article/java-multi-thread-sync.html
 */

/**
 * @author ww
 *
 */
public class Bank {

	private int count =0;//账户余额

	//存钱
	public  void addMoney(int money){
		count +=money;
		System.out.println(System.currentTimeMillis()+"存进："+money);
	}

	//取钱
	public  void subMoney(int money){
		if(count-money < 0){
			System.out.println("余额不足");
			return;
		}
		count -=money;
		System.out.println(+System.currentTimeMillis()+"取出："+money);
	}

	//查询
	public void lookMoney(){
		System.out.println("账户余额："+count);
	}
}