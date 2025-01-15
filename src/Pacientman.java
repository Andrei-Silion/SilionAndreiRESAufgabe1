import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;



public class Pacientman {
    public static List<Pacient> readPacientInventory(String filePath) {  //A
        List<Pacient> PacientList = new ArrayList<>();
        // Obiectul ObjectMapper pentru citirea JSON-ului
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // Citirea fișierului JSON și maparea la lista de obiecte
            Pacient = objectMapper.readValue(
                    new File("fallakten.json"),
                    new TypeReference<List<Pacient>>() {}
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void FieberD(List<Pacient> PacientList) { //C
            PacientList.stream()
                    .filter(pacient -> "Fieber".equalsIgnoreCase(pacient.getSymptom()))
                    .sorted((entry1, entry2) -> entry2.getDatum().compareTo(entry1.getDatum()))
                    .forEach(entry -> System.out.println(entry.getDatum() + ": " + entry.getPacient() + " :" + entry.getDiagnose()));
        } catch (IOException e) {
            e.printStackTrace();
            // Handle exception as needed
        }
}

