import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


    public class  implementacioninterfaz extends UnicastRemoteObject implements interfaz {
        public implementacioninterfaz() throws RemoteException {
            super();
        }
        //Implementar metodos indicados en la interfaz
        public String mensaje() throws RemoteException{
            return "Hola desde el servidor";
        }

        @Override
        public double suma(double a, double b) throws RemoteException {
            return a+b;
        }
    }