package com.baohao.departmentwebsitefrontend.model;

import java.util.Date;

public class ArticleList {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_list.arl_id
     *
     * @mbg.generated
     */
    private Integer arlId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_list.arl_name
     *
     * @mbg.generated
     */
    private String arlName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_list.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_list.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_list.arl_id
     *
     * @return the value of article_list.arl_id
     *
     * @mbg.generated
     */
    public Integer getArlId() {
        return arlId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_list.arl_id
     *
     * @param arlId the value for article_list.arl_id
     *
     * @mbg.generated
     */
    public void setArlId(Integer arlId) {
        this.arlId = arlId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_list.arl_name
     *
     * @return the value of article_list.arl_name
     *
     * @mbg.generated
     */
    public String getArlName() {
        return arlName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_list.arl_name
     *
     * @param arlName the value for article_list.arl_name
     *
     * @mbg.generated
     */
    public void setArlName(String arlName) {
        this.arlName = arlName == null ? null : arlName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_list.create_time
     *
     * @return the value of article_list.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_list.create_time
     *
     * @param createTime the value for article_list.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_list.update_time
     *
     * @return the value of article_list.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_list.update_time
     *
     * @param updateTime the value for article_list.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}