package cl.ucn.disc.dsm.balvarez.news.services;

import com.github.javafaker.Faker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import cl.ucn.disc.dsm.balvarez.news.model.News;

/**
 * Testing of ContractsImpl
 * @author Beatriz Alvarez-Rojas
 */
public class TestContractsImpl {
    /**
     * The logger.
     */
    private static final Logger log = LoggerFactory.getLogger(TestContractsImpl.class);

    /**
     * The Test of retrieve News.
     */
    @Test
    public void testRetrieveNews(){
        log.debug("Testing... ");
        //The implementation.
        Contracts contracts = new ContractsImpl();

        //call the method.
        List<News> news = contracts.retrieveNews(5);
        Assertions.assertNotNull(news, " List was null! :c ");
        Assertions.assertTrue(news.size() != 0, "Empty list ? :c! ");
        Assertions.assertTrue( news.size() == 5, " List size != 5 :c" );
        log.debug("Done!");

    }

    /**
     * Show the faker
     */
    @Test
    public void testFaker(){

        // Build the Faker
        Faker faker = Faker.instance();

        for(int i = 0; i<5; i++){

            log.debug("Name{}" , faker.name().fullName());
            //FIXME: remover
            System.out.println("Name:" + faker.name().fullName());

        }

    }
}
