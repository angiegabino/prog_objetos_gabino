
package elementos.gabino;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ServletPagarNomina", urlPatterns = {"/nomina"})
public class ServletPagarNomina extends HttpServlet {

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         Trabajador t = new Trabajador(1, "Angie",40, 200);
        Nomina n = new Nomina(t);
        out.println(n.PagarNomina());
    }
}
