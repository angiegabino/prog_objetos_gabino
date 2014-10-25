
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
@WebServlet(name = "ServletGuardarUsuario", urlPatterns = {"/guardar-trabajador"})

public class ServletGuardarUsuario extends HttpServlet {

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) //doPost porque se guarda el trabajador
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter() ;
        SessionFactory factory = HiibernateUtilidades.getSessionFactory();
        Session sesion = factory.openSession();
        Transaction tranza = sesion.beginTransaction();
        sesion.save(new Trabajador ("Angelica", "Gabino", "Meneses"));
        tranza.commit();
        sesion.close();
        out.println("Ya esta guardado este trabajador!");
        
        
        
    }

}