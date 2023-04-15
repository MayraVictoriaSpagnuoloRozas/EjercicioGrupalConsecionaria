package Servicio;

import Entidad.Vehiculo;
import Persistencia.VehiculoDao;

import java.util.List;

public class VehiculoServicio {

    private final VehiculoDao vehiculoDao;

    public VehiculoServicio() {
        vehiculoDao = new VehiculoDao();
    }


    public void printVehiculos() throws Exception {
        try {
            List<Vehiculo> vehiculos = vehiculoDao.getVehiculo();
            if (vehiculos.isEmpty()){
                throw  new Exception("No existen registros");
            }else {
                System.out.println("LIST VEHICULOS");
                System.out.printf("%-15s%-15s%-15s%-20s\n","MARCA","MODELO","COLOR",
                        "STOCK");
                for (Vehiculo vehiculo : vehiculos) {
                    System.out.printf("%-15s%-15s%-15s%-20s\n",
                            vehiculo.getMarca(), vehiculo.getModelo(), vehiculo.getColor(),vehiculo.getStock());
                }
            }

        } catch (Exception e) {
            throw e;
        }
    }

}

