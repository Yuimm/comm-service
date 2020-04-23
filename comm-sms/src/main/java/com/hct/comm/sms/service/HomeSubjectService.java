package com.hct.comm.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hct.comm.sms.entity.HomeSubjectEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author Yuimm
 * @email Yuimm@atguigu.com
 * @date 2020-04-23 09:43:10
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageVo queryPage(QueryCondition params);
}
