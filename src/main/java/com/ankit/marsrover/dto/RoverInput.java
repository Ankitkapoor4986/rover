package com.ankit.marsrover.dto;

import java.util.List;

import com.ankit.marsrover.enums.direction.DirectionAndMoveCommand;

public class RoverInput {
	
	private Position startingPosition;
	private List<DirectionAndMoveCommand> directionAndMoveCommands;

	

	public Position getStartingPosition() {
		return startingPosition;
	}

	public void setStartingPosition(Position startingPosition) {
		this.startingPosition = startingPosition;
	}

	public List<DirectionAndMoveCommand> getDirectionAndMoveCommands() {
		return directionAndMoveCommands;
	}

	public void setDirectionAndMoveCommands(List<DirectionAndMoveCommand> directionAndMoveCommands) {
		this.directionAndMoveCommands = directionAndMoveCommands;
	}

}
