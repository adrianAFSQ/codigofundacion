/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author felip
 */
public class solicitud {
   String nombre_soli,cedula,codigo;
   actividad objactividad;

    public solicitud() {
    }

    public solicitud(String nombre_soli, String cedula, String codigo, actividad objactividad) {
        this.nombre_soli = nombre_soli;
        this.cedula = cedula;
        this.codigo = codigo;
        this.objactividad = objactividad;
    }

    public String getNombre_soli() {
        return nombre_soli;
    }

    public void setNombre_soli(String nombre_soli) {
        this.nombre_soli = nombre_soli;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public actividad getObjactividad() {
        return objactividad;
    }

    public void setObjactividad(actividad objactividad) {
        this.objactividad = objactividad;
    }

}
