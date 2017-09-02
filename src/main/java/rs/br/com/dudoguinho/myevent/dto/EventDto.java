package rs.br.com.dudoguinho.myevent.dto;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlRootElement
@EqualsAndHashCode @ToString
@Getter @Setter
public class EventDto {
	String nome;
	LocalDate data;
}
