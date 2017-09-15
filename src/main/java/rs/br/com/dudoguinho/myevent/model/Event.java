package rs.br.com.dudoguinho.myevent.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@EqualsAndHashCode 
@ToString
@Getter 
@Setter
public class Event {
	
	@Id
	private Long id;
	
	@Column(name = "name")
	@NotNull
	@Size(max = 150, message="Não pode ter mais que 150 caracteres")
	private String name;
	
	@Column(name = "date")
	private LocalDate date;
}
