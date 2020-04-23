package com.hct.comm.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hct.comm.wms.entity.WareOrderTaskDetailEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 库存工作单
 *
 * @author Yuimm
 * @email Yuimm@atguigu.com
 * @date 2020-04-23 10:00:01
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageVo queryPage(QueryCondition params);
}

