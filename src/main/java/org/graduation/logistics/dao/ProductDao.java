package org.graduation.logistics.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.graduation.logistics.entity.bo.ProductBo;
import org.graduation.logistics.entity.pojo.Product;

import java.util.List;

public interface ProductDao extends BaseMapper<Product> {
    @Select("<script>"
            + "SELECT "
            + "p.product_id AS productId, "
            + "p.company_id AS companyId, "
            + "CASE WHEN #{language} = 1 THEN c.chinese_name ELSE c.english_name END AS companyName, "
            + "CASE WHEN #{language} = 1 THEN p.chinese_name ELSE p.english_name END AS name, "
            + "p.price, "
            + "FROM product p "
            + "LEFT JOIN company c ON p.company_id = c.company_id "
            + "WHERE p.company_id = #{companyId} "
            + "</script>")
    List<ProductBo> selectProductBosByCompanyId(@Param("companyId") Integer companyId, @Param("language") Integer language);
    @Select("<script>"
            + "SELECT "
            + "p.product_id AS productId, "
            + "p.company_id AS companyId, "
            + "CASE WHEN #{language} = 1 THEN c.chinese_name ELSE c.english_name END AS companyName, "
            + "CASE WHEN #{language} = 1 THEN p.chinese_name ELSE p.english_name END AS name, "
            + "p.price, "
            + "FROM product p "
            + "LEFT JOIN company c ON p.company_id = c.company_id "
            + "WHERE p.product_id = #{productId} "
            + "</script>")
    ProductBo selectProductBoByProductId(@Param("productId") Integer productId, @Param("language") Integer language);
}