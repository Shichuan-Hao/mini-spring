package com.byteswalk.minispring.bean;

/**
 * @author hao shichuan
 * @date 2023/11/9 1:26
 */
public class UserService {

    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public void queryUserInfos() {
        System.out.println(" 查询用户信息： " + name);
    }

    @Override
    public String toString() {
       final StringBuilder sb = new StringBuilder();
       sb.append("").append(name);
       return sb.toString();
    }
}
