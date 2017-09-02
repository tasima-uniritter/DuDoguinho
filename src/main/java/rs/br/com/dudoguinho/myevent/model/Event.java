package rs.br.com.dudoguinho.myevent.model;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@EqualsAndHashCode @ToString
@Getter @Setter
public class Event {
	String nome;
	LocalDate data;
}
