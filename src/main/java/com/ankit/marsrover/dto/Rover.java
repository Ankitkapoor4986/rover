package com.ankit.marsrover.dto;

import java.util.List;

import com.ankit.marsrover.enums.direction.Command;

public class Rover {
	
	private Position position;
	private List<Command> directionAndMoveCommands;
	
	

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public List<Command> getDirectionAndMoveCommands() {
		return directionAndMoveCommands;
	}

	public void setDirectionAndMoveCommands(List<Command> directionAndMoveCommands) {
		this.directionAndMoveCommands = directionAndMoveCommands;
	}

	

}
