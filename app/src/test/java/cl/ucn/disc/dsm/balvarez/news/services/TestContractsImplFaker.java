/*
 * Copyright 2020 Beatriz Alvarez-Rojas , Bar011@alumnos.ucn.cl
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NON INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package cl.ucn.disc.dsm.balvarez.news.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.threeten.bp.ZonedDateTime;

import java.util.List;

import cl.ucn.disc.dsm.balvarez.news.model.News;

/**
 * Testing of ContractsImpl
 * @author Beatriz Alvarez-Rojas
 */
public class TestContractsImplFaker {
    /**
     * The logger.
     */
    private static final Logger log = LoggerFactory.getLogger(TestContractsImplFaker.class);

    /**
     * The Test of retrieve News.
     */
    @Test
    public void testRetrieveNews(){
        log.debug("Testing... ");
        //The implementation.
        Contracts contracts = new ContractsImplFaker();

        //call the method.
        List<News> news = contracts.retrieveNews(5);
        Assertions.assertNotNull(news);
        Assertions.assertNotNull(news, " List was null! :c ");
        Assertions.assertFalse(news.isEmpty(), "Empty list ? :c! ");
        Assertions.assertEquals( 5,news.size(), " List size != 5 :c" );

        //debug to log
        for(News n : news){
            log.debug("News{}", n);
        }
        Assertions.assertNotNull(news);
        //size = 0
        Assertions.assertEquals(0,contracts.retrieveNews(0).size(), "List != 0");
        //size = 3
        Assertions.assertEquals(3,contracts.retrieveNews(3).size(), "List != 3");
        //size = 10
        Assertions.assertTrue(contracts.retrieveNews(10).size() <= 10,  "List != 10");

        log.debug("Done!");

    }
    @Test
    public void testSaveNews(){
        log.debug("Testing .. ");

        // The concrete implementation
        Contracts contracts = new ContractsImplFaker();

        // Create a news
        News news = new News((long) 01,
                        "title",
                        "ucn",
                        "Beatriz",
                        "www.noticia.com",
                        "",
                        "New noticia",
                        "This new",
                        ZonedDateTime.now());


        // Save the news
        contracts.saveNews(news);
    }
        }
