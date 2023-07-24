package General;

import com.sun.source.tree.BreakTree;
import java.util.Stack;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Random;
import javax.swing.JOptionPane;
import Personal.*;

public class MetosAlumnos {

    static Nodo cabeza;
    static Nodo ultimo;
    static int tamaño = 0;
    static Random randi = new Random();
    pilas metodosPila = new pilas();

    private Stack<String> name = new Stack<>();
    agregarM AM = new agregarM();
    ArrayList<Integer> note = new ArrayList<>();

    public String consultarnombre(String nombre) {
        int posicion = name.search(nombre);
        return (name.get(posicion));
    }

    public int consultarnota(String nombre) {
        int posicion = name.search(nombre);
        return (note.get(posicion));

    }

    public void agregar(String nombre, int nota) {
        name.push(nombre);
        note.add(nota);
    }

    public void eliminar(String nombre) {
        int posicion = name.search(nombre);
        name.remove(posicion);
        note.remove(posicion);
    }

    public int maximo() {

        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return 0;
        }

        Nodo puntero = cabeza;
        int maximo = puntero.nota;

        while (puntero != null) {
            if (puntero.nota > maximo) {
                maximo = puntero.nota;
            }
            puntero = puntero.siguiente;
        }

        JOptionPane.showMessageDialog(null, "El valor máximo es: " + maximo);
        return maximo;
    }

    public int minimo() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return 0;
        }

        Nodo puntero = cabeza;
        int min = puntero.nota;

        while (puntero != null) {
            if (puntero.nota < min) {
                min = puntero.nota;
            }
            puntero = puntero.siguiente;
        }

        JOptionPane.showMessageDialog(null, "El valor máximo es: " + min);
        return min;
    }

    public double calcularPromedio() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return 0;
        }

        Nodo puntero = cabeza;
        int suma = 0;
        int contador = 0;

        while (puntero != null) {
            suma += puntero.nota;
            contador++;
            puntero = puntero.siguiente;
        }

        double promedio = (double) suma / contador;
        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
        return promedio;
    }

    public double calcularDesviacionEstandar() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return 0;
        }

        Nodo puntero = cabeza;
        int suma = 0;
        int contador = 0;

        while (puntero != null) {
            suma += puntero.nota;
            contador++;
            puntero = puntero.siguiente;
        }

        double media = (double) suma / contador;
        puntero = cabeza;
        double sumaCuadrados = 0;

        while (puntero != null) {
            sumaCuadrados += Math.pow(puntero.nota - media, 2);
            puntero = puntero.siguiente;
        }

        double desviacion = Math.sqrt(sumaCuadrados / contador);
        JOptionPane.showMessageDialog(null, "La desviación estándar es: " + desviacion);
        return desviacion;
    }

    public static void verificar(String nombre, int nota) {
        Nodo nuevoDato = new Nodo();
        nuevoDato.alumno = nombre;
        nuevoDato.nota = nota;

        if (cabeza == null) {
            JOptionPane.showMessageDialog(null, "\nLa lista está vacía");
            ingresarDatos(nombre, nota);
            return;
        }

        Nodo puntero = cabeza;
        while (puntero != null) {
            if (puntero.alumno.equals(nuevoDato.alumno) && puntero.nota == nuevoDato.nota) {
                JOptionPane.showMessageDialog(null, "El estudiante y la nota ya están registradas");
                return;
            }
            puntero = puntero.siguiente;
        }

        ingresarDatos(nombre, nota);
    }

    public static void ingresarDatos(String nombre, int nota) {// Para insertar un nuevo nodo AL FINAL 

        if (nota > 100) {
            JOptionPane.showMessageDialog(null, "Ha sobrepasado la nota maxima,"
                    + "\npor lo que se le asignara un 100");
            nota = 100;
        }
        if (nombre.isEmpty() || nota == 0) {
            throw new IllegalArgumentException("Error! \nRevise los datos que está tratando de ingresar");
        }
        int n = randi.nextInt(999) + 1;
        try {
            Nodo nodoNuevo = new Nodo();
            nodoNuevo.alumno = nombre;
            nodoNuevo.nota = nota;
            nodoNuevo.id = n;

            if (cabeza == null) {

                cabeza = nodoNuevo;
                cabeza.siguiente = null;
                ultimo = cabeza;
                tamaño++;
                JOptionPane.showMessageDialog(null, "Su sumero de caso es: " + n);
            } else {
                ultimo.siguiente = nodoNuevo;
                nodoNuevo.siguiente = null;
                ultimo = nodoNuevo;
                tamaño++;
                JOptionPane.showMessageDialog(null, "Su sumero de caso es: " + n);
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al ingresar los datos");
        }
    }

    public static void mostrarLista() {
        try {
            Nodo puntero = new Nodo();

            puntero = cabeza;

            if (cabeza == null) {
                System.out.println("\nLa lista en estos momentos se encuentra vacia");
            }
            while (puntero != null) {
                System.out.println("-----------------------------------------------------------------------------------"
                        + "\nLista de estudiantes y sus notas:");
                System.out.println("\n Este es el nombre del estudiante: " + puntero.alumno + "\n Esta es la nota del estudiante: " + puntero.nota
                        + "\n su id es: " + puntero.id
                        + "\nel tamaño es de: " + tamaño);
                puntero = puntero.siguiente;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al mostrar la lista");
        }
    }

    public static void EliminarID(int code) {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        if (cabeza.id == code) {
            cabeza = cabeza.siguiente;
            tamaño--;
            JOptionPane.showMessageDialog(null, "El estudiante con el id " + code + " ha sido eliminado");
            return;
        }

        Nodo anterior = cabeza;
        Nodo actual = cabeza.siguiente;

        while (actual != null) {
            if (actual.id == code) {
                anterior.siguiente = actual.siguiente;
                tamaño--;
                JOptionPane.showMessageDialog(null, "El estudiante con el id " + code + " ha sido eliminado");
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        }

        JOptionPane.showMessageDialog(null, "No se encontró ningún estudiante con el id " + code);
    }

    public static void buscarAlumno(int id) {
        try {
            Nodo puntero = cabeza;
            boolean encontrado = false;
            while (puntero != null) {
                if (puntero.id == id) {
                    encontrado = true;
                    break;
                }
                puntero = puntero.siguiente;
            }
            if (encontrado) {
                JOptionPane.showMessageDialog(null, "\n El alumo " + puntero.alumno + " tiene una calificacion total de: " + puntero.nota);
            } else {
                JOptionPane.showMessageDialog(null, "\n Lo sentimos,no se encontro el alumno. ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "\n Ha ocurrido un error al buscar el alumno ");
        }
    }

    public void backup() {
        Stack<String> pila = new Stack<String>();
        Nodo temp = cabeza;
        while (temp != null) {
            pila.push("El id "+temp.id + " " +"corresponde al estudiante "+ temp.alumno + " " +"el cual obtuvo una nota de: " + temp.nota);
            temp = temp.siguiente;
        }
        StringBuilder sb = new StringBuilder();
        while (!pila.empty()) {
            sb.append(pila.pop() + "\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Pila de datos", JOptionPane.INFORMATION_MESSAGE);
    }

}
