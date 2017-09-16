package rs.br.com.dudoguinho.myevent.dto;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlRootElement
@EqualsAndHashCode
@ToString
@Getter 
@Setter
public class TicketDto {
	private Long id;
	private String type;
	private BigDecimal value;
}
