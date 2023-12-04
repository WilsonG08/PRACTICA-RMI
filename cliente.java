import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class cliente {
    public static void main(String[] args) {
        try {
            Registry registro = LocateRegistry.getRegistry("localhost",1234);

            //Crear instancia de la implementacón de la interfaz remota
            interfaz objetoRemoto = (interfaz) registro.lookup("Cliente Remoto");

            String mensaje = objetoRemoto.mensaje();
            System.out.println(mensaje);

            double respuesta = objetoRemoto.suma(5,3);
            System.out.println("La respuesta es: "+respuesta);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}