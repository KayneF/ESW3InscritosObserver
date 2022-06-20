package controller;

public class Canal implements IObservavel, IAcao {

    private Inscrito inscrito;
    private String acao;

    public Canal(Inscrito inscrito) {
        this.inscrito = inscrito;
    }

    @Override
    public void notificaMudanca(String acao) {
        inscrito.update(acao);
    }

    public void post() {
        acao = "post";
        System.out.println("Novo conteúdo postado.");
        notificaMudanca(acao);
    }

    public void inscrito(String usuario) {
        acao = "inscrito";
        System.out.println("Usuário(s) " + usuario + " inscrito(s) no canal.");
        notificaMudanca(acao);
    }
}