package com.byteswalk.minispring;

/**
 * @author hao shichuan
 * @date 2023/11/9 15:24
 */
public class BeansException
        extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
