package com.springbook.biz.board.impl;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.JDBCUtil;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@Repository("boardDAO")
public class BoardDAO {
    //JDBC 변수
    private Connection conn = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;

    // SQL 명령어
    private final String BOARD_INSERT = "inset into board(seq, title, writer, content) " +
            "values((select nvl(max(seq), 0) + 1 from board), ?, ?, ?)";
    private final String BOARD_UPDATE = "update board set title =?," +
            "content = ? where seq=?";
    private final String BOARD_DELETE = "delete board where seq = ?";
    private final String BOARD_GET = "select * from board where seq = ?";
    private final String BOARD_LIST = "select * from board order by seq desc";

    //CRUD 기능 메소드 구현
    public void insertBoard(BoardVO vo) {
        System.out.println("======> JDBC로 insertBoard() 기능 처리");
        try {
            conn = JDBCUtil.getConnection();
            stmt = conn.prepareStatement(BOARD_INSERT);
            stmt.setString(1, vo.getTitle());
            stmt.setString(2, vo.getWriter());
            stmt.setString(3, vo.getContent());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.close(stmt, conn);
        }
    }
}
