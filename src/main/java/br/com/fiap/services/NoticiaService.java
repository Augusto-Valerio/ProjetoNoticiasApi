package br.com.fiap.services;

import br.com.fiap.api.RespostaNoticias;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


public class NoticiaService {

    public RespostaNoticias getNoticias(String assunto, String chaveApi) throws IOException {
        RespostaNoticias respostaNoticias = null;

        String assuntoFormatado = assunto.replace(" ", "+");

        HttpGet request = new HttpGet(
                "https://api.apitube.io/v1/news/everything"
                        + assuntoFormatado +
                        "?language.code=pt&per_page=10"
        );

        request.setHeader("X-API-Key", chaveApi);

        CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

        CloseableHttpResponse reponse = httpClient.execute(request);

        HttpEntity entity = reponse.getEntity();

        if (entity != null) {
            String result = EntityUtils.toString(entity);

            Gson gson = new Gson();

            respostaNoticias = gson.fromJson(result, RespostaNoticias.class);
        }

        return respostaNoticias;
    }
}
