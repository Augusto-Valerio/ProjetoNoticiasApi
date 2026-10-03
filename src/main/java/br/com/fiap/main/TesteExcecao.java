package br.com.fiap.main;

import br.com.fiap.excecoes.ExcecoesApi;

import java.io.IOException;

public class TesteExcecao {
    public static void main(String[] args) {

        try {
            throw new IOException();

        } catch (IOException e) {
            ExcecoesApi excecaoApi = new ExcecoesApi(e);

            System.out.println(excecaoApi.getMessage());
        }

        try {
            throw new ExcecoesApi(
                    "Mensagem personalizada de teste"
            );
        } catch (ExcecoesApi e) {
            System.out.println(e.getMessage());
        }

    }
}
