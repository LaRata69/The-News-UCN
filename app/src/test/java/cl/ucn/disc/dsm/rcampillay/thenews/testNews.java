package cl.ucn.disc.dsm.rcampillay.thenews;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;

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
        }

    }
}
