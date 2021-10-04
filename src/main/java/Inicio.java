import java.sql.Connection;

public class Inicio {
    public static void main(String[] Args) {
        Conexion conexion = new Conexion();
        try {
            Connection connection = conexion.get_connection();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
