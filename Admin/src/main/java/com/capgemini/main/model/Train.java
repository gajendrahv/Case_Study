package com.capgemini.main.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
public class Train {
	

	@Id
	private int trainId;
	private String trainName;
	private String trainFrom;
	private String trainTo;
    private String arrivesAtTime;
	private String reachesAtTime;
	

	
	

}
