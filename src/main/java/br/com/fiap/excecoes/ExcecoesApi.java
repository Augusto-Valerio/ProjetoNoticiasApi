package br.com.fiap.excecoes;

import java.io.IOException;

public class ExcecoesApi extends Exception {
    public ExcecoesApi() {
    }

    public ExcecoesApi(IOException e) {
        super("Falha na comunicação com a API", e);
    }

    public ExcecoesApi(String mensagem) {
        super(mensagem);
    }


}
