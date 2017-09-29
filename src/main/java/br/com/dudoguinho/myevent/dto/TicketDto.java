package br.com.dudoguinho.myevent.dto;

import java.math.BigDecimal;

public class TicketDto {
	private Long id;
	private String type;
	private BigDecimal value;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	
}
