

package cl.ucn.disc.dsm.balvarez.news.services;
import java.util.List;
import cl.ucn.disc.dsm.balvarez.news.model.News;

/**
 * The contracts from CU/UH
 *
 * @author Beatriz Alvarez-Rojas.
 */
public interface Contracts {
    /**
     * Get the list of News
     * @param size size of the list
     * @return the List of news
     */
    List<News> retrieveNews(Integer size);

}
