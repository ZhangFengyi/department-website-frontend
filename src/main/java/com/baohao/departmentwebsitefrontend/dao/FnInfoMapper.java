package com.baohao.departmentwebsitefrontend.dao;

import com.baohao.departmentwebsitefrontend.model.FnInfo;
import com.baohao.departmentwebsitefrontend.model.FnInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FnInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fn_info
     *
     * @mbg.generated
     */
    long countByExample(FnInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fn_info
     *
     * @mbg.generated
     */
    int deleteByExample(FnInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fn_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer fnId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fn_info
     *
     * @mbg.generated
     */
    int insert(FnInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fn_info
     *
     * @mbg.generated
     */
    int insertSelective(FnInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fn_info
     *
     * @mbg.generated
     */
    List<FnInfo> selectByExample(FnInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fn_info
     *
     * @mbg.generated
     */
    FnInfo selectByPrimaryKey(Integer fnId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fn_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") FnInfo record, @Param("example") FnInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fn_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") FnInfo record, @Param("example") FnInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fn_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(FnInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fn_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FnInfo record);
}