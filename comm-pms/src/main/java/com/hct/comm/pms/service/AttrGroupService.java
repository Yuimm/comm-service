package com.hct.comm.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hct.comm.pms.entity.AttrGroupEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 属性分组
 *
 * @author Yuimm
 * @email Yuimm@atguigu.com
 * @date 2020-04-23 01:07:15
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);
}

