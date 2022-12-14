package com.design.pattern.strategy;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.strategy
 * @className MsgResult
 * @author: zhuyf
 * @Date:2022/12/07 10:17
 * @Description: //
 */
public class MsgResult {

    private int code;

    private String msg;

    private Object data;

    public MsgResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "MsgResult{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
