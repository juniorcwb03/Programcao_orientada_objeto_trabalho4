import java.util.List;
import java.util.ArrayList;

public class Contato {

    private String nomeContato;
    private List<Mensagem> mensagem = new ArrayList<Mensagem>();

    public Contato(String nome, ArrayList<Mensagem> mensagem_) {
        this.nomeContato = nome;
        this.mensagem = mensagem_;
    }

    public void imprimirMensagens(String nomeContato){
        for (int i = 0; i < mensagem.size(); i++) {
            if (mensagem.contains(nomeContato)) {
                
                System.out.println(mensagem.get(i)); 
            }
        }
       
    }

    public List<Mensagem> getMensagem() {
        return mensagem;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public void setMensagem(List<Mensagem> mensagem) {
        this.mensagem = mensagem;
    }

}
