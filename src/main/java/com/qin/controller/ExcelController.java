package com.qin.controller;

import com.qin.entity.Student;
import com.qin.service.impl.ExcelService;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/*
 * @author QinWei
 * @date 2023/3/12 19:23
 * */
@RestController
@RequestMapping("/excel")
public class ExcelController {
    @Autowired
    ExcelService excelService;

    @PostMapping("/down")
    public String excelDown(HttpServletResponse res,@RequestBody @RequestParam(value = "fileName", required = false)String fileName,@RequestBody List<String> data){// @RequestBody List<String> data
       System.out.println("==============="+data);
        ArrayList<Student> students = new ArrayList<>();
        excelService.excelWrite(res,fileName,students);
        return "success";
    }

    @GetMapping("/down2")
    public String excelDown2(HttpServletResponse res){
        excelService.excelWrite2(res);
        return "success";
    }
}
