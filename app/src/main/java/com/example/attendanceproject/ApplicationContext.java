package com.example.attendanceproject;

import java.util.ArrayList;

public class ApplicationContext {
    private facultBean facultyBean;
    private AttendanceSessionBean attendanceSessionBean;
    private ArrayList<StudentBean> studentBeanList;
    private ArrayList<AttendanceBean> attendanceBeanList;

    public facultBean getFacultyBean() {
        return facultyBean;
    }
    public void setFacultyBean(facultBean facultyBean) {
        this.facultyBean = facultyBean;
    }
    public AttendanceSessionBean getAttendanceSessionBean() {
        return attendanceSessionBean;
    }
    public void setAttendanceSessionBean(AttendanceSessionBean attendanceSessionBean) {
        this.attendanceSessionBean = attendanceSessionBean;
    }
    public ArrayList<StudentBean> getStudentBeanList() {
        return studentBeanList;
    }
    public void setStudentBeanList(ArrayList<StudentBean> studentBeanList) {
        this.studentBeanList = studentBeanList;
    }
    public ArrayList<AttendanceBean> getAttendanceBeanList() {
        return attendanceBeanList;
    }
    public void setAttendanceBeanList(ArrayList<AttendanceBean> attendanceBeanList) {
        this.attendanceBeanList = attendanceBeanList;
    }

}
