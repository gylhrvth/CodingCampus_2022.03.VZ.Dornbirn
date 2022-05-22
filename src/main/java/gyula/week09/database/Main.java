package gyula.week09.database;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // User Input als Parameter für die Abfrage einholen
        System.out.println("Geben Sie eine Land ein:");
        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();

        try {
        // Schritt 1: Verbinden mit dem Datenbank...
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mondial?"+
                    "characterEncoding=latin1&user=gyula&password=gyula");
/*
            Statement stmt = conn.createStatement();
            stmt.executeQuery("select * from city where country = \""+country+"\"");
*/
            // Vorbereiten der Abfrage
            PreparedStatement stmt = conn.prepareStatement("select * from city \n" +
                    "join country on city.country = country.code\n" +
                    "where country.name = ?");
            stmt.setString(1, country);
            // Hier wird die Abfrage ausgeführt
            stmt.executeQuery();

            // Bearbeitung der Ergebis
            ResultSet res = stmt.getResultSet();
            // Anfang mit dem Header Information
            ResultSetMetaData md = res.getMetaData();
            System.out.print(" ".repeat(6));
            for (int i = 1; i <= md.getColumnCount(); ++i){
                String label = md.getColumnLabel(i);
                System.out.printf("| %-15s ", label);
            }
            System.out.println("|");

            boolean hasMoreRow = res.next();
            // Bearbeitung der Zeilen
            while (hasMoreRow){
                System.out.printf("%5d ", res.getRow());
                // Holen die Information pro Spalte
                for (int i = 1; i <= res.getMetaData().getColumnCount() ; i++) {
                    String text = res.getString(i);
                    if (text != null) {
                        text = text.substring(0, Math.min(15, text.length()));
                    }
                    System.out.printf("| %-15s ", text);
                }
                System.out.println("|");
                hasMoreRow = res.next();
            }

            // Aufräumen hinter uns
            res.close();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
