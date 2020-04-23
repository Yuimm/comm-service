package com.hct.comm.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hct.comm.pms.entity.SkuImagesEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * sku图片
 *
 * @author Yuimm
 * @email Yuimm@atguigu.com
 * @date 2020-04-23 01:07:15
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageVo queryPage(QueryCondition params);
}

