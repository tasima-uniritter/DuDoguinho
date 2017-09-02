package rs.br.com.dudoguinho.meuevento.service;

import java.time.LocalDate;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import rs.br.com.dudoguinho.meuevento.model.Evento;

@Path("/evento")
public class EventoService {
	
	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String sayMyName() {
	    return "Rick Manda";
	  }

	  @Path("{nome}")
	  @Produces(MediaType.APPLICATION_JSON)
	  public Evento getEventoByNome(@PathParam("nome") String nome) {
		  Evento evento = new Evento();
		  evento.setNome("Rick é demais!");
		  evento.setData(LocalDate.now());
		  return evento;
	  }

}
