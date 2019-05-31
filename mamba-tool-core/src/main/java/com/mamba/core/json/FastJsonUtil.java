package com.mamba.core.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.JSONObject;


/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/5/31 17:35
 */
public class FastJsonUtil implements Json<JSONObject> {

    /**
     * 禁用BigDecimal转换
     */
    static {
        JSON.DEFAULT_PARSER_FEATURE &= ~Feature.UseBigDecimal.getMask();
    }

    @Override
    public String toJson(Object object) {
        return JSON.toJSONString(object);
    }

    @Override
    public JSONObject toObject(String jsonText) {
        return JSON.parseObject(jsonText);
    }
}