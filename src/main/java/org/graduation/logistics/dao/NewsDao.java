package org.graduation.logistics.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.graduation.logistics.entity.bo.NewsBo;
import org.graduation.logistics.entity.pojo.News;
import org.graduation.logistics.entity.vo.NewsTitleVo;

import java.util.List;

public interface NewsDao extends BaseMapper<News> {
    @Select("<script>"
            + "SELECT "
            + "n.news_id AS newsId, "
            + "CASE WHEN #{language} = 1 THEN n.chinese_title ELSE n.english_title END AS title, "
            + "n.create_time AS createTime, "
            + "n.company_id AS companyId, "
            + "CASE WHEN #{language} = 1 THEN c.chinese_name ELSE c.english_name END AS companyName "
            + "FROM news n "
            + "LEFT JOIN company c ON n.company_id = c.company_id "
            + "WHERE n.company_id = #{companyId} "
            + "</script>")
    List<NewsTitleVo> selectNewsTitleVosByCompanyId(@Param("companyId") Integer companyId, @Param("language") Integer language);
    @Select("<script>"
            + "SELECT "
            + "n.news_id AS newsId, "
            + "CASE WHEN #{language} = 1 THEN n.chinese_title ELSE n.english_title END AS title, "
            + "n.countent AS content, "
            + "n.create_time AS createTime, "
            + "n.company_id AS companyId, "
            + "CASE WHEN #{language} = 1 THEN c.chinese_name ELSE c.english_name END AS companyName "
            + "FROM news n "
            + "LEFT JOIN company c ON n.company_id = c.company_id "
            + "WHERE n.news_id = #{newsId} "
            + "</script>")
    NewsBo selectNewsBoByNewsId(@Param("newsId") Integer newsId, @Param("language") Integer language);
}