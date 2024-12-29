package org.graduation.logistics.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.graduation.logistics.entity.bo.StoreBo;
import org.graduation.logistics.entity.pojo.Store;

import java.util.List;

public interface StoreDao extends BaseMapper<Store> {
    @Select("<script>"
            + "SELECT "
            + "s.store_id AS storeId, "
            + "CASE WHEN #{language} = 1 THEN s.chinese_name ELSE s.english_name END AS name, "
            + "s.city_id AS cityId, "
            + "CASE WHEN #{language} = 1 THEN ct.chinese_name ELSE ct.english_name END AS cityName, "
            + "s.director_id AS directorId, "
            + "CASE WHEN #{language} = 1 THEN d.chinese_name ELSE d.english_name END AS directorName, "
            + "s.company_id AS companyId, "
            + "CASE WHEN #{language} = 1 THEN c.chinese_name ELSE c.english_name END AS companyName "
            + "FROM store s "
            + "LEFT JOIN city ct ON s.city_id = ct.city_id "
            + "LEFT JOIN director d ON s.director_id = d.director_id "
            + "LEFT JOIN company c ON s.company_id = c.company_id "
            + "WHERE s.company_id = #{companyId} "
            + "</script>")
    List<StoreBo> selectStoreBosByCompanyId(@Param("companyId") Integer companyId, @Param("language") Integer language);
    @Select("<script>"
            + "SELECT "
            + "s.store_id AS storeId, "
            + "CASE WHEN #{language} = 1 THEN s.chinese_name ELSE s.english_name END AS name, "
            + "s.city_id AS cityId, "
            + "CASE WHEN #{language} = 1 THEN ct.chinese_name ELSE ct.english_name END AS cityName, "
            + "s.director_id AS directorId, "
            + "CASE WHEN #{language} = 1 THEN d.chinese_name ELSE d.english_name END AS directorName, "
            + "s.company_id AS companyId, "
            + "CASE WHEN #{language} = 1 THEN c.chinese_name ELSE c.english_name END AS companyName "
            + "FROM store s "
            + "LEFT JOIN city ct ON s.city_id = ct.city_id "
            + "LEFT JOIN director d ON s.director_id = d.director_id "
            + "LEFT JOIN company c ON s.company_id = c.company_id "
            + "WHERE s.store_id = #{storeId} "
            + "</script>")
    StoreBo selectStoreBoByStoreId(@Param("storeId") Integer storeId, @Param("language") Integer language);
}