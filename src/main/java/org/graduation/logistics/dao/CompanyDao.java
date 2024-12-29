package org.graduation.logistics.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.graduation.logistics.entity.bo.CompanyBo;
import org.graduation.logistics.entity.pojo.Company;

import java.util.List;

public interface CompanyDao extends BaseMapper<Company> {
    @Select("<script>"
            + "SELECT "
            + "c.company_id AS companyId, "
            + "CASE WHEN #{language} = 1 THEN c.chinese_name ELSE c.english_name END AS name, "
            + "c.parent_company_id AS parentCompanyId, "
            + "CASE WHEN #{language} = 1 THEN p.chinese_name ELSE p.english_name END AS parentCompanyName, "
            + "c.province_id AS provinceId, "
            + "CASE WHEN #{language} = 1 THEN pr.chinese_name ELSE pr.english_name END AS provinceName, "
            + "c.location "
            + "FROM company c "
            + "LEFT JOIN company p ON c.parent_company_id = p.company_id "
            + "LEFT JOIN province pr ON c.province_id = pr.province_id "
            + "WHERE c.parent_company_id = #{parentCompanyId} "
            + "</script>")
    List<CompanyBo> selectCompanyBosByParentCompanyId(@Param("parentCompanyId") Integer parentCompanyId, @Param("language") Integer language);
    @Select("<script>"
            + "SELECT "
            + "c.company_id AS companyId, "
            + "CASE WHEN #{language} = 1 THEN c.chinese_name ELSE c.english_name END AS name, "
            + "c.parent_company_id AS parentCompanyId, "
            + "CASE WHEN #{language} = 1 THEN p.chinese_name ELSE p.english_name END AS parentCompanyName, "
            + "c.province_id AS provinceId, "
            + "CASE WHEN #{language} = 1 THEN pr.chinese_name ELSE pr.english_name END AS provinceName, "
            + "c.location "
            + "FROM company c "
            + "LEFT JOIN company p ON c.parent_company_id = p.company_id "
            + "LEFT JOIN province pr ON c.province_id = pr.province_id "
            + "WHERE c.company_id = #{companyId} "
            + "</script>")
    CompanyBo selectCompanyBoByCompanyId(@Param("companyId") Integer companyId, @Param("language") Integer language);
}