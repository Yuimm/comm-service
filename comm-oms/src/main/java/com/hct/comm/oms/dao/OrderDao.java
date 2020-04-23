package com.hct.comm.oms.dao;

import com.hct.comm.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Yuimm
 * @email Yuimm@atguigu.com
 * @date 2020-04-23 09:37:44
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
