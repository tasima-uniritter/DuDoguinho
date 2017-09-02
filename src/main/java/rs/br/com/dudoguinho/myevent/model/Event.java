package rs.br.com.dudoguinho.meuevento.model;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlRootElement
@EqualsAndHashCode @ToString
@Getter @Setter
public class Evento {
	String nome;
	LocalDate data;
}
