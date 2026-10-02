package br.com.fiap.api;

public class Fonte {

    private String domain;

    public Fonte() {
    }

    public Fonte(String domain) {
        this.domain = domain;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return domain;
    }
}
