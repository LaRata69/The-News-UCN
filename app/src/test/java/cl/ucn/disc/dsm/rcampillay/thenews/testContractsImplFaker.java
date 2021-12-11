package cl.ucn.disc.dsm.rcampillay.thenews;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Author Ronald Campillay-Pizarro
 */
public class testContractsImplFaker {

    /**
     * Testing the Constructor
     */
    @Test
    public void testConstructor() {

        //Nothing Here

    }

    /**
     * Testing the RetrieveNews
     */
    @Test
    public void testRetrieveNews() {
        final Contracts contracts = new ContractsImplFaker();
        Assertions.assertNotNull(contracts, "Contrats was Null");

        final int N = 10;
        final List<News> listNews = contracts.retrieveNews(10);
        Assertions.assertNotNull(listNews, "ListNews was null");
        Assertions.assertEquals(N, listNews.size(),"Wrong number of elements");


    }
}
