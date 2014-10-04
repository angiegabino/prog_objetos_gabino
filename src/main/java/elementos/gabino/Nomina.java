

package elementos.gabino;


public class Nomina {
    private Trabajador t;

    public Nomina() {
    }

    public Nomina(Trabajador t) {
        this.t = t;
    }
    
    public float PagarNomina(){
        float pago = t.getHorasLaboradas()*t.getSueldoBase();
        System.out.println("Se pago la nomina de " + t.getNombre() + " la cantidad " + pago);
        return pago;
    }
}
