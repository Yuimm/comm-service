package com.hct.comm.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hct.comm.pms.entity.SkuSaleAttrValueEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * sku销售属性&值
 *
 * @author Yuimm
 * @email Yuimm@atguigu.com
 * @date 2020-04-23 01:07:15
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageVo queryPage(QueryCondition params);
}

