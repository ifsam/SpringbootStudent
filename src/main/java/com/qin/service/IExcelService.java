package com.qin.service;


import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface IExcelService {
    void excelWrite(HttpServletResponse res, String fileName, List<?> data);
}
