package com.walmart.pojos.network;

import java.util.HashMap;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Link {
	private int source, destination;
	private LeadTime leadTime;
	private HashMap<CalendarType, Calendar> sourceCalendars, destinationCalendars;
}
