package kr.ac.mjc.chanyoung.java.jdbc.dbutils;

import java.util.List;

import kr.ac.mjc.chanyoung.java.jdbc.Board;

public class deleteEx {
	public static void main(String[] args) {
		BoardDao boardDao = new BoardDao();
		String deleteId = "25";
		int updatedRow = boardDao.deleteboard(deleteId);
		if (updatedRow > 0)
			System.out.println("학생 삭제. id=" + deleteId);
		else
			System.out.println("학생 삭제 불가 : 학생 없음. id=" + deleteId);
		
		List<Board> boardList = boardDao.listboard();
		for (Board board : boardList)
			System.out.println(board);
	}
}
