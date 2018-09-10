package com.github.hicolors.leisure.common.framework.springmvc.enhance;

import com.github.hicolors.leisure.common.framework.springmvc.response.ErrorResponse;
import org.springframework.context.ApplicationEvent;

/**
 * 发生错误时的 spring 事件
 *
 * @author 李伟超
 * @date 2017/10/29
 */
public class ErrorEvent extends ApplicationEvent {

    public ErrorEvent(ErrorResponse error, Object data) {
        super(new ErrorSource(error, data));
    }

    public ErrorResponse getError() {
        return ((ErrorSource) this.getSource()).getError();
    }

    public Object getData() {
        return ((ErrorSource) this.getSource()).getData();
    }

}
