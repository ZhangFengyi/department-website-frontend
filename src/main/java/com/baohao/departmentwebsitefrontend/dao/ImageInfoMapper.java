package com.baohao.departmentwebsitefrontend.dao;

import com.baohao.departmentwebsitefrontend.model.ImageInfo;
import com.baohao.departmentwebsitefrontend.model.ImageInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImageInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated
     */
    long countByExample(ImageInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated
     */
    int deleteByExample(ImageInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer imgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated
     */
    int insert(ImageInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated
     */
    int insertSelective(ImageInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated
     */
    List<ImageInfo> selectByExample(ImageInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated
     */
    ImageInfo selectByPrimaryKey(Integer imgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ImageInfo record, @Param("example") ImageInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ImageInfo record, @Param("example") ImageInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ImageInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ImageInfo record);
}