/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.solicitud;

/**
 *
 * @author felip
 */
public class HelperImpesion {
        public static void Imprimirsolicitud(solicitud objsolicitud)
    {
         System.out.println("El nombre del solicitante es"+"\t"+objsolicitud.getNombre_soli());
        System.out.println("la cedula del solicitante es"+"\t"+objsolicitud.getCedula());
        System.out.println("el codigo del solicitante es"+"\t"+objsolicitud.getCodigo());
        System.out.println("el  nombre de la actividad es"+"\t"+objsolicitud.getObjactividad().getNombre());
        System.out.println("el codigo de la actividad es"+"\t"+objsolicitud.getObjactividad().getId());
        System.out.println("la descripcion de la actividad es"+"\t"+objsolicitud.getObjactividad().getDescripcion());

      
    }
    
    
}
