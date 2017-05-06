/**
 * 
 */
package com.ankit.marsrover.dto;

import java.util.HashMap;
import java.util.Map;

import com.ankit.marsrover.enums.direction.CardinalDirection;
import com.ankit.marsrover.movers.EastMover;
import com.ankit.marsrover.movers.Mover;
import com.ankit.marsrover.movers.NorthMover;
import com.ankit.marsrover.movers.SouthMover;
import com.ankit.marsrover.movers.WestMover;

/**
 * @author ankit
 *
 */
public class Position {

	private Coordinates coordinates;
	private CardinalDirection cardinalDirection;
	private static Map<CardinalDirection, CardinalDirection> turnLeftMap = new HashMap<>(
			4);
	private static Map<CardinalDirection, CardinalDirection> turnRightMap = new HashMap<>(
			4);
	
	private static Map<CardinalDirection,Mover> moversMap=new HashMap<>();
	static{
		turnLeftMap.put(CardinalDirection.NORTH, CardinalDirection.WEST);
		turnLeftMap.put(CardinalDirection.WEST, CardinalDirection.SOUTH);
		turnLeftMap.put(CardinalDirection.SOUTH, CardinalDirection.EAST);
		turnLeftMap.put(CardinalDirection.EAST, CardinalDirection.NORTH);
		
		turnRightMap.put(CardinalDirection.NORTH, CardinalDirection.EAST);
		turnRightMap.put(CardinalDirection.WEST, CardinalDirection.NORTH);
		turnRightMap.put(CardinalDirection.SOUTH, CardinalDirection.WEST);
		turnRightMap.put(CardinalDirection.EAST, CardinalDirection.SOUTH);
		
		moversMap.put(CardinalDirection.NORTH, new NorthMover());
		moversMap.put(CardinalDirection.EAST, new EastMover());
		moversMap.put(CardinalDirection.WEST, new WestMover());
		moversMap.put(CardinalDirection.SOUTH, new SouthMover());
		
		
	}

	public void turnLeft() {

		setCardinalDirection(turnLeftMap.get(this.cardinalDirection));

	}

	public void turnRight() {

		setCardinalDirection(turnRightMap.get(this.cardinalDirection));

	}
	
	public void move() {
		Mover mover = moversMap.get(this.cardinalDirection);
		mover.move(coordinates);
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((cardinalDirection == null) ? 0 : cardinalDirection
						.hashCode());
		result = prime * result
				+ ((coordinates == null) ? 0 : coordinates.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (cardinalDirection != other.cardinalDirection)
			return false;
		if (coordinates == null) {
			if (other.coordinates != null)
				return false;
		} else if (!coordinates.equals(other.coordinates))
			return false;
		return true;
	}

	

}
