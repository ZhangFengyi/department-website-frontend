package com.baohao.departmentwebsitefrontend.model;

import java.util.Date;

public class VisitInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_info.visit_id
     *
     * @mbg.generated
     */
    private Integer visitId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_info.visit_count
     *
     * @mbg.generated
     */
    private Integer visitCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_info.visit_time
     *
     * @mbg.generated
     */
    private Date visitTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column visit_info.visit_user_id
     *
     * @mbg.generated
     */
    private Integer visitUserId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_info.visit_id
     *
     * @return the value of visit_info.visit_id
     *
     * @mbg.generated
     */
    public Integer getVisitId() {
        return visitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_info.visit_id
     *
     * @param visitId the value for visit_info.visit_id
     *
     * @mbg.generated
     */
    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_info.visit_count
     *
     * @return the value of visit_info.visit_count
     *
     * @mbg.generated
     */
    public Integer getVisitCount() {
        return visitCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_info.visit_count
     *
     * @param visitCount the value for visit_info.visit_count
     *
     * @mbg.generated
     */
    public void setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_info.visit_time
     *
     * @return the value of visit_info.visit_time
     *
     * @mbg.generated
     */
    public Date getVisitTime() {
        return visitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_info.visit_time
     *
     * @param visitTime the value for visit_info.visit_time
     *
     * @mbg.generated
     */
    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column visit_info.visit_user_id
     *
     * @return the value of visit_info.visit_user_id
     *
     * @mbg.generated
     */
    public Integer getVisitUserId() {
        return visitUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column visit_info.visit_user_id
     *
     * @param visitUserId the value for visit_info.visit_user_id
     *
     * @mbg.generated
     */
    public void setVisitUserId(Integer visitUserId) {
        this.visitUserId = visitUserId;
    }
}