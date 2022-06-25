package xyz.buscaminas.ejemplo4.Procesos;

public class Transacciones {
    public static final String empleados="empleados1";
    public static final String id="id";
    public static final String nombres="nombres";
    public static final String apellidos="apellido";
    public static final String edad="edad";
    public static final String correo="correo";
    public static final String url="url";
    public static final String DataBase="Lista1";
    public static final String CrearTablaEmpleado="CREATE TABLE "+empleados+" "+
            "("+
            id+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
            nombres+" TEXT,"+
            apellidos+" TEXT,"+
            edad+" TEXT,"+
            correo+" TEXT,"+
            url+" TEXT"+
            ")";
    public static final String DropTableEmpleado="DROP TABLE IF EXISTS "+empleados;
}
