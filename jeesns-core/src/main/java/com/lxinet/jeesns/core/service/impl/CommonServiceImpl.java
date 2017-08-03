package com.lxinet.jeesns.core.service.impl;

import com.lxinet.jeesns.core.dao.ICommonDao;
import com.lxinet.jeesns.core.service.ICommonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zchuanzhao on 2017/2/6.
 */
@Service("commonService")
public class CommonServiceImpl implements ICommonService {
    @Resource
    private ICommonDao commonDao;

    @Override
    public String getMysqlVsesion() {
        return commonDao.getMysqlVsesion();
    }
}
