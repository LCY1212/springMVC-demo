package com.practice.utils;


import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate implements Converter<String,Date> {

    @Override
    public Date convert(String source) {
        if (StringUtils.isEmpty(source)){
            throw new RuntimeException("被转换的对象为空异常");
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = simpleDateFormat.parse(source);
            System.out.println(source);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException("转换数据不对！");
        }
    }
}
