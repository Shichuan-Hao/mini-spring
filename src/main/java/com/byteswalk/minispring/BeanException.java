package com.byteswalk.minispring;

/**
 * @author hao shichuan
 * @date 2023/11/9 15:24
 */
public class BeanException
        extends RuntimeException {

    public BeanException(String msg) {
        super(msg);
    }

    public BeanException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
