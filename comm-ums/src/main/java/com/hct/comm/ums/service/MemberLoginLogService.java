package com.hct.comm.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hct.comm.ums.entity.MemberLoginLogEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员登录记录
 *
 * @author Yuimm
 * @email Yuimm@atguigu.com
 * @date 2020-04-23 09:49:54
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageVo queryPage(QueryCondition params);
}

