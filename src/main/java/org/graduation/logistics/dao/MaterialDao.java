package org.graduation.logistics.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.graduation.logistics.entity.bo.MaterialBo;
import org.graduation.logistics.entity.pojo.Material;

import java.util.List;

public interface MaterialDao extends BaseMapper<Material> {
    @Select("<script>" +
            "SELECT " +
            "  m.material_id, " +
            "  m.model, " +
            "  m.specifications, " +
            "  m.amount, " +
            "  m.price, " +
            "  w.warehouse_id, " +
            "  CASE " +
            "    WHEN #{language} = 1 THEN w.chinese_name " +
            "    WHEN #{language} = 0 THEN w.english_name " +
            "  END AS warehouse_name, " +
            "  s.store_id, " +
            "  CASE " +
            "    WHEN #{language} = 1 THEN s.chinese_name " +
            "    WHEN #{language} = 0 THEN s.english_name " +
            "  END AS store_name, " +
            "  c.company_id, " +
            "  CASE " +
            "    WHEN #{language} = 1 THEN c.chinese_name " +
            "    WHEN #{language} = 0 THEN c.english_name " +
            "  END AS company_name, " +
            "  m.status, " +
            "  m.create_time " +
            "FROM material m " +
            "LEFT JOIN warehouse w ON m.warehouse_id = w.warehouse_id " +
            "LEFT JOIN store s ON m.store_id = s.store_id " +
            "LEFT JOIN company c ON m.company_id = c.company_id " +
            "WHERE m.material_id = #{materialId} " +
            "</script>")
    MaterialBo selectMaterialBoByMaterialId(@Param("materialId") Integer materialId, @Param("language") Integer language);

}
