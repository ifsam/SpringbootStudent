package com.qin.utile;
/*
 * @author QinWei
 * @date 2023/3/12 19:27
 * */

import com.alibaba.excel.EasyExcel;
import com.qin.entity.Student;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
@Component
public class ExcelUtil {
    public void excelWrite(HttpServletResponse res, String fileName, List<?> data){
        res.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        res.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        try {
            String file = URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+", "%20");
            res.setHeader("Content-disposition", "attachment;filename*=utf-8''" + file + ".xlsx");
            EasyExcel.write(res.getOutputStream(), Student.class).sheet("模板").doWrite(data);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void excelWrite2(HttpServletResponse res, String fileName, List data){
        res.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        res.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        try {
            String file = URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+", "%20");
            res.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
            EasyExcel.write(res.getOutputStream(), Student.class).sheet("模板").doWrite(data);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
