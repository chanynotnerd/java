package kr.ac.mjc.chanyoung.java.jdbc.dbutils;

import java.util.List;

import kr.ac.mjc.chanyoung.java.jdbc.Board;

public class listEx {
	public static void main(String[] args) {
	
	BoardDao boardDao = new BoardDao();
	List<Board> boardList = boardDao.listboard();
	for (Board board : boardList)
		System.out.println(board);
	}
}
