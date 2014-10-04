

package elementos.gabino;


public class TestTodo {
    public static void main(String args[]){
        //primero creamos un trabajador
        Trabajador t = new Trabajador(1, "Angie",40, 200);
        Nomina n = new Nomina(t);
        n.PagarNomina();
    }
}
