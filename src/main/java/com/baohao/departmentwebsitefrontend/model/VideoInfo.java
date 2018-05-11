package com.baohao.departmentwebsitefrontend.model;

import java.util.Date;

public class VideoInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_info.video_id
     *
     * @mbg.generated
     */
    private Integer videoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_info.video_name
     *
     * @mbg.generated
     */
    private String videoName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_info.video_group_id
     *
     * @mbg.generated
     */
    private Integer videoGroupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_info.video_path
     *
     * @mbg.generated
     */
    private String videoPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column video_info.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_info.video_id
     *
     * @return the value of video_info.video_id
     *
     * @mbg.generated
     */
    public Integer getVideoId() {
        return videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_info.video_id
     *
     * @param videoId the value for video_info.video_id
     *
     * @mbg.generated
     */
    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_info.video_name
     *
     * @return the value of video_info.video_name
     *
     * @mbg.generated
     */
    public String getVideoName() {
        return videoName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_info.video_name
     *
     * @param videoName the value for video_info.video_name
     *
     * @mbg.generated
     */
    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_info.video_group_id
     *
     * @return the value of video_info.video_group_id
     *
     * @mbg.generated
     */
    public Integer getVideoGroupId() {
        return videoGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_info.video_group_id
     *
     * @param videoGroupId the value for video_info.video_group_id
     *
     * @mbg.generated
     */
    public void setVideoGroupId(Integer videoGroupId) {
        this.videoGroupId = videoGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_info.video_path
     *
     * @return the value of video_info.video_path
     *
     * @mbg.generated
     */
    public String getVideoPath() {
        return videoPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_info.video_path
     *
     * @param videoPath the value for video_info.video_path
     *
     * @mbg.generated
     */
    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath == null ? null : videoPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column video_info.create_time
     *
     * @return the value of video_info.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column video_info.create_time
     *
     * @param createTime the value for video_info.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}