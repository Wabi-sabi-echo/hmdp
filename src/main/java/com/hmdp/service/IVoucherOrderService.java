package com.hmdp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hmdp.dto.Result;
import com.hmdp.entity.VoucherOrder;

/**
 * ivoucher订单服务
 * <p>
 * 服务类
 * </p>
 *
 * @author 虎哥
 * @date 2022/10/09
 * @since 2021-12-22
 */
public interface IVoucherOrderService extends IService<VoucherOrder> {

    /**
     * 秒杀优惠券
     *
     * @param voucherId 券id
     * @return {@link Result}
     */
    Result seckillVoucher(Long voucherId);

    /**
     * 得到结果
     *
     * @param voucherId 券id
     * @return {@link Result}
     */
    Result getResult(Long voucherId);
    void createVoucherOrder(VoucherOrder voucherOrder);
}
