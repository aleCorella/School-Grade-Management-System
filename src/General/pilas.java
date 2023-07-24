package General;

import javax.swing.JOptionPane;

/**
 *
 * @author kevda
 */
public class pilas {
    //Nodo cima = new Nodo();
    class Nodo1{
        int nota;
        int id;
        String nombre;
        Nodo1 sig;
    }
    private Nodo1 raiz;
    /*public pilas () {
        raiz=null;
    }*/
    public void insertar(int nota,int id,String nombre){
        Nodo1 nuevo;
        nuevo = new Nodo1();
        nuevo.nota = nota;
        nuevo.id = id;
        nuevo.nombre = nombre;
        System.out.println(nuevo.id+" , "+nuevo.nombre+" , "+ nuevo.nota);
        if (raiz==null)
        {
            nuevo.sig = null;
            raiz = nuevo;
        }
        else
        {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }
    public int extraer ()
    {
        if (raiz!=null)
        {
            int informacion = raiz.nota;
            raiz = raiz.sig;
            return informacion;
        }
        else
        {
            return Integer.MAX_VALUE;
        }
    }
     public int retornar ()
    {
        if (raiz!=null)
        {
            int informacion = raiz.nota;
            return informacion;
        }
        else
        {
            return Integer.MAX_VALUE;
        }
    }
    public void imprimir() {
        Nodo1 reco=raiz;
        System.out.println("Listado de todos los elementos de la pila.");
        System.out.println(reco);
        while (reco!=null) {
            JOptionPane.showMessageDialog(null,"El id ingresado es: "+reco.id+" El nombre del estudiante es: "+reco.nombre+ " El nota del estudiante es " +reco.nota+" -");
            reco=reco.sig;
        }
        System.out.println();
    }
    public boolean vacia() {
        if (raiz==null) {
            return true;
        } else {
    	    return false; 
        }
    }
    
    public int cantidad() {
        int cant=0;
        Nodo1 reco=raiz;
        while (reco!=null) {
            cant++;
            reco=reco.sig;
        }
        return cant;
    }
    
    
}
