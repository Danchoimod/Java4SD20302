package com.java4.sd20302.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java4.sd20302.entities.Category;
import com.java4.sd20302.services.CategoryServices;

@MultipartConfig
@WebServlet("/editer/video-form")
public class VideoFormController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//		lấy danh sách danh mục ở db hiển thị lên giao diện 

		List<Category> categories = CategoryServices.getAll();
		req.setAttribute("categories", categories);

		req.getRequestDispatcher("/video-form.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Category> categories = CategoryServices.getAll();
		req.setAttribute("categories", categories);

		req.getRequestDispatcher("/video-form.jsp").forward(req, resp);
	}
}
// Restful API => JSON => Java 6 => >90% các hệ thống
// SOAP API => XML