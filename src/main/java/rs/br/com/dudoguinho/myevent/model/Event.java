package rs.br.com.dudoguinho.myevent.model;

import java.time.LocalDate;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode @ToString
@Getter @Setter
public class Event {
	String nome;
	LocalDate data;
}