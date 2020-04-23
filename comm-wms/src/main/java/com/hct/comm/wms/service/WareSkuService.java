package com.hct.comm.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hct.comm.wms.entity.WareSkuEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品库存
 *
 * @author Yuimm
 * @email Yuimm@atguigu.com
 * @date 2020-04-23 10:00:01
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageVo queryPage(QueryCondition params);
}

