package com.example.sping_hibernate.utils;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;

public class EntityUtils {
    public static void copyPropertiesNotNull(Object source, Object destination) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        PropertyUtils.describe(source).forEach((key, value) -> {
            if (value != null) {
                try {
                    BeanUtils.copyProperty(destination, key, value);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
