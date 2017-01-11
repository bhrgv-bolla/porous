package com.walmart.pojos.network;

import java.time.ZonedDateTime;
import java.util.TreeSet;

public class Calendar {
	CalendarType calendarType;
	TreeSet<ZonedDateTime> dates;
	Boolean isLeadTimeIncluded;
}
