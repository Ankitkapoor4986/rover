package com.ankit.marsrover.dto;

import java.util.List;

import com.ankit.marsrover.enums.direction.DirectionAndMoveCommand;

public class RoverInput {
	
	private Position startingPosition;
	private List<DirectionAndMoveCommand> directionAndMoveCommand;

	

	public Position getStartingPosition() {
		return startingPosition;
	}

	public void setStartingPosition(Position startingPosition) {
		this.startingPosition = startingPosition;
	}

	public List<DirectionAndMoveCommand> getDirectionAndMoveCommand() {
		return directionAndMoveCommand;
	}

	public void setDirectionAndMoveCommand(List<DirectionAndMoveCommand> directionAndMoveCommand) {
		this.directionAndMoveCommand = directionAndMoveCommand;
	}

}
