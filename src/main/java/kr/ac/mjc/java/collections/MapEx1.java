package kr.ac.mjc.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> dic = new HashMap<>();
		
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		System.out.println(dic);
		
		System.out.println(dic.get("baby"));
		System.out.println(dic.get("love"));
		System.out.println(dic.get("apple"));
	}

}
