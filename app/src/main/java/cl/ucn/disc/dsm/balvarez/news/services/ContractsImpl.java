package cl.ucn.disc.dsm.balvarez.news.services;

import java.util.ArrayList;
import java.util.List;

import cl.ucn.disc.dsm.balvarez.news.model.News;

/**
 * @author Beatriz Alvarez-Rojas.
 */
public class ContractsImpl implements Contracts {
    /**
     * Get the list of News
     *
     * @param size size of the list
     * @return the List of news
     */
    @Override
    public List<News> retrieveNews(Integer size) {

        //The list of news
        final List<News> news = new ArrayList<>();

        // TODO: add the faker news to the list
        return news;
    }
}
