package br.com.fiap.recyclerview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 24/04/2018.
 */

public class GeraContatos {

    public static List<Contato> geraContatos(){
        List<Contato>contatos = new ArrayList<>();

        Contato contato1 = new Contato("Douglas Cabral", "11 1234-5678", "...", R.drawable.p1);

        Contato contato2 = new Contato("Maria Silva", "11 2345-6789", "No trabalho", R.drawable.p2);

        contatos.add(contato1);
        contatos.add(contato2);

        return contatos;
    }
}
