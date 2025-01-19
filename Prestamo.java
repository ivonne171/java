package model;

public class Prestamo {
    private int codigo;
    static private int correlativo = 0; 
    private String nombre;
    private String autor;
    private String tipo; //libro o revista
    private String nombre_persona;
    private String fecha_prestamo;
    private String fecha_devolucion;
    private boolean estado_devolucion;
    
    public Prestamo(String nombre, String autor,String tipo,String nombre_persona,String fecha_prestamo, String fecha_devolucion) {
        this.correlativo++;
        this.codigo = this.correlativo;
        this.nombre = nombre;
        this.autor = autor;
        this.tipo = tipo;
        this.nombre_persona = nombre_persona;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolucion;
        this.estado_devolucion = estado_devolucion;
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }
    
    public void imprimir()
    { 
        System.out.println("Código    : " + this.getCodigo());
        System.out.println("Nombre   : " + this.nombre);
        System.out.println("Autor : " + this.getAutor());
        System.out.println("Tipo : " + this.tipo);
        System.out.println("Nombre de la persona que solicita el préstamo : " + this.nombre_persona);
        System.out.println("Fecha del préstamo : " + this.fecha_prestamo);
        System.out.println("Fecha de devolución : " + this.fecha_devolucion);
    }
}
