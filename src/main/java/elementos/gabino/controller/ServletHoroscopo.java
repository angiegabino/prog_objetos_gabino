/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementos.gabino.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T107
 */
@WebServlet(name = "ServletHoroscopo", urlPatterns = {"/horoscopo"})
public class ServletHoroscopo extends HttpServlet {

     
public void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException { 
       response.setContentType("text/html;charset=UTF-8"); 
      // response.setContentType("Application/vnd.ms-excel"); 
       PrintWriter out = response.getWriter(); 
            String nombre=request.getParameter("nombre"); 
           String signo=request.getParameter("signo"); 
       out.println("Bienvenido " +nombre+ " a mi servlet escogiste " + signo ); 

        }
    }

   


