package com.hct.comm.pms.dao;

import com.hct.comm.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Yuimm
 * @email Yuimm@atguigu.com
 * @date 2020-04-23 01:07:15
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
