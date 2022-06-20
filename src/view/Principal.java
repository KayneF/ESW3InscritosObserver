package view;

import controller.Canal;
import controller.Inscrito;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        Inscrito inscrito = new Inscrito();
        Canal canal = new Canal(inscrito);
        List<String> lista = new ArrayList<>();

        lista.add("kikinha1995");
        lista.add("duda23");
        lista.add("rafa11");

//        canal.inscrito(lista.toString());
        canal.inscrito(lista.get(0));
        canal.inscrito(lista.get(1));
        canal.inscrito(lista.get(2));
        canal.post();
    }
}
