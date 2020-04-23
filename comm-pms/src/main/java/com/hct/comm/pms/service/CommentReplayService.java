package com.hct.comm.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hct.comm.pms.entity.CommentReplayEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品评价回复关系
 *
 * @author Yuimm
 * @email Yuimm@atguigu.com
 * @date 2020-04-23 01:07:14
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageVo queryPage(QueryCondition params);
}

