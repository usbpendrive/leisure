package com.github.hicolors.leisure.common.framework.springmvc.enhance;

/**
 * ErrorSourceHandler
 *
 * @author weichao.li (liweichao0102@gmail.com)
 * @date 2018/5/25
 */

public interface ErrorSourceHandler {

    /**
     * 当前 handler 是否支持当前 对象
     *
     * @param t
     * @return
     */
    boolean support(ErrorSource t);

    /**
     * 处理逻辑
     *
     * @param t
     */
    void dispose(ErrorSource t);
}