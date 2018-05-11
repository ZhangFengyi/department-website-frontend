package com.baohao.departmentwebsitefrontend.common.util;

import static com.zwzx.common.utils.CodingUtil.md5;

public class EncryptUtils {
    public static Object md5Encrypt(Object o) {
        if (o == null) {
            return null;
        }
        return md5(o.toString());
    }
}
