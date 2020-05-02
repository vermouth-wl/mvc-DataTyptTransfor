package com.mvc.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname StringToDateConverter
 * @Description TODO 工具类，将String类型的生日字段转换为与entity中相匹配的Date类型
 * @Author 将烬星火是否太炽热, 明日黄花会开败阡陌
 * @Date 2020-05-02 17:09
 * @Version 1.0
 **/
public class StringToDateConverter implements Converter<String, Date> {

    private String datePattern; //  日期类型模板

    /* set()方法 */
    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }

    @Override
    public Date convert(String date) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.datePattern);
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("日期转换失败");
            return null;
        }
    }
}
