package kr.ac.mjc.chanyoung.java.jdbc.dbutils;

import kr.ac.mjc.chanyoung.java.jdbc.Board;

public class updateEx {
	public static void main(String[] args) {
		BoardDao boardDao = new BoardDao();
		Board board = new Board("19", "김찬영 1등하다", "말이라도 이렇게 해야 나중에 1등하지", null, "김찬영","970721");
		int updatedRows = boardDao.updateboard(board);

		if (updatedRows > 0) {
			System.out.println("글을 수정했습니다.");
			Board br = boardDao.getboard("19");
			System.out.println(br);
		} else {
			System.out.println("글이 없어서 수정할 수 없습니다. " + board);
		}
	}
}