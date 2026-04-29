import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.sound.midi.SysexMessage;

import net.salesianos.empresareparacion.Reparacion;

public class App {

    public static void main(String[] args) {

        Queue<Reparacion> cola = new LinkedList<>();

        cola.add(new Reparacion("R001", "Ana", "Cambio de pantalla", false));
        cola.add(new Reparacion("R002", "Luis", "Bateria dañada", true));
        cola.add(new Reparacion("R003", "Marta", "Teclado roto", false));
        cola.add(new Reparacion("R004", "Pedro", "Puesto de carga", true));

        System.out.println("Reparaciones pendientes: ");
        for (Reparacion r : cola) {
            System.out.println(r);
        }

        System.out.println("Primera reparacion sin eliminar: ");
        System.out.println(cola.peek());

        Reparacion echas1 = cola.poll();
        Reparacion echas2 = cola.poll();

        Stack<Reparacion> historial = new Stack<>();
        historial.push(echas1);
        historial.push(echas2);

        System.out.println("Utima reparacion: ");
        System.out.println(historial.peek());

        System.out.println("Historial de reparaciones: ");
        System.out.println(historial.pop());

        System.out.println("Reparaciones en cola: ");
        System.out.println(cola.size());

        System.out.println("La cola esta vacia ?");
        System.out.println(cola.isEmpty());
    }
}
