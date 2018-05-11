package com.baohao.departmentwebsitefrontend.common;

import com.zwzx.common.spring.PropertiesConfigurer;
import org.thymeleaf.util.StringUtils;

public class GlobalConfigurations {
    public static boolean isReleaseMode() {
        return StringUtils.equalsIgnoreCase(PropertiesConfigurer.getProperty("run.mode", "local"), "release");
    }
}
