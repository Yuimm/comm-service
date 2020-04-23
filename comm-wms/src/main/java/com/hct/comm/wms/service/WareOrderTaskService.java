package com.hct.comm.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hct.comm.wms.entity.WareOrderTaskEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 库存工作单
 *
 * @author Yuimm
 * @email Yuimm@atguigu.com
 * @date 2020-04-23 10:00:01
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageVo queryPage(QueryCondition params);
}

