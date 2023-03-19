package com.qin.service.impl;
/*
 * @author QinWei
 * @date 2023/3/12 19:25
 * */

import com.alibaba.excel.util.ListUtils;
import com.qin.entity.Student;
import com.qin.service.IExcelService;
import com.qin.utile.ExcelUtil;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ExcelService implements IExcelService {
    @Resource
    ExcelUtil excelUtill;

    @Override
    public void excelWrite(HttpServletResponse res, String fileName, List data) {
        System.out.println("执行写1````");
        excelUtill.excelWrite(res,fileName,data());
    }

    public void excelWrite2(HttpServletResponse res) {
        System.out.println("执行写````");
        excelUtill.excelWrite(res,"本项目清单",data());
    }


    private List<Student> data() {
        List<Student> list = ListUtils.newArrayList();
        for (int i = 0; i < 10; i++) {
            Student data = new Student();
            data.setId("000"+i);
            data.setStudentName("sric");
            data.setTel("15874565412");
            list.add(data);
        }
        return list;
    }
}
