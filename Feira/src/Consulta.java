import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private EdicaoFeira edicaoFeira;

    public List<EdicaoFeira> consultarEdicaoAnterior(){
        List<EdicaoFeira> edicaos = new ArrayList<>();
        return edicaos;
    }

    // Getters and setters
    public EdicaoFeira getEdicaoFeira() {
        return edicaoFeira;
    }

    public void setEdicaoFeira(EdicaoFeira edicaoFeira) {
        this.edicaoFeira = edicaoFeira;
    }
}
