package oschina.onsite;

import java.util.ArrayList;
import java.util.LinkedList;

class permutaion{
	/*
	 * ����String s���ҳ����е�s��ÿ���ַ���ɵ��������
	 * ���Ȼ��s��substring���������
	 * Ȼ�����ַ����β���ÿһ�������У��õ��µ��������
	 */
	public static ArrayList<String> getPermutation(String s){
		ArrayList<String> preRes = new ArrayList<String>();

		if(s.length() == 1){
			preRes.add(s);
			return preRes;
		}

		preRes = getPermutation(s.substring(1));

		char c = s.charAt(0);
		ArrayList<String> newRes= new ArrayList<String>();

		for (int i = 0; i < preRes.size(); i++){
			String ss = preRes.get(i);
			LinkedList<String> insertion = getInsertion(ss, c);
			newRes.addAll(insertion);
			insertion = null;
		}

		preRes = null;
		preRes = newRes;
		newRes = null;

		return preRes;
	}

	/*
	 * ������String��Char��ɵ���������
	 */
	public static LinkedList<String> getInsertion(String s, char c){
		LinkedList<String> res = new LinkedList<String>();
		int len = s.length();

		res.add(new StringBuilder().append(s).append(c).toString());
		res.add(new StringBuilder().append(c).append(s).toString());

		if(len > 1){
			for(int i = 1; i < len; i++){
				StringBuilder sb1 = new StringBuilder(s.substring(0, i));
				StringBuilder sb2 = new StringBuilder(s.substring(i, len));
				res.add(sb1.append(c).append(sb2).toString());
			}
		}
		return res;
	}

	public static void main(String[] args) {
		String str = "abc";
		ArrayList<String> res = getPermutation(str);
		for(String s:res){
			System.out.println(s);
		}
	}
}
