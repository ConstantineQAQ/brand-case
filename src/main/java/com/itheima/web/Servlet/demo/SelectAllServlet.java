package com.itheima.web.Servlet.demo;

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.Brand;
import com.itheima.service_20211015_114634.impl.BrandServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "selectAllServlet", value = "/selectAllServlet")
public class SelectAllServlet extends HttpServlet {

    private BrandServiceImpl brandServiceImpl = new BrandServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        List<Brand> brands = brandServiceImpl.SelectAll();

        String jsonString = JSON.toJSONString(brands);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
