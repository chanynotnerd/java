package kr.ac.mjc.chanyoung.java.jdbc.dbutils;

import java.util.List;
import javax.sql.DataSource;
import org.mariadb.jdbc.MariaDbDataSource;
import kr.ac.mjc.chanyoung.java.jdbc.Board;

public class BoardDao {

		private final String list_board = "select seq, title, content, regdate,writer,cnt from board";
		private final String get_board = "select seq, title, content, regdate, writer, cnt from board where seq=?";
		private final String add_board = "insert board(seq, title, content,writer,cnt) values(?,?,?,?,?)";
		private final String update_board = "update board set title=?, content=?, writer= ?, cnt=? where seq=?";
		private final String delete_board = "delete from board where seq=?";

		private dbutils dbutils = null;

		public BoardDao() {
			DataSource ds = new MariaDbDataSource(
					"jdbc:mariadb://irafe.com:3306/jdbc?user=jdbc&password=javaprogramming");
			this.dbutils = new dbutils(ds);
		}


		 
		 public List<Board> listboard() {
			return dbutils.list(list_board, (rs) -> {
	            Board board = new Board();
	            board.setSeq(rs.getString("seq"));
	            board.setTitle(rs.getString("title"));
	            board.setContent(rs.getString("content"));
	            board.setRegdate(rs.getString("regdate"));
	            board.setWriter(rs.getString("writer"));
	            board.setCnt(rs.getString("cnt"));
	            return board;
	        });
	    }	

		public Board getboard(String seq) {
			return dbutils.get(get_board, (rs) -> {
				Board board = new Board();
				board.setSeq(rs.getString("seq"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setRegdate(rs.getString("regdate"));
				board.setWriter(rs.getString("writer"));
				 board.setCnt(rs.getString("cnt"));
				return board;
			}, seq);
		}

		public int addboard(Board board) {
			return dbutils.update(add_board, board.getSeq(), board.getTitle(),
					board.getContent(), board.getWriter(), board.getCnt());
		}

		public int updateboard(Board board) {
			return dbutils.update(update_board, board.getTitle(),
					board.getContent(), board.getWriter(), board.getCnt(), board.getSeq());
		}

		public int deleteboard(String seq) {
			return dbutils.update(delete_board, seq);
		}
	}
