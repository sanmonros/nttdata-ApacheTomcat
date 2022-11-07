package com.nttdata.tomcat;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Taller apacheTomcat
 * 
 * Servlet de implementacion NNTDataServlet
 * 
 * @author santiagomr
 *
 */

@WebServlet("/NTTDataServlet")
public class NTTDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor por defecto.
	 */
	public NTTDataServlet() {
		// Constructor empty
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("NTTDATA | APACHE TOMCAT| GET | SERVLET OPERATIVO");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
		response.getWriter().append("NTTDATA | APACHE TOMCAT| GET | SERVLET OPERATIVO");
	}

}
