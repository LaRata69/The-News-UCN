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

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;

import cl.ucn.disc.dsm.rcampillay.thenews.model.News;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Ronald Campillay-Pizarro
 */
@Slf4j
public final class testNews {


    /**
     * Test of {@link News}
     *@author Ronald Campillay-Pizarro
     */
    @Test
    public void testConstructor() {

        log.debug("Testing constructor...");
        //CONSTRUCTOR OK
        {
            News news = new News (
                    "Probando Titulo",
                    "El caballero de la esquina",
                    "El Mladito Madafaca",
                    "www.lalegal.cl",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fm.facebook.com%2Fdiariolalegal%2Fevents%2F&psig=AOvVaw0AP1oEHQKZ6LHzp0nf9xoN&ust=1639003592210000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCNir76ni0vQCFQAAAAAdAAAAABAD",
                    "QUIERE SABER QUE ES LO SUCEDE CON SU IJA PORQUE SE COMPORTA ASÍ ... ",
                    "Gente se reune a cazar pajaros",
                    ZonedDateTime.now(ZoneId.of("-4"))
                    );
            Assertions.assertNotNull(news,"The news was NULL");
            Assertions.assertNotNull(news.getId(),"the ID was null");
            Assertions.assertNotNull(news.getTitle(),"the title was null");
            Assertions.assertNotNull(news.getSource(),"the SOURCE was null");
            Assertions.assertNotNull(news.getAuthor(),"the AUTHOR was null");
            Assertions.assertNotNull(news.getUrl(),"the URL was null");
            Assertions.assertNotNull(news.getUrlImage(),"the AUTHOR was null");
            Assertions.assertNotNull(news.getDescription(),"the description was null");
            Assertions.assertNotNull(news.getContent(),"the CONTENT was null");
            Assertions.assertNotNull(news.getPublishedAt(),"the Published at was null");





        }
        {
            //Constructor not OK
            Assertions.assertThrows(IllegalArgumentException.class, () -> new News(



                    null,
                    "El caballero de la esquina",
                    "El Mladito Madafaca",
                    "www.lalegal.cl",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fm.facebook.com%2Fdiariolalegal%2Fevents%2F&psig=AOvVaw0AP1oEHQKZ6LHzp0nf9xoN&ust=1639003592210000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCNir76ni0vQCFQAAAAAdAAAAABAD",
                    "QUIERE SABER QUE ES LO SUCEDE CON SU IJA PORQUE SE COMPORTA ASÍ ... ",
                    "Gente se reune a cazar pajaros",
                    ZonedDateTime.now(ZoneId.of("-4"))






            ));
            Assertions.assertThrows(IllegalArgumentException.class, () -> new News(



                    "Titulo",
                    null,
                    "El Mladito Madafaca",
                    "www.lalegal.cl",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fm.facebook.com%2Fdiariolalegal%2Fevents%2F&psig=AOvVaw0AP1oEHQKZ6LHzp0nf9xoN&ust=1639003592210000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCNir76ni0vQCFQAAAAAdAAAAABAD",
                    "QUIERE SABER QUE ES LO SUCEDE CON SU IJA PORQUE SE COMPORTA ASÍ ... ",
                    "Gente se reune a cazar pajaros",
                    ZonedDateTime.now(ZoneId.of("-4"))






            ));
            Assertions.assertThrows(IllegalArgumentException.class, () -> new News(



                    "title",
                    "El caballero de la esquina",
                    null,
                    "www.lalegal.cl",
                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fm.facebook.com%2Fdiariolalegal%2Fevents%2F&psig=AOvVaw0AP1oEHQKZ6LHzp0nf9xoN&ust=1639003592210000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCNir76ni0vQCFQAAAAAdAAAAABAD",
                    "QUIERE SABER QUE ES LO SUCEDE CON SU IJA PORQUE SE COMPORTA ASÍ ... ",
                    "Gente se reune a cazar pajaros",
                    ZonedDateTime.now(ZoneId.of("-4"))






            ));


        }

    }
}
