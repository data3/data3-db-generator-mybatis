package com.data3.mc.model;

import com.data3.my.base.model.BasePo;

public class Privilege extends BasePo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mc_privilege.f_id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mc_privilege.f_code
     *
     * @mbggenerated
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mc_privilege.f_name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mc_privilege.f_res_type_id
     *
     * @mbggenerated
     */
    private Integer resTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mc_privilege.f_res_id
     *
     * @mbggenerated
     */
    private Integer resId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mc_privilege.f_oper_id
     *
     * @mbggenerated
     */
    private Integer operId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mc_privilege.f_state
     *
     * @mbggenerated
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_mc_privilege.f_create_time
     *
     * @mbggenerated
     */
    private Integer createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mc_privilege.f_id
     *
     * @return the value of t_mc_privilege.f_id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mc_privilege.f_id
     *
     * @param id the value for t_mc_privilege.f_id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mc_privilege.f_code
     *
     * @return the value of t_mc_privilege.f_code
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mc_privilege.f_code
     *
     * @param code the value for t_mc_privilege.f_code
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mc_privilege.f_name
     *
     * @return the value of t_mc_privilege.f_name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mc_privilege.f_name
     *
     * @param name the value for t_mc_privilege.f_name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mc_privilege.f_res_type_id
     *
     * @return the value of t_mc_privilege.f_res_type_id
     *
     * @mbggenerated
     */
    public Integer getResTypeId() {
        return resTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mc_privilege.f_res_type_id
     *
     * @param resTypeId the value for t_mc_privilege.f_res_type_id
     *
     * @mbggenerated
     */
    public void setResTypeId(Integer resTypeId) {
        this.resTypeId = resTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mc_privilege.f_res_id
     *
     * @return the value of t_mc_privilege.f_res_id
     *
     * @mbggenerated
     */
    public Integer getResId() {
        return resId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mc_privilege.f_res_id
     *
     * @param resId the value for t_mc_privilege.f_res_id
     *
     * @mbggenerated
     */
    public void setResId(Integer resId) {
        this.resId = resId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mc_privilege.f_oper_id
     *
     * @return the value of t_mc_privilege.f_oper_id
     *
     * @mbggenerated
     */
    public Integer getOperId() {
        return operId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mc_privilege.f_oper_id
     *
     * @param operId the value for t_mc_privilege.f_oper_id
     *
     * @mbggenerated
     */
    public void setOperId(Integer operId) {
        this.operId = operId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mc_privilege.f_state
     *
     * @return the value of t_mc_privilege.f_state
     *
     * @mbggenerated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mc_privilege.f_state
     *
     * @param state the value for t_mc_privilege.f_state
     *
     * @mbggenerated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_mc_privilege.f_create_time
     *
     * @return the value of t_mc_privilege.f_create_time
     *
     * @mbggenerated
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_mc_privilege.f_create_time
     *
     * @param createTime the value for t_mc_privilege.f_create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
}