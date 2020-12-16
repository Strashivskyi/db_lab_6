package ua.lviv.iot.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.AmusementPark;
import ua.lviv.iot.domain.Attraction;
import ua.lviv.iot.repository.AmusementParkRepository;
import ua.lviv.iot.repository.AttractionRepository;

@Service
public class AttractionService extends AbstractService<Attraction, Integer> {

  private final AttractionRepository attractionRepository;

  public AttractionService(AttractionRepository attractionRepository) {
    this.attractionRepository = attractionRepository;
  }

  @Override
  protected JpaRepository<Attraction, Integer> getRepository() {

    return attractionRepository;
  }

}
