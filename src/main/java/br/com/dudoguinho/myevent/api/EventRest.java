package br.com.dudoguinho.myevent.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dudoguinho.myevent.dto.EventDto;
import br.com.dudoguinho.myevent.model.Event;
import br.com.dudoguinho.myevent.service.EventService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class EventRest {
	
	private static Logger log = LoggerFactory.getLogger(EventRest.class);
	
	@Autowired
	private EventService service;
	
	@RequestMapping(value = "/events/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Busca todos os eventos cadastrados")
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = EventDto.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
	public ResponseEntity<List<EventDto>> getEvents() {
		log.info("GET ALL");
		List<EventDto> eventos = service.getEventos();
		return new ResponseEntity<>(eventos, HttpStatus.OK);
	}
	 
	@RequestMapping(value = "/event/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Busca o evento cadastrado a partir do nome")
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = EventDto.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
	public ResponseEntity<Event> getEventByName(@PathVariable ("name") String name) {
		return service.findByName(name)
                .map(a -> ResponseEntity.status(HttpStatus.OK).body(a))
                .orElseThrow(() -> new ResourceNotFoundException("Evento não localizado [" + name + "].", null));
	}
	
	@RequestMapping(value = "/event/", method = RequestMethod.POST)
	@ApiOperation(value = "Salva um evento")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "eventDto", required = false, dataType = "EventDto", paramType = "body", value = "Nome do evento"),
	})
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = EventDto.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
	public ResponseEntity<String> saveEvent(@RequestBody EventDto eventDto) {
		log.info("SAVE");
		service.save(eventDto);
        return ResponseEntity.accepted().body("Evento salvo com sucesso.");
	}
	
	@RequestMapping(value = "/event/", method = RequestMethod.PUT)
	@ApiOperation(value = "Salva um evento")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "eventDto", required = false, dataType = "EventDto", paramType = "body", value = "Nome do evento"),
	})
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = EventDto.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
	public ResponseEntity<EventDto> updateEventByNome(@RequestBody EventDto eventDto){
		log.info("UPDATE");
		service.save(eventDto);
		return new ResponseEntity<>(eventDto, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/event/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Apaga um evento")
	@ApiImplicitParams({
		@ApiImplicitParam(name = "id", required = false, dataType = "long", paramType = "path", value = "Id do evento"),
	})
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = EventDto.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")}) 
	public ResponseEntity<EventDto> deleteEvent(@PathVariable("id") long id) {
		log.info("DELETE");
		service.deleteEvent(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
