package com.mamba.core.file;

import com.mamba.core.string.StringUtils;

/**
 * @Author JoeBig7
 * @date 2021/12/14 17:20:33
 * @description 获取文件后缀
 */
public class FileUtils {

    private static final String SEPARATOR_DOT = ".";

    /**
     * 获取文件后缀名
     *
     * @param path
     * @return
     */
    public static String suffix(String path) {
        if (StringUtils.isEmpty(path)) {
            return null;
        }
        int index = path.lastIndexOf(SEPARATOR_DOT);
        if (index >= 0) {
            return path.substring(path.lastIndexOf(SEPARATOR_DOT) + 1);
        }
        return null;
    }
}
