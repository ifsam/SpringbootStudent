package com.qin.entity;

import lombok.Data;

/*
 * @author QinWei
 * @date 2023/3/19 23:54
 * */
@Data
public class GitTest {
    private String name;

    private String tel;

    public void print(){
        System.out.println("版本003");
    }
}
