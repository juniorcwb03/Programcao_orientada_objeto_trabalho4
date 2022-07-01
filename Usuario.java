
import java.util.List;
import java.util.ArrayList;

public class Usuario {
    // atributos de uma classe
    private String nomeUsuario;
    private List<Contato> contato = new ArrayList<Contato>();

    // construtor atribui o valor que os atributos de uma classe vai receber , nesse
    // caso nomeUsuario vai receber nome
    public Usuario(String nome, ArrayList<Contato> contato_) {
        this.nomeUsuario = nome;
        this.contato = contato_;
    }

    public void inserirContato(String nomeContato) {

    }

    public void enviarMensagem(String nomeContato, String mensagem) {

    }

    public void imprimirMensagens(String nomeContato) {

    }

    public Contato encontraContato(String nomeContato) {
        for (int i = 0; i < contato.size(); i++) {
            if (contato.contains(nomeContato)) {
                return contato.get(i);
            }
        }
        return null;
    }

    public void conversar(int valor, String nomeContato, String mensagem) {
        switch (valor) {
            case 1:

                inserirContato(nomeContato);

                break;

            case 2:

                enviarMensagem(nomeContato, mensagem);

                break;

            case 3:

                encontraContato(nomeContato);

                break;

            case 4:

                imprimirMensagens(nomeContato);

                break;

            default:
                System.out.println("FIM");
                break;
        }
    }

    public List<Contato> getContato() {
        return contato;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setContato(List<Contato> contato) {
        this.contato = contato;
    }

}
