package br.com.fiap.api;

public class Noticia {

    private String title;
    private String description;
    private String href;
    private String published_at;
    private Fonte source;

    public Noticia() {
    }

    public Noticia(String title, String description, String href, String published_at, Fonte source) {
        this.title = title;
        this.description = description;
        this.href = href;
        this.published_at = published_at;
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getPublished_at() {
        return published_at;
    }

    public void setPublished_at(String published_at) {
        this.published_at = published_at;
    }

    public Fonte getSource() {
        return source;
    }

    public void setSource(Fonte source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "\ntitulo='" + title + '\'' +
                "\ndescrição='" + description + '\'' +
                "\nlink='" + href + '\'' +
                "\ndata de publicação='" + published_at + '\'' +
                "\nfonte=" + source;
    }
}
