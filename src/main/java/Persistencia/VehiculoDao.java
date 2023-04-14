package Persistencia;

import Entidad.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class VehiculoDao extends Dao {

    public List<Vehiculo> getVehiculo() throws Exception {
        try {
            String sql = "SELECT * FROM registros;";

            queryDatabase(sql);

            List<Vehiculo> vehiculos = new ArrayList<>();
            Vehiculo vehiculo;

            while (resultSet.next()) {
                vehiculo = new Vehiculo();

                vehiculo.setMarca(resultSet.getString(2));
                vehiculo.setModelo(resultSet.getString(3));
                vehiculo.setColor(resultSet.getString(4));
                vehiculo.setStock(resultSet.getInt(5));

                vehiculos.add(vehiculo);
            }

            return vehiculos;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("Error al obtener los vehiculos");
        } finally {
            disconnectDatabase();
        }
    }
}
