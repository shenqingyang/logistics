package org.graduation.logistics.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.graduation.logistics.entity.bo.ChannelBo;
import org.graduation.logistics.entity.pojo.Channel;

import java.util.List;

public interface ChannelDao extends BaseMapper<Channel> {
    @Select("<script>"
            + "SELECT "
            + "c.channel_id AS channelId, "
            + "IF(${language}=1, c.chinese_name, c.english_name) AS name, "
            + "c.default_price AS defaultPrice, "
            + "c.expiration_date AS expirationDate, "
            + "c.discount AS discount, "
            + "c.company_id AS companyId, "
            + "IF(${language}=1, co.chinese_name, co.english_name) AS companyName "
            + "FROM channel c "
            + "LEFT JOIN company co ON c.company_id = co.company_id "
            + "WHERE c.company_id = #{companyId} "
            + "</script>")
    List<ChannelBo> selectChannelBosByCompanyId(@Param("companyId") Integer companyId, @Param("language") Integer language);
}