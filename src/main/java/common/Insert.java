package common;

import common.bean.StudentClsHour;
import common.bean.StudentInfo;
import common.bean.StudentLabels;
import common.conn.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Insert {

    public static void insertStudentInfo(ArrayList<StudentInfo> recordLS) {
        Connection conn = DBConnection.getConnection();
        String sql = "INSERT INTO ebk_teen_student_info (grd_level, nickname, mobile) VALUES(?,?,?)";

        PreparedStatement pstmt;
        try {
            conn.setAutoCommit(false);
            pstmt = conn.prepareStatement(sql);
            for (StudentInfo record : recordLS) {
                pstmt.setInt(1, record.getGrd_level());
                pstmt.setString(2, record.getNickname());
                pstmt.setString(3, record.getMobile());

                pstmt.addBatch();
            }
            pstmt.executeBatch();
            conn.commit();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertStudentClsHour(ArrayList<StudentClsHour> recordLS) {
        Connection conn = DBConnection.getConnection();
        String sql = "INSERT INTO ebk_teen_student_cls_hour (sid, cls_type, cls_hour, create_time, expire_time," +
                " for_free, order_id, use_level, cls_hour_bak, cls_type_bak, expire_time_bak)" +
                " VALUES(?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement pstmt;
        try {
            conn.setAutoCommit(false);
            pstmt = conn.prepareStatement(sql);
            for (StudentClsHour record : recordLS) {
                pstmt.setInt(1, record.getSid());
                pstmt.setInt(2, record.getCls_type());
                pstmt.setInt(3, record.getCls_hour());
                pstmt.setInt(4, record.getCreate_time());
                pstmt.setInt(5, record.getExpire_time());
                pstmt.setInt(6, record.getFor_free());
                pstmt.setInt(7, record.getOrder_id());
                pstmt.setInt(8, record.getUse_level());
                pstmt.setInt(9, record.getCls_hour_bak());
                pstmt.setInt(10, record.getCls_type_bak());
                pstmt.setInt(11, record.getExpire_time_bak());

                pstmt.addBatch();
            }

            pstmt.executeBatch();
            conn.commit();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertStudentLabels(ArrayList<StudentLabels> studentLabels) {
        Connection conn = DBConnection.getConnection();
        String sql = "INSERT INTO ebk_teen_student_labels (sid, label_id, operator, create_time) VALUES(?,?,?,?)";

        PreparedStatement pstmt;
        try {
            conn.setAutoCommit(false);
            pstmt = conn.prepareStatement(sql);
            for (StudentLabels record : studentLabels) {
                pstmt.setInt(1, record.getSid());
                pstmt.setInt(2, record.getLabel_id());
                pstmt.setInt(3, record.getOperator());
                pstmt.setInt(4, record.getCreate_time());

                pstmt.addBatch();
            }

            pstmt.executeBatch();
            conn.commit();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
