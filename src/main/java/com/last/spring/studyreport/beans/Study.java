package com.last.spring.studyreport.beans;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Study implements Comparable{

    private String projectName;
    private int minutes;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMM-yyyy")
    private Date dateStr;

    public Study() {}

    public Study(String projectName, int minutes, Date date) {
        this.projectName = projectName;
        this.minutes = minutes;
        this.dateStr = date;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public Date getDateStr() {
        return dateStr;
    }
    
    public String getCorrectedDate(){
        String pattern = "E, MM/dd/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(this.dateStr);  
        return date;
    }

    public void setDateStr(Date dateStr) {
        this.dateStr = dateStr;
    }

    @Override
    public String toString() {
        return "Study{" + "projectName=" + projectName + ", minutes=" + minutes + ", date=" + getCorrectedDate() + '}';
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    
}
