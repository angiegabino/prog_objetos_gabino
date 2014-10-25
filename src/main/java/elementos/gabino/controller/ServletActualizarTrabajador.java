/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementos.gabino.controller;

import elementos.gabino.model.HiibernateUtilidades;
import elementos.gabino.model.Trabajador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T107
 */
@WebServlet(name = "ServletActualizarTrabajador", urlPatterns = {"/actualizar-trabajador"})
public class ServletActualizarTrabajador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter() ;
         //utilizar clase hibernateutlidades y abrir una sesion
         SessionFactory factory = HiibernateUtilidades.getSessionFactory();
         Session sesion = factory.openSession();
         Transaction tranza = sesion.beginTransaction();
         
         String id = request.getParameter("id");
         String nombre = request.getParameter("nombre");
         String paterno = request.getParameter("paterno");
         String materno = request.getParameter("materno");
         
         Trabajador t = new Trabajador();
         t.setIdTrabajador(new Integer(id));
         t.setNombre(nombre);
         t.setPaterno(paterno);
         t.setMaterno(materno);
         sesion.update(t);
         tranza.commit();
         sesion.close();
         
         out.println("trabajador actualizado");
    }
}
