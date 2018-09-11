package com.pcz.smart4j.framework.util;

import org.junit.Test;

import java.util.Set;

public class ClassUtilTest {

    @Test
    public void testGetClassSet() {
        Set<Class<?>> classSet = ClassUtil.getClassSet("com.pcz.smart4j.framework");
        System.out.println("Class set: ");
        for (Class<?> cls : classSet) {
            System.out.println(cls.getName());
        }
    }
}
