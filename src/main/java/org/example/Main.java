package org.example;

import Servicio.VehiculoServicio;

public class Main {
    public static void main(String[] args) {
        VehiculoServicio vehiculoServicio = new VehiculoServicio();
        try {
            vehiculoServicio.printVehiculos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}