package com.data3.mc.persistence.dao;

import com.data3.mc.model.Invite;
import com.data3.mc.model.InviteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InviteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mc_invite
     *
     * @mbggenerated
     */
    int countByExample(InviteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mc_invite
     *
     * @mbggenerated
     */
    int deleteByExample(InviteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mc_invite
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mc_invite
     *
     * @mbggenerated
     */
    int insert(Invite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mc_invite
     *
     * @mbggenerated
     */
    int insertSelective(Invite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mc_invite
     *
     * @mbggenerated
     */
    List<Invite> selectByExample(InviteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mc_invite
     *
     * @mbggenerated
     */
    Invite selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mc_invite
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Invite record, @Param("example") InviteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mc_invite
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Invite record, @Param("example") InviteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mc_invite
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Invite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mc_invite
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Invite record);
}