package com.hct.comm.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hct.comm.pms.entity.BrandEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 品牌
 *
 * @author Yuimm
 * @email Yuimm@atguigu.com
 * @date 2020-04-23 01:07:15
 */
public interface BrandService extends IService<BrandEntity> {

    PageVo queryPage(QueryCondition params);
}

