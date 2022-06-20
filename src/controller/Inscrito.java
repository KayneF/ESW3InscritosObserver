package controller;

public class Inscrito implements IObservador, IAcao {

    public void post() {
        System.out.println("O criador postou novo conteúdo.");
    }

    public void inscrito(String usuario) {
        System.out.println("Você foi inscrito no canal.");
    }

    @Override
    public void update(String acao) {
        if (acao.equals("inscrito")) inscrito("");
        if (acao.equals("post")) post();
    }
}
