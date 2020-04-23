package com.hct.comm.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hct.comm.sms.entity.SpuFullReductionEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品满减信息
 *
 * @author Yuimm
 * @email Yuimm@atguigu.com
 * @date 2020-04-23 09:43:10
 */
public interface SpuFullReductionService extends IService<SpuFullReductionEntity> {

    PageVo queryPage(QueryCondition params);
}

