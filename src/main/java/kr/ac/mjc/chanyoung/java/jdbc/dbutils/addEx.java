package kr.ac.mjc.chanyoung.java.jdbc.dbutils;

import java.util.List;

import kr.ac.mjc.chanyoung.java.jdbc.Board;

public class addEx {
	public static void main(String[] args) {
		BoardDao boardDao = new BoardDao();
		Board board = new Board(null, "김찬영 1등 아닌거같다..", "누군가 있었던거같다 쪽팔리다", null, "김찬영","2016041056");
		boardDao.addboard(board);
		System.out.println("학생을 추가했습니다. " + board);

		List<Board> boardList = boardDao.listboard();
		for (Board board1 : boardList)
			System.out.println(board1);
	}
}
