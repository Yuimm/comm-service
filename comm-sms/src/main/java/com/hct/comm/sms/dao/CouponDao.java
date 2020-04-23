package com.hct.comm.sms.dao;

import com.hct.comm.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Yuimm
 * @email Yuimm@atguigu.com
 * @date 2020-04-23 09:43:11
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
