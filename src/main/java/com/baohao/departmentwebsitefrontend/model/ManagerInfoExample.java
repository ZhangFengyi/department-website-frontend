package com.baohao.departmentwebsitefrontend.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagerInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table manager_info
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table manager_info
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table manager_info
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_info
     *
     * @mbg.generated
     */
    public ManagerInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_info
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_info
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_info
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_info
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_info
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_info
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_info
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_info
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_info
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager_info
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table manager_info
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMagIdIsNull() {
            addCriterion("mag_id is null");
            return (Criteria) this;
        }

        public Criteria andMagIdIsNotNull() {
            addCriterion("mag_id is not null");
            return (Criteria) this;
        }

        public Criteria andMagIdEqualTo(Integer value) {
            addCriterion("mag_id =", value, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdNotEqualTo(Integer value) {
            addCriterion("mag_id <>", value, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdGreaterThan(Integer value) {
            addCriterion("mag_id >", value, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mag_id >=", value, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdLessThan(Integer value) {
            addCriterion("mag_id <", value, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdLessThanOrEqualTo(Integer value) {
            addCriterion("mag_id <=", value, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdIn(List<Integer> values) {
            addCriterion("mag_id in", values, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdNotIn(List<Integer> values) {
            addCriterion("mag_id not in", values, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdBetween(Integer value1, Integer value2) {
            addCriterion("mag_id between", value1, value2, "magId");
            return (Criteria) this;
        }

        public Criteria andMagIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mag_id not between", value1, value2, "magId");
            return (Criteria) this;
        }

        public Criteria andMagEmailIsNull() {
            addCriterion("mag_email is null");
            return (Criteria) this;
        }

        public Criteria andMagEmailIsNotNull() {
            addCriterion("mag_email is not null");
            return (Criteria) this;
        }

        public Criteria andMagEmailEqualTo(String value) {
            addCriterion("mag_email =", value, "magEmail");
            return (Criteria) this;
        }

        public Criteria andMagEmailNotEqualTo(String value) {
            addCriterion("mag_email <>", value, "magEmail");
            return (Criteria) this;
        }

        public Criteria andMagEmailGreaterThan(String value) {
            addCriterion("mag_email >", value, "magEmail");
            return (Criteria) this;
        }

        public Criteria andMagEmailGreaterThanOrEqualTo(String value) {
            addCriterion("mag_email >=", value, "magEmail");
            return (Criteria) this;
        }

        public Criteria andMagEmailLessThan(String value) {
            addCriterion("mag_email <", value, "magEmail");
            return (Criteria) this;
        }

        public Criteria andMagEmailLessThanOrEqualTo(String value) {
            addCriterion("mag_email <=", value, "magEmail");
            return (Criteria) this;
        }

        public Criteria andMagEmailLike(String value) {
            addCriterion("mag_email like", value, "magEmail");
            return (Criteria) this;
        }

        public Criteria andMagEmailNotLike(String value) {
            addCriterion("mag_email not like", value, "magEmail");
            return (Criteria) this;
        }

        public Criteria andMagEmailIn(List<String> values) {
            addCriterion("mag_email in", values, "magEmail");
            return (Criteria) this;
        }

        public Criteria andMagEmailNotIn(List<String> values) {
            addCriterion("mag_email not in", values, "magEmail");
            return (Criteria) this;
        }

        public Criteria andMagEmailBetween(String value1, String value2) {
            addCriterion("mag_email between", value1, value2, "magEmail");
            return (Criteria) this;
        }

        public Criteria andMagEmailNotBetween(String value1, String value2) {
            addCriterion("mag_email not between", value1, value2, "magEmail");
            return (Criteria) this;
        }

        public Criteria andMagPwdIsNull() {
            addCriterion("mag_pwd is null");
            return (Criteria) this;
        }

        public Criteria andMagPwdIsNotNull() {
            addCriterion("mag_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andMagPwdEqualTo(String value) {
            addCriterion("mag_pwd =", value, "magPwd");
            return (Criteria) this;
        }

        public Criteria andMagPwdNotEqualTo(String value) {
            addCriterion("mag_pwd <>", value, "magPwd");
            return (Criteria) this;
        }

        public Criteria andMagPwdGreaterThan(String value) {
            addCriterion("mag_pwd >", value, "magPwd");
            return (Criteria) this;
        }

        public Criteria andMagPwdGreaterThanOrEqualTo(String value) {
            addCriterion("mag_pwd >=", value, "magPwd");
            return (Criteria) this;
        }

        public Criteria andMagPwdLessThan(String value) {
            addCriterion("mag_pwd <", value, "magPwd");
            return (Criteria) this;
        }

        public Criteria andMagPwdLessThanOrEqualTo(String value) {
            addCriterion("mag_pwd <=", value, "magPwd");
            return (Criteria) this;
        }

        public Criteria andMagPwdLike(String value) {
            addCriterion("mag_pwd like", value, "magPwd");
            return (Criteria) this;
        }

        public Criteria andMagPwdNotLike(String value) {
            addCriterion("mag_pwd not like", value, "magPwd");
            return (Criteria) this;
        }

        public Criteria andMagPwdIn(List<String> values) {
            addCriterion("mag_pwd in", values, "magPwd");
            return (Criteria) this;
        }

        public Criteria andMagPwdNotIn(List<String> values) {
            addCriterion("mag_pwd not in", values, "magPwd");
            return (Criteria) this;
        }

        public Criteria andMagPwdBetween(String value1, String value2) {
            addCriterion("mag_pwd between", value1, value2, "magPwd");
            return (Criteria) this;
        }

        public Criteria andMagPwdNotBetween(String value1, String value2) {
            addCriterion("mag_pwd not between", value1, value2, "magPwd");
            return (Criteria) this;
        }

        public Criteria andMagNameIsNull() {
            addCriterion("mag_name is null");
            return (Criteria) this;
        }

        public Criteria andMagNameIsNotNull() {
            addCriterion("mag_name is not null");
            return (Criteria) this;
        }

        public Criteria andMagNameEqualTo(String value) {
            addCriterion("mag_name =", value, "magName");
            return (Criteria) this;
        }

        public Criteria andMagNameNotEqualTo(String value) {
            addCriterion("mag_name <>", value, "magName");
            return (Criteria) this;
        }

        public Criteria andMagNameGreaterThan(String value) {
            addCriterion("mag_name >", value, "magName");
            return (Criteria) this;
        }

        public Criteria andMagNameGreaterThanOrEqualTo(String value) {
            addCriterion("mag_name >=", value, "magName");
            return (Criteria) this;
        }

        public Criteria andMagNameLessThan(String value) {
            addCriterion("mag_name <", value, "magName");
            return (Criteria) this;
        }

        public Criteria andMagNameLessThanOrEqualTo(String value) {
            addCriterion("mag_name <=", value, "magName");
            return (Criteria) this;
        }

        public Criteria andMagNameLike(String value) {
            addCriterion("mag_name like", value, "magName");
            return (Criteria) this;
        }

        public Criteria andMagNameNotLike(String value) {
            addCriterion("mag_name not like", value, "magName");
            return (Criteria) this;
        }

        public Criteria andMagNameIn(List<String> values) {
            addCriterion("mag_name in", values, "magName");
            return (Criteria) this;
        }

        public Criteria andMagNameNotIn(List<String> values) {
            addCriterion("mag_name not in", values, "magName");
            return (Criteria) this;
        }

        public Criteria andMagNameBetween(String value1, String value2) {
            addCriterion("mag_name between", value1, value2, "magName");
            return (Criteria) this;
        }

        public Criteria andMagNameNotBetween(String value1, String value2) {
            addCriterion("mag_name not between", value1, value2, "magName");
            return (Criteria) this;
        }

        public Criteria andMagImageIsNull() {
            addCriterion("mag_image is null");
            return (Criteria) this;
        }

        public Criteria andMagImageIsNotNull() {
            addCriterion("mag_image is not null");
            return (Criteria) this;
        }

        public Criteria andMagImageEqualTo(String value) {
            addCriterion("mag_image =", value, "magImage");
            return (Criteria) this;
        }

        public Criteria andMagImageNotEqualTo(String value) {
            addCriterion("mag_image <>", value, "magImage");
            return (Criteria) this;
        }

        public Criteria andMagImageGreaterThan(String value) {
            addCriterion("mag_image >", value, "magImage");
            return (Criteria) this;
        }

        public Criteria andMagImageGreaterThanOrEqualTo(String value) {
            addCriterion("mag_image >=", value, "magImage");
            return (Criteria) this;
        }

        public Criteria andMagImageLessThan(String value) {
            addCriterion("mag_image <", value, "magImage");
            return (Criteria) this;
        }

        public Criteria andMagImageLessThanOrEqualTo(String value) {
            addCriterion("mag_image <=", value, "magImage");
            return (Criteria) this;
        }

        public Criteria andMagImageLike(String value) {
            addCriterion("mag_image like", value, "magImage");
            return (Criteria) this;
        }

        public Criteria andMagImageNotLike(String value) {
            addCriterion("mag_image not like", value, "magImage");
            return (Criteria) this;
        }

        public Criteria andMagImageIn(List<String> values) {
            addCriterion("mag_image in", values, "magImage");
            return (Criteria) this;
        }

        public Criteria andMagImageNotIn(List<String> values) {
            addCriterion("mag_image not in", values, "magImage");
            return (Criteria) this;
        }

        public Criteria andMagImageBetween(String value1, String value2) {
            addCriterion("mag_image between", value1, value2, "magImage");
            return (Criteria) this;
        }

        public Criteria andMagImageNotBetween(String value1, String value2) {
            addCriterion("mag_image not between", value1, value2, "magImage");
            return (Criteria) this;
        }

        public Criteria andMagLoginTimeIsNull() {
            addCriterion("mag_login_time is null");
            return (Criteria) this;
        }

        public Criteria andMagLoginTimeIsNotNull() {
            addCriterion("mag_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andMagLoginTimeEqualTo(Date value) {
            addCriterion("mag_login_time =", value, "magLoginTime");
            return (Criteria) this;
        }

        public Criteria andMagLoginTimeNotEqualTo(Date value) {
            addCriterion("mag_login_time <>", value, "magLoginTime");
            return (Criteria) this;
        }

        public Criteria andMagLoginTimeGreaterThan(Date value) {
            addCriterion("mag_login_time >", value, "magLoginTime");
            return (Criteria) this;
        }

        public Criteria andMagLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mag_login_time >=", value, "magLoginTime");
            return (Criteria) this;
        }

        public Criteria andMagLoginTimeLessThan(Date value) {
            addCriterion("mag_login_time <", value, "magLoginTime");
            return (Criteria) this;
        }

        public Criteria andMagLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("mag_login_time <=", value, "magLoginTime");
            return (Criteria) this;
        }

        public Criteria andMagLoginTimeIn(List<Date> values) {
            addCriterion("mag_login_time in", values, "magLoginTime");
            return (Criteria) this;
        }

        public Criteria andMagLoginTimeNotIn(List<Date> values) {
            addCriterion("mag_login_time not in", values, "magLoginTime");
            return (Criteria) this;
        }

        public Criteria andMagLoginTimeBetween(Date value1, Date value2) {
            addCriterion("mag_login_time between", value1, value2, "magLoginTime");
            return (Criteria) this;
        }

        public Criteria andMagLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("mag_login_time not between", value1, value2, "magLoginTime");
            return (Criteria) this;
        }

        public Criteria andMagLoginIpIsNull() {
            addCriterion("mag_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andMagLoginIpIsNotNull() {
            addCriterion("mag_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMagLoginIpEqualTo(String value) {
            addCriterion("mag_login_ip =", value, "magLoginIp");
            return (Criteria) this;
        }

        public Criteria andMagLoginIpNotEqualTo(String value) {
            addCriterion("mag_login_ip <>", value, "magLoginIp");
            return (Criteria) this;
        }

        public Criteria andMagLoginIpGreaterThan(String value) {
            addCriterion("mag_login_ip >", value, "magLoginIp");
            return (Criteria) this;
        }

        public Criteria andMagLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("mag_login_ip >=", value, "magLoginIp");
            return (Criteria) this;
        }

        public Criteria andMagLoginIpLessThan(String value) {
            addCriterion("mag_login_ip <", value, "magLoginIp");
            return (Criteria) this;
        }

        public Criteria andMagLoginIpLessThanOrEqualTo(String value) {
            addCriterion("mag_login_ip <=", value, "magLoginIp");
            return (Criteria) this;
        }

        public Criteria andMagLoginIpLike(String value) {
            addCriterion("mag_login_ip like", value, "magLoginIp");
            return (Criteria) this;
        }

        public Criteria andMagLoginIpNotLike(String value) {
            addCriterion("mag_login_ip not like", value, "magLoginIp");
            return (Criteria) this;
        }

        public Criteria andMagLoginIpIn(List<String> values) {
            addCriterion("mag_login_ip in", values, "magLoginIp");
            return (Criteria) this;
        }

        public Criteria andMagLoginIpNotIn(List<String> values) {
            addCriterion("mag_login_ip not in", values, "magLoginIp");
            return (Criteria) this;
        }

        public Criteria andMagLoginIpBetween(String value1, String value2) {
            addCriterion("mag_login_ip between", value1, value2, "magLoginIp");
            return (Criteria) this;
        }

        public Criteria andMagLoginIpNotBetween(String value1, String value2) {
            addCriterion("mag_login_ip not between", value1, value2, "magLoginIp");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table manager_info
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table manager_info
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}