package com.mt.maven.court.entity;

public class Memorials {
    private Integer memorialsID;
    private String memorialsTitle;
    private String memorialsContent;

    //奏折摘要数据库没有，这里是为了配合页面显示
    private String memorialsContentDigest;
    private String memorialsEmp;

    //员工信息数据库也没有，这里是为了配合页面显示
    private String memorialsEmpName;
    private String memorialsCreateTime;
    private String feedbackTime;
    private String feedbackContent;
    private String memorialsStatus;

    public Memorials() {
    }

    public Memorials(Integer memorialsID, String memorialsTitle, String memorialsContent, String memorialsContentDigest,
                     String memorialsEmp, String memorialsEmpName, String memorialsCreateTime, String feedbackTime, String feedbackContent, String memorialsStatus) {
        this.memorialsID = memorialsID;
        this.memorialsTitle = memorialsTitle;
        this.memorialsContent = memorialsContent;
        this.memorialsContentDigest = memorialsContentDigest;
        this.memorialsEmp = memorialsEmp;
        this.memorialsEmpName = memorialsEmpName;
        this.memorialsCreateTime = memorialsCreateTime;
        this.feedbackTime = feedbackTime;
        this.feedbackContent = feedbackContent;
        this.memorialsStatus = memorialsStatus;
    }

    public Integer getMemorialsID() {
        return memorialsID;
    }

    public void setMemorialsID(Integer memorialsID) {
        this.memorialsID = memorialsID;
    }

    public String getMemorialsTitle() {
        return memorialsTitle;
    }

    public void setMemorialsTitle(String memorialsTitle) {
        this.memorialsTitle = memorialsTitle;
    }

    public String getMemorialsContent() {
        return memorialsContent;
    }

    public void setMemorialsContent(String memorialsContent) {
        this.memorialsContent = memorialsContent;
    }

    public String getMemorialsContentDigest() {
        return memorialsContentDigest;
    }

    public void setMemorialsContentDigest(String memorialsContentDigest) {
        this.memorialsContentDigest = memorialsContentDigest;
    }

    public String getMemorialsEmp() {
        return memorialsEmp;
    }

    public void setMemorialsEmp(String memorialsEmp) {
        this.memorialsEmp = memorialsEmp;
    }

    public String getMemorialsEmpName() {
        return memorialsEmpName;
    }

    public void setMemorialsEmpName(String memorialsEmpName) {
        this.memorialsEmpName = memorialsEmpName;
    }

    public String getMemorialsCreateTime() {
        return memorialsCreateTime;
    }

    public void setMemorialsCreateTime(String memorialsCreateTime) {
        this.memorialsCreateTime = memorialsCreateTime;
    }

    public String getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(String feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public String getMemorialsStatus() {
        return memorialsStatus;
    }

    public void setMemorialsStatus(String memorialsStatus) {
        this.memorialsStatus = memorialsStatus;
    }

    @Override
    public String toString() {
        return "Memorials{" +
                "memorialsID=" + memorialsID +
                ", memorialsTitle='" + memorialsTitle + '\'' +
                ", memorialsContent='" + memorialsContent + '\'' +
                ", memorialsContentDigest='" + memorialsContentDigest + '\'' +
                ", memorialsEmp='" + memorialsEmp + '\'' +
                ", memorialsEmpName='" + memorialsEmpName + '\'' +
                ", memorialsCreateTime='" + memorialsCreateTime + '\'' +
                ", feedbackTime='" + feedbackTime + '\'' +
                ", feedbackContent='" + feedbackContent + '\'' +
                ", memorialsStatus='" + memorialsStatus + '\'' +
                '}';
    }
}
