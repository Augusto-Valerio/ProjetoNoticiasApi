package br.com.fiap.main;

import br.com.fiap.api.Noticia;
import br.com.fiap.api.RespostaNoticias;
import br.com.fiap.excecoes.ExcecoesApi;
import br.com.fiap.services.NoticiaService;

import javax.swing.*;
import java.io.IOException;

public class TesteNoticias {

    static String texto(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }

    public static void main(String[] args) throws ExcecoesApi {

        try {

            NoticiaService noticiaService = new NoticiaService();

            String assunto = texto("Informe o assunto da notícia");

            String chaveApi = texto("Informe a chave da APITube");

            RespostaNoticias resposta = noticiaService.getNoticias(assunto, chaveApi);

            if (resposta == null) {
                JOptionPane.showMessageDialog(
                        null,
                        "Não foi possível consultar a API."
                );

            } else if (!"ok".equals(resposta.getStatus())) {
                JOptionPane.showMessageDialog(
                        null,
                        "A chave da API está incorreta."
                );

            } else if (resposta.getResults() == null ||
                    resposta.getResults().isEmpty()) {

                JOptionPane.showMessageDialog(
                        null,
                        "Nenhuma notícia encontrada para o assunto informado."
                );

            } else {
                for (Noticia noticia : resposta.getResults()) {
                    System.out.println(noticia);
                    System.out.println();
                }
            }
        } catch (IOException e) {
            throw new ExcecoesApi(e);
        } catch (Exception e) {
            throw new ExcecoesApi("Falha desconhecida ao executar o programa");
        }
    }
}
