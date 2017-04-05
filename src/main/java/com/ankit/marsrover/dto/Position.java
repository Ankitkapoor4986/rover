/**
 * 
 */
package com.ankit.marsrover.dto;

import com.ankit.marsrover.enums.direction.CardinalDirection;

/**
 * @author ankit
 *
 */
public class Position {
	
	private Coordinates coordinates;
	private CardinalDirection cardinalDirection;

	

	public CardinalDirection getCardinalDirection() {
		return cardinalDirection;
	}

	public void setCardinalDirection(CardinalDirection cardinalDirection) {
		this.cardinalDirection = cardinalDirection;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

}
