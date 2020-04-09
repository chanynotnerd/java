package kr.ac.mjc.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> scoreMap = new HashMap<>();
		
		scoreMap.put("�輺��",97);
		scoreMap.put("Ȳ����",88);
		scoreMap.put("�賲��",98);
		scoreMap.put("���繮",70);
		scoreMap.put("�ѿ���",99);
		System.out.println(scoreMap);
		System.out.println("HashMap�� ��� ���� : " + scoreMap.size());
		
		System.out.println(scoreMap.get("���繮"));
		
		Set<String> keySet = scoreMap.keySet();
		for(String key : keySet) {
			System.out.println(key);
		}
		
		Set<Map.Entry<String, Integer>> entrySet = scoreMap.entrySet();
		for (Map.Entry<String, Integer> entry : entrySet) {
			System.out.format("%s : %d\n",entry.getKey(), entry.getValue());
		}
	}
}
