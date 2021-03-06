package top.imuster.order.provider.service.impl;


import org.springframework.stereotype.Service;
import top.imuster.common.base.dao.BaseDao;
import top.imuster.common.base.service.BaseServiceImpl;
import top.imuster.order.api.pojo.OrderPaymentInfo;
import top.imuster.order.provider.dao.OrderPaymentInfoDao;
import top.imuster.order.provider.service.OrderPaymentInfoService;

import javax.annotation.Resource;

/**
 * OrderPaymentInfoService 实现类
 * @author 黄明人
 * @since 2019-11-26 10:46:26
 */
@Service("orderPaymentInfoService")
public class OrderPaymentInfoServiceImpl extends BaseServiceImpl<OrderPaymentInfo, Long> implements OrderPaymentInfoService {

    @Resource
    private OrderPaymentInfoDao orderPaymentInfoDao;

    @Override
    public BaseDao<OrderPaymentInfo, Long> getDao() {
        return this.orderPaymentInfoDao;
    }
}