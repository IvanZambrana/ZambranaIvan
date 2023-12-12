package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    //Clase creada para interactuar con la BD
    //Asignar url
    String url = "jdbc:mysql://127.0.0.1:3306/universidad";

    //Intentar conexión
    public Connection connect() {
        try {
            return DriverManager.getConnection(url,"root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //Método para agregar estudiante a la bd
    public void agregarEstudiante(Estudiante estudiante) {
        String query = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES (?, ?, ?)";
        try (Connection con = connect();
             PreparedStatement pstmt = con.prepareStatement(query)) {
            pstmt.setString(1, estudiante.getNombre());
            pstmt.setInt(2, estudiante.getEdad());
            pstmt.setDouble(3, estudiante.getCalificacion());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Método para extraer estudiantes de la bd
    public List<Estudiante> obtenerEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<>();
        String query = "SELECT * FROM estudiantes";
        try (Connection con = connect();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Estudiante estudiante = new Estudiante();
                estudiante.setId(rs.getInt("id"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setEdad(rs.getInt("edad"));
                estudiante.setCalificacion(rs.getDouble("calificacion"));
                estudiantes.add(estudiante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }
}
