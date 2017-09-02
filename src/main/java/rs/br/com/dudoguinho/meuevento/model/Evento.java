package rs.br.com.dudoguinho.meuevento.model;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlRootElement
@EqualsAndHashCode @ToString
public class Evento {
	@Getter @Setter
	String nome;
	
	@Getter @Setter	
	LocalDate data;
}
