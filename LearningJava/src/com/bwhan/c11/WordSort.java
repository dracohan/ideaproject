package c11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * @project: LearningJava
 * @filename: WordSort.java
 * @version: 0.10
 * @author: JM Han
 * @date: 20:34 2016/2/27
 * @comment: Count the word and sort them
 * @result:
 */

public class WordSort {
	public static void main(String[] args) throws IOException{
		if(args.length < 2) {
			System.out.println("Usage: WordSort inputfile outputfile");
			return;
		}
		String inputfile = args[0];
		String outputfile = args[1];

		Map<String, Integer> map = new TreeMap<String, Integer>();

		Scanner scanner = new Scanner(new File(inputfile));
		while(scanner.hasNext()){
			String word = scanner.next();
			Integer count = map.get(word);
			count = (count == null ? 1 : count + 1);
			map.put(word, count);
		}
		scanner.close();
		List<String> keys = new ArrayList<String>(map.keySet());

		PrintWriter out = new PrintWriter(new FileWriter(outputfile));
		for(String key : keys)
			System.out.println(key + " : " + map.get(key));
		out.close();
	}
}
