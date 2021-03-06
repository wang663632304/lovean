package com.xuan.lovean.anDb.helper.table;

import java.text.SimpleDateFormat;

/**
 * 键值对封装
 * 
 * @author xuan
 * @version $Revision: 1.0 $, $Date: 2013-4-8 上午9:36:48 $
 */
public class KeyValue {
    private String key;
    private Object value;

    public KeyValue(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public KeyValue() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public Object getValue() {
        if (value instanceof java.util.Date || value instanceof java.sql.Date) {
            return sdf.format(value);
        }
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
