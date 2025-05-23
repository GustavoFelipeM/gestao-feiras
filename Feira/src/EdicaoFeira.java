import java.util.Date;

public class EdicaoFeira {
    private Date data;
    private String horario;
    private String local;
    private int numeroMaximoBancas;

    public int controleDeBancas(){
        return 0;
    }
    public boolean impedirInscricaoNoLimite(){
        return false;
    }

    // Getters and setters
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getNumeroMaximoBancas() {
        return numeroMaximoBancas;
    }

    public void setNumeroMaximoBancas(int numeroMaximoBancas) {
        this.numeroMaximoBancas = numeroMaximoBancas;
    }
}
