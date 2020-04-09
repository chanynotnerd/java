package kr.ac.mjc.chanyoung.java.jdbc;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor 

public class Board {

		private String seq;
		private String title;
		private String content;
		private String regdate;
		private String writer;
		private String cnt;
}

