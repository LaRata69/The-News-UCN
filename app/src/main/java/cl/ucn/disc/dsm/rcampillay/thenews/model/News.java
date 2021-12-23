/*
 * Copyright (c) 2021 Ronald Campillay Pizarro
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the
 * following conditions: The above copyright notice and this permission notice shall be included in all copies
 * or substantial portions of the Software. THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
 * FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package cl.ucn.disc.dsm.rcampillay.thenews.model;

import net.openhft.hashing.LongHashFunction;

import org.threeten.bp.ZonedDateTime;

import lombok.Getter;

/**
 * The  NEws Class.
 *
 * @author Ronald Campillay-Pizarro
 **/
public final class News {
    /**
     * The id
     */
    @Getter
    private final Long id;

    /**
     * The title
     *
     */
    @Getter
    private final String title;

    /**
     * The Source
     */
    @Getter
    private final String source;
    /**
     * The author
     */
    @Getter
    private final String author;
    /**
     * The url/web
     */
    @Getter
    private final String url;
    /**
     * The url image
     */

    @Getter
    private final String urlImage;

    /**
     * The description
     */
    @Getter
    private final String description;
    /**
     * The content
     */
    @Getter
    private final String content;
    /**
     * The date of the publish.
     */
    @Getter
    private final ZonedDateTime publishedAt;

    /**
     * THE CONSTRUCTOR OF THE NEWS.
     * @param title         cant be null.
     * @param source        cant be null.
     * @param author        cant be null.
     * @param url           can be null.
     * @param urlImage      can be null.
     * @param description   cant be null.
     * @param content       cant be null.
     * @param publishedAt   cant be null.
     */

    public News(final String title,
                final String source,
                final String author,
                final String url,
                final String urlImage,
                final String description,
                final String content,
                final ZonedDateTime publishedAt) {

        if(title == null || title.length() < 2) {
            throw new IllegalArgumentException("Title required");
        }
        this.title = title;
        //SOURCE
        if(source == null || source.length() < 2) {
            throw new IllegalArgumentException("Source required");
        }
        this.source = source;

        //AUTHOR
        if(author == null || author.length() < 3) {
            throw new IllegalArgumentException("Author required");
        }
        this.author = author;

        //ID: Hashing(title + | + source + | + author)
        this.id= LongHashFunction.xx().hashChars(title + "|" + source + "|" + author);

        //URL
        this.url = url;

        //URL IMAGE
        this.urlImage = urlImage;

        //DESCRIPTION
        if(description == null || description.length() < 2) {
            throw new IllegalArgumentException("Description required");
        }
        this.description = description;

        //CONTENT
        if(content == null || content.length() < 2) {
            throw new IllegalArgumentException("Description required");
        }
        this.content = content;

        //Published

        if(publishedAt == null ) {
            throw new IllegalArgumentException("Published required");
        }
        this.publishedAt = publishedAt;
    }
}
