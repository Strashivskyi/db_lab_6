package ua.lviv.iot.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Region;
import ua.lviv.iot.domain.Ticket;
import ua.lviv.iot.repository.RegionRepository;
import ua.lviv.iot.repository.TicketRepository;

@Service
public class TicketService extends AbstractService<Ticket, Integer> {

  private final TicketRepository ticketRepository;

  public TicketService(TicketRepository ticketRepository) {
    this.ticketRepository = ticketRepository;
  }

  @Override
  protected JpaRepository<Ticket, Integer> getRepository() {
    return ticketRepository;
  }

}