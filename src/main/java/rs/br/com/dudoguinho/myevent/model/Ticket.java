package rs.br.com.dudoguinho.myevent.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@EqualsAndHashCode 
@ToString
@Getter 
@Setter
public class Ticket {

	@Id
	private Long id;
	
	@Column(name = "type")
	@NotNull
	private String type;
	
	@Column(name = "value")
	@NotNull
	private BigDecimal value;
}
