package org.xzhi.fm.store.impl;


import com.alibaba.fastjson.JSON;

import org.xzhi.fm.card.IQiYiCardService;
import org.xzhi.fm.store.CommodityService;

import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CardCommodityServiceImpl implements CommodityService {


    // 模拟注入
    private IQiYiCardService iQiYiCardService = new IQiYiCardService();

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        iQiYiCardService.grantToken(mobile, bizId);
        log.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        log.info("测试结果[爱奇艺兑换卡]：success");
    }

    private String queryUserMobile(String uId) {
        return "15200101232";
    }

}
