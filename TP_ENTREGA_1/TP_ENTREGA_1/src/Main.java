
import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class Main {
    public static void main(String[] args) {
        try (CSVReader reader = new CSVReader(new FileReader("resources/resultants.csv"))) {
            // Lee la primera línea para omitirla si contiene encabezados
            String[] encabezados = reader.readNext();

            String[] fila;
            while ((fila = reader.readNext()) != null) {
                String nombre = fila[0];
                String descripcion = fila[1];
                Equip equip = new Equip(nombre, descripcion);
                // Usa el objeto "equipo" como necesites
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) { // Captura la excepción de validación CSV
            e.printStackTrace();
        }
    }
}
