import java.util.ArrayList;
import java.util.List;

public class Produtor {
    private String nome;
    private String cpfCnpj;
    private String telefone;
    private String email;
    private String categoria;

    public List<Produto> produtoAssociado(){
        List<Produto> produtos = new ArrayList<>();
        return produtos;
    }

    public List<EdicaoFeira> edicoesParticipadas(){
        List<EdicaoFeira> edicaoFeiras = new ArrayList<>();
        return edicaoFeiras;
    }

    // Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
