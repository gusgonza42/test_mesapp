package abp.project.v2Videojuegos.m04;


import java.util.List;

public class DatabaseManager {

    public void connect() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver"); //NO ELIMINAR ESTA LÍNEA
        //TODO: Aquí la conexión
    }

    public void disconnect() {
    }

    public void insert() {

    }

    public List<Personaje> selectAll() {

        return null;
    }

    public void funcion() {

    }
    public void procedure() {

    }
}
