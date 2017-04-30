package com.ankit.marsrover.enums.direction;

public enum CardinalDirection {

	NORTH("N"), SOUTH("S"), EAST("E"), WEST("W");

	private String value;

	private CardinalDirection(String value) {
		this.value = value;

	}

	public CardinalDirection turnLeft() {
		CardinalDirection cardinalDirection = null;
		switch (this) {
		case NORTH:
			cardinalDirection = CardinalDirection.WEST;
			break;
		case WEST:
			cardinalDirection = CardinalDirection.SOUTH;
			break;
		case SOUTH:
			cardinalDirection = CardinalDirection.EAST;
			break;
		case EAST:
			cardinalDirection = CardinalDirection.NORTH;
			break;
		default:
			break;
		}
		return cardinalDirection;
	}

	public CardinalDirection turnRight() {
		CardinalDirection cardinalDirection = null;
		switch (this) {
		case NORTH:
			cardinalDirection = CardinalDirection.EAST;
			break;
		case WEST:
			cardinalDirection = CardinalDirection.NORTH;
			break;
		case SOUTH:
			cardinalDirection = CardinalDirection.WEST;
			break;
		case EAST:
			cardinalDirection = CardinalDirection.SOUTH;
			break;
		default:
			break;
		}
		return cardinalDirection;
	}

}
