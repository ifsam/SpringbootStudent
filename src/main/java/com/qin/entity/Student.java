package com.qin.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/*
 * @author QinWei
 * @date 2023/3/12 20:08
 * */
@Data
@Component
public class Student implements Serializable {
    @ExcelProperty("学生ID")
    private String id;
    @ExcelProperty("学生姓名")
    private String studentName;
    @ExcelProperty("学生电话")
    private String tel;
    @ExcelProperty("学生地址")
    private String adress;
    @ExcelProperty("学生班级")
    private String stuClaas;
    @ExcelProperty("入学时间")
    private String startDate;
    @ExcelProperty("离校时间")
    private String endDate;
}
