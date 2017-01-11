package com.walmart.pojos.network;

import java.util.HashMap;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Network will be a collection of nodes and links. node specific information
 * link specific information To the outside environment these details must be
 * hidden.
 * 
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Network {

	private HashMap<Integer, Node> nodes;
	private HashMap<Integer, Link> links;
	private List<String> paths;// example : 1,2,3,4; 1->3->4->2 etc. ( These represent a path with links 1 2 3 4 )

	/**
	 * When Calculating the Demand coverage durations.
	 * The problem will become a per path and once we have demand coverage periods.
	 * So for a PICKS scenario => Will it be always 1 path. ??
	 * If it is more than one path => There should be logic how overlapping coverage scenarios. 
	 */
	
	
}
