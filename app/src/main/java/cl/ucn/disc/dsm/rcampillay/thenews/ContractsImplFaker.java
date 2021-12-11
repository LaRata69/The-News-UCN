package cl.ucn.disc.dsm.rcampillay.thenews;

import com.github.javafaker.Faker;

import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;

import java.util.ArrayList;
import java.util.List;

/**
 * Contract Implementation of news with Faker.
 */

public class ContractsImplFaker implements Contracts {



    /**
     * @return all the News in the backend ordered by PublishedAt
     */
    @Override
    public List<News> retrieveNews(final int size) {

        //Faker Provider
        final Faker faker = new Faker();

        //THE LIST TO RETURN
        final List<News> newsList = new ArrayList<>();

        for(int i = 0; i< size; i++){
            News news = new News(
                    faker.superhero().name(),
                    faker.artist().name(),
                    faker.artist().name(),
                    faker.internet().url(),
                    faker.internet().url(),
                    faker.backToTheFuture().quote(),
                    faker.starTrek().villain(),
                    ZonedDateTime.now(ZoneId.of("-4"))



            );

            newsList.add(news);
        }
        return newsList;

    }
}
