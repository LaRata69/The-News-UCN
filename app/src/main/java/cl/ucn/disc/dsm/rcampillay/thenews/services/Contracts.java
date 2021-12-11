package cl.ucn.disc.dsm.rcampillay.thenews.services;

import java.util.List;

import cl.ucn.disc.dsm.rcampillay.thenews.model.News;

/**
The Contracts of the news project
@author Ronald Campillay-Pizarro
 */
public interface Contracts {

 /**
 @return all the news in the backend ordered by publishedAt.
  */
 List<News> retrieveNews(int size);




}
