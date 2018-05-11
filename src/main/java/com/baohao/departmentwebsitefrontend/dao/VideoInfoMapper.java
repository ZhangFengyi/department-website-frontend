package com.baohao.departmentwebsitefrontend.dao;

import com.baohao.departmentwebsitefrontend.model.VideoInfo;
import com.baohao.departmentwebsitefrontend.model.VideoInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VideoInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_info
     *
     * @mbg.generated
     */
    long countByExample(VideoInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_info
     *
     * @mbg.generated
     */
    int deleteByExample(VideoInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer videoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_info
     *
     * @mbg.generated
     */
    int insert(VideoInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_info
     *
     * @mbg.generated
     */
    int insertSelective(VideoInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_info
     *
     * @mbg.generated
     */
    List<VideoInfo> selectByExample(VideoInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_info
     *
     * @mbg.generated
     */
    VideoInfo selectByPrimaryKey(Integer videoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") VideoInfo record, @Param("example") VideoInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") VideoInfo record, @Param("example") VideoInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(VideoInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(VideoInfo record);
}