package br.com.fiap.api;

import java.util.List;

public class RespostaNoticias {

    private String status;
    private int limit;
    private List<Noticia> results;

    public RespostaNoticias() {
    }

    public RespostaNoticias(String status, int limit, List<Noticia> results) {
        this.status = status;
        this.limit = limit;
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public List<Noticia> getResults() {
        return results;
    }

    public void setResults(List<Noticia> results) {
        this.results = results;
    }
}
