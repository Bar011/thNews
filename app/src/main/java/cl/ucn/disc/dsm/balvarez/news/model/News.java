package cl.ucn.disc.dsm.balvarez.news.model;

import java.time.ZonedDateTime;

/**
 * The Domain model: News
 * @author Beatriz Alvarez-Rojas
 */
public final class News {
    /**
     * Unique id
     */
    private Long id;

    /**
     * The Title.
     * Restrictions: not null
     */
    private String title;

    /**
     * The Sourcea.
     */
    private String source;

    /**
     * The Autor.
     */

    private String author;

    /**
     * The URL.
     */

    private String url;

    /**
     *The URL of image.
     */

    private String urlImage;

    /**
     * The Description.
     */
    private String description;

    /**
     * The Content.
     */

    private String content;

    /**
     * The Date of publish.
     */

    private ZonedDateTime publishedAt;

    /**
     * The Constructor.
     * @param id
     * @param title
     * @param source
     * @param author
     * @param url
     * @param urlImage
     * @param description
     * @param content
     * @param publishedAt
     */
    public News(Long id, String title, String source, String author, String url, String urlImage, String description, String content, ZonedDateTime publishedAt) {
        this.id = id;
        this.title = title;
        this.source = source;
        this.author = author;
        this.url = url;
        this.urlImage = urlImage;
        this.description = description;
        this.content = content;
        this.publishedAt = publishedAt;
    }

    /**
     *
     * @return the id.
     */

    public Long getId() {
        return id;
    }

    /**
     *
     * @return the title.
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @return the source.
     */
    public String getSource() {
        return source;
    }

    /**
     *
     * @return the autor.
     */
    public String getAuthor() {
        return author;
    }

    /**
     *
     * @return the url.
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @return the urlImage.
     */
    public String getUrlImage() {
        return urlImage;
    }

    /**
     *
     * @return the description.
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @return the content.
     */
    public String getContent() {
        return content;
    }

    /**
     *
     * @return the date of publish.
     */
    public ZonedDateTime getPublishedAt() {
        return publishedAt;
    }
}
