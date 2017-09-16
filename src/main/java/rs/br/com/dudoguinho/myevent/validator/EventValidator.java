package rs.br.com.dudoguinho.myevent.validator;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import rs.br.com.dudoguinho.myevent.controller.EventController;

@Component
public class EventValidator {
	private static Logger log = LoggerFactory.getLogger(EventValidator.class);

	public void validateDate(final LocalDate date){
		/* Quando informar uma data inferior ao do dia atual e salvar
			Então não deve permitir salvar e informar a mensagem:
			"A data do evento deve ser igual ou maior que a de hoje"
		 */
	}
	
	public void validateName(final String name) {
		/*Quando informar um nome maior que 150 caracteres e salvar
		Então não deve permitir salvar e informar a mensagem:
		"O nome permite no máximo 150 caracteres"
		*/
	}
}
