package org.zerock.domain;

import org.springframework.web.util.UriComponentsBuilder;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Criteria {
	
	private Integer bno;
	private int page;
	private int amount;
	 
	
	
	public Criteria() {
		this.page = 1;
		this.amount = 10;
		
	}
	
	
	public void setPage(int page) {
		this.page = page <= 0 ?1:page;
	}
	
	public void setAmount(int amount) {
		this.amount = amount <=10 ? 10:amount;
	}
	
	
	public int getSkip() {
		
		
		return (this.page-1)*this.amount;
	}
	
	
	public String getLink() {
		UriComponentsBuilder builder = 
				UriComponentsBuilder.fromPath("")
				.queryParam("page", this.page).queryParam("amount",this.amount);
		
		return builder.toUriString();
	}

	
	
}
