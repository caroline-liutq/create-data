package common;

import common.bean.StudentClsHour;
import common.bean.StudentInfo;
import common.bean.StudentLabels;
import common.bean.TemplateStudent;

import java.util.ArrayList;

public class LoadDataDao {

    static String[] nickname = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
    static int batchNum = 1;

    public static void main(String[] args) {
        // 插入 ebk_teen_student_info 表
        Insert.insertStudentInfo(buildStudentInfo(0, 11));

//         插入 ebk_teen_student_cls_hour 表
//        Insert.insertStudentClsHour(buildStudentClsHourLS(984493, 984505));

        //         插入 ebk_teen_student_Labels 表
        // Insert.insertStudentLabels(buildStudentLabels(984493, 984505));

    }

    public static ArrayList<TemplateStudent> buildStudentTemp(int start, int end) {
        ArrayList<TemplateStudent> list = new ArrayList<>();

        for (int i = start; i < end; i++) {
            TemplateStudent record = new TemplateStudent();
            record.setSid(i);
            record.setSname(nickname[batchNum]);
            record.setStatus(1);
            record.setTmpId(1);
            record.setCreateTime(1530363328);
            record.setUpdateTime(1530363330);
            list.add(record);
        }
        return list;
    }

    public static ArrayList<StudentInfo> buildStudentInfo(int start, int end) {
        ArrayList<StudentInfo> list = new ArrayList<>();

        for (int i = start; i < end; i++) {
            StudentInfo record = new StudentInfo();
            record.setGrd_level(1);
            record.setNickname(nickname[batchNum]);
            record.setMobile(String.valueOf(1707930000 + i * 10));
            list.add(record);
        }
        return list;
    }


    public static ArrayList<StudentClsHour> buildStudentClsHourLS(int start, int end) {
        ArrayList<StudentClsHour> list = new ArrayList<>();

        for (int i = start; i < end; i++) {
            StudentClsHour record = new StudentClsHour();
            record.setSid(i);
            record.setCls_type(10);
            record.setCls_hour(30);
            record.setCreate_time(1530363328);
            record.setExpire_time(1640966400);
            record.setFor_free(1);
            record.setOrder_id(0);
            record.setUse_level(1);
            record.setCls_hour_bak(30);
            record.setCls_type_bak(10);
            record.setExpire_time_bak(1530363328);

            list.add(record);
        }
        return list;
    }

    public static ArrayList<StudentLabels> buildStudentLabels(int start, int end) {
        ArrayList<StudentLabels> list = new ArrayList<>();

        for (int i = start; i < end; i++) {
            StudentLabels record = new StudentLabels();
            record.setSid(i);
            record.setLabel_id(75);
            record.setOperator(30);
            record.setCreate_time(1530363328);

            list.add(record);
        }
        return list;
    }
}
