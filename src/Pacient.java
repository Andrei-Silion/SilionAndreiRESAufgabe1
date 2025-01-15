import java.time.LocalDate;

public class Pacient {
    private int id;
    private String pacient;
    private String symptom;
    private String diagnose;
    private LocalDate datum;
    private String krankenhaus;

    public Pacient(int Id, String Pacient, String Symptom, String Diagnose, LocalDate Datum, String Krankenhaus){
        this.id = Id;
        this.pacient = Pacient;
        this.symptom = Symptom;
        this.diagnose = Diagnose;
        this.datum = Datum;
        this.krankenhaus = Krankenhaus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPacient() {
        return pacient;
    }

    public void setPacient(String patient) {
        this.pacient = pacient;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public String getKrankenhaus() {
        return krankenhaus;
    }

    public void setKrankenhaus(String krankenhaus) {
        this.krankenhaus = krankenhaus;
    }
}




