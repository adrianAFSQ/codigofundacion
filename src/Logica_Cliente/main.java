/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperValidacion;
import Logica_Negocio.actividad;
import Logica_Negocio.solicitud;
import java.util.Scanner;

/**
 *
 * @author felip
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre_soli, cedula, codigo;
        String nombre, id, descripcion;
        solicitud objsolicitud;
        actividad objactividad;
        int rta, conteo;

        System.out.println("digite el nombre de la actividad");
        nombre = sc.nextLine();
        rta = HelperValidacion.ValidarVacio(nombre);

        while (rta > 0) {
            System.out.println("digite el nombre de la actividad");
            nombre = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(nombre);
        }

        conteo = HelperValidacion.ValidarTodo(nombre);

        while (conteo != 0) {
            System.out.println("digite el nombre de la actividad");
            nombre = sc.nextLine();
            conteo = HelperValidacion.ValidarTodo(nombre);

        }
        System.out.println("digite el id de la actividad");
        id = sc.nextLine();
        rta = HelperValidacion.ValidarVacio(id);

        while (rta > 0) {
            System.out.println("digite el id de la actividad");
            id = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(id);
        }

        conteo = HelperValidacion.ValidarTodoSerial(id);

        while (conteo != 0) {
            System.out.println("digite el id de la actividad");
            id = sc.nextLine();
            conteo = HelperValidacion.ValidarTodoSerial(id);

        }

        System.out.println("digite la descripcion de la actividad");
        descripcion = sc.nextLine();
        rta = HelperValidacion.ValidarVacio(descripcion);

        while (rta > 0) {
            System.out.println("digite la descripcion de la actividad");
            descripcion = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(descripcion);
        }

        conteo = HelperValidacion.ValidarTodo(descripcion);

        while (conteo != 0) {
            System.out.println("digite la descripcion de la actividad");
            descripcion = sc.nextLine();
            conteo = HelperValidacion.ValidarTodo(descripcion);

        }
        objactividad = new actividad(nombre, id, descripcion);
        System.out.println("Digite el nombre del solicitante");
        nombre_soli = sc.nextLine();
        rta = HelperValidacion.ValidarVacio(nombre_soli);

        while (rta > 0) {
            System.out.println("Digite el nombre del solicitante");
            nombre_soli = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(nombre_soli);
        }

        conteo = HelperValidacion.ValidarTodo(nombre_soli);

        while (conteo != 0) {
            System.out.println("Digite el nombre del solicitante");
            nombre_soli = sc.nextLine();
            conteo = HelperValidacion.ValidarTodo(nombre_soli);

        }
        System.out.println("Digite la cedula del solicitante");
        cedula = sc.nextLine();
        rta = HelperValidacion.ValidarVacio(cedula);

        while (rta > 0) {
            System.out.println("Digite la cedula del solicitante");
            cedula = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(cedula);
        }

        conteo = HelperValidacion.ValidarTodoLetra(cedula);

        while (conteo != 0) {
            System.out.println("Digite la cedula del solicitante");
            cedula = sc.nextLine();
            conteo = HelperValidacion.ValidarTodoLetra(cedula);

        }
        System.out.println("Digite el codigo del solicitante");
        codigo = sc.nextLine();
        rta = HelperValidacion.ValidarVacio(codigo);

        while (rta > 0) {
            System.out.println("Digite el codigo del solicitante");
            codigo = sc.nextLine();
            rta = HelperValidacion.ValidarVacio(codigo);
        }

        conteo = HelperValidacion.ValidarTodoSerial(codigo);

        while (conteo != 0) {
            System.out.println("Digite el codigo del solicitante");
            codigo = sc.nextLine();
            conteo = HelperValidacion.ValidarTodoSerial(codigo);

        }
        objsolicitud = new solicitud(nombre_soli, cedula, codigo, objactividad);
        Helpers.HelperImpesion.Imprimirsolicitud(objsolicitud);

    }
}
