package org.graduation.logistics.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.graduation.logistics.entity.bo.AddressBo;
import org.graduation.logistics.entity.pojo.Address;

import java.util.List;

public interface AddressDao extends BaseMapper<Address> {
    @Select("<script>" +
            "SELECT " +
            "a.address_id as addressId, " +
            "a.name as name, " +
            "a.country_id as countryId, " +
            "a.phone as phone" +
            "COALESCE(CASE WHEN #{language} = 1 THEN c.chinese_name ELSE c.english_name END, '') as countryName, " +
            "a.city_id as cityId, " +
            "COALESCE(CASE WHEN #{language} = 1 THEN ct.chinese_name ELSE ct.english_name END, '') as cityName, " +
            "a.province_id as provinceId, " +
            "COALESCE(CASE WHEN #{language} = 1 THEN p.chinese_name ELSE p.english_name END, '') as provinceName, " +
            "a.district_id as districtId, " +
            "COALESCE(CASE WHEN #{language} = 1 THEN d.chinese_name ELSE d.english_name END, '') as districtName, " +
            "a.location as location, " +
            "a.zip_code as zipCode, " +
            "a.type as type, " +
            "a.user_id as userId " +
            "FROM address a " +
            "LEFT JOIN country c ON a.country_id = c.country_id " +
            "LEFT JOIN city ct ON a.city_id = ct.city_id " +
            "LEFT JOIN province p ON a.province_id = p.province_id " +
            "LEFT JOIN district d ON a.district_id = d.district_id " +
            "WHERE a.user_id = #{userId} " +
            "AND a.type = #{type} " +
            "</script>")
    List<AddressBo> selectAddressBosByUserIdAndType(@Param("userId") Integer userId,
                                                           @Param("type") Byte type,
                                                           @Param("language") Byte language);
    @Select("<script>" +
            "SELECT " +
            "a.address_id as addressId, " +
            "a.name as name, " +
            "a.country_id as countryId, " +
            "a.phone as phone" +
            "COALESCE(CASE WHEN #{language} = 1 THEN c.chinese_name ELSE c.english_name END, '') as countryName, " +
            "a.city_id as cityId, " +
            "COALESCE(CASE WHEN #{language} = 1 THEN ct.chinese_name ELSE ct.english_name END, '') as cityName, " +
            "a.province_id as provinceId, " +
            "COALESCE(CASE WHEN #{language} = 1 THEN p.chinese_name ELSE p.english_name END, '') as provinceName, " +
            "a.district_id as districtId, " +
            "COALESCE(CASE WHEN #{language} = 1 THEN d.chinese_name ELSE d.english_name END, '') as districtName, " +
            "a.location as location, " +
            "a.zip_code as zipCode, " +
            "a.type as type, " +
            "a.user_id as userId " +
            "FROM address a " +
            "LEFT JOIN country c ON a.country_id = c.country_id " +
            "LEFT JOIN city ct ON a.city_id = ct.city_id " +
            "LEFT JOIN province p ON a.province_id = p.province_id " +
            "LEFT JOIN district d ON a.district_id = d.district_id " +
            "WHERE a.address_id = #{addressId} " +
            "</script>")
    AddressBo selectAddressBoByAddressId(@Param("addressId") Integer addressId,@Param("language") Byte language);


}