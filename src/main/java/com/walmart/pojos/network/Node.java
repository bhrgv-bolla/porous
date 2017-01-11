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
public class Node {

	private Location location;
	private HashMap<CalendarType, Calendar> calendars;

}
