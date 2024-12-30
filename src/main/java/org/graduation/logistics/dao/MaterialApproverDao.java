package org.graduation.logistics.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.graduation.logistics.entity.bo.MaterialApproverBo;
import org.graduation.logistics.entity.pojo.MaterialApprover;

import java.util.List;

public interface MaterialApproverDao extends BaseMapper<MaterialApprover> {
    @Select("<script>" +
            "SELECT " +
            "  ma.material_id, " +
            "  ma.approver_id, " +
            "  CASE " +
            "    WHEN #{language} = 1 THEN u.chinese_name " +
            "    WHEN #{language} = 0 THEN u.english_name " +
            "  END AS approver_name, " +
            "  ma.complete_time, " +
            "  ma.order, " +
            "  ma.status " +
            "FROM material_approver ma " +
            "LEFT JOIN user u ON ma.approver_id = u.user_id " +
            "WHERE ma.material_id = #{materialId} " +
            "ORDER BY ma.order ASC" +
            "</script>")
    List<MaterialApproverBo> selectMaterialApproverBosByMaterialId(
            @Param("materialId") Integer materialId,
            @Param("language") Integer language);
    @Select("<script>" +
            "SELECT " +
            "  ma.material_id, " +
            "  ma.approver_id, " +
            "  CASE " +
            "    WHEN #{language} = 1 THEN u.chinese_name " +
            "    WHEN #{language} = 0 THEN u.english_name " +
            "  END AS approver_name, " +
            "  ma.complete_time, " +
            "  ma.order, " +
            "  ma.status " +
            "FROM material_approver ma " +
            "LEFT JOIN user u ON ma.approver_id = u.user_id " +
            "WHERE ma.approver_id = #{approverId} " +
            "AND ma.status = #{status}" +
            "ORDER BY ma.order ASC" +
            "</script>")
    List<MaterialApproverBo> selectMaterialApproverBosByApproverIdAndStatus(
            @Param("approverId") Integer approverId,
            @Param("status") Byte status,
            @Param("language") Integer language);
}
