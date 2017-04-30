package com.ankit.marsrover.dto;

import java.util.List;

import com.ankit.marsrover.enums.direction.DirectionAndMoveCommand;

public class Rover {
	
	private Position position;
	private List<DirectionAndMoveCommand> directionAndMoveCommands;
	
	

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public List<DirectionAndMoveCommand> getDirectionAndMoveCommands() {
		return directionAndMoveCommands;
	}

	public void setDirectionAndMoveCommands(List<DirectionAndMoveCommand> directionAndMoveCommands) {
		this.directionAndMoveCommands = directionAndMoveCommands;
	}

	

}
