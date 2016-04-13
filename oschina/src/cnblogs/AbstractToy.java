package cnblogs;
/**
 * @project: oschina
 * @filename: AbstractToy.java
 * @version: 0.10
 * @author: JM Han
 * @date: 10:53 AM 4/13/2016
 * @comment: Test Purpose
 * @result:
 */

public class AbstractToy implements IToy{
	@Override
	public String playToy(String player) throws Exception {
		System.out.println(player + " plays abstract toy");
		return "";
	}
}
