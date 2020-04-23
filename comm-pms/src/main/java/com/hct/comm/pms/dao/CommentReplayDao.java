package com.hct.comm.pms.dao;

import com.hct.comm.pms.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author Yuimm
 * @email Yuimm@atguigu.com
 * @date 2020-04-23 01:07:14
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
