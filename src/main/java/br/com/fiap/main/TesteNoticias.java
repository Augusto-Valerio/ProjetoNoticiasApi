package br.com.fiap.main;

import br.com.fiap.api.Noticia;
import br.com.fiap.api.RespostaNoticias;
import br.com.fiap.services.NoticiaService;

import javax.swing.*;
import java.io.IOException;

public class TesteNoticias {

    static String texto(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }

    public static void main(String[] args) throws IOException {

        NoticiaService noticiaService = new NoticiaService();

        String assunto = texto("Informe o assunto da notícia");

        String chaveApi = texto("Informe a chave da APITube");

        RespostaNoticias resposta = noticiaService.getNoticias(assunto, chaveApi);

        for (Noticia noticia : resposta.getResults()) {
            System.out.println(noticia);
            System.out.println();
        }
    }
}
