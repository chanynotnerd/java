package kr.ac.mjc.chanyoung.java.jdbc.dbutils;

import kr.ac.mjc.chanyoung.java.jdbc.Board;

public class getEx {
	public static void main(String[] args) {
		BoardDao boardDao = new BoardDao();
		Board board = boardDao.getboard("19");
		System.out.println(board);
	}
}
