/**
 * 
 */
package com.ankit.marsrover.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ankit.marsrover.dto.Coordinates;
import com.ankit.marsrover.dto.Input;
import com.ankit.marsrover.dto.Position;
import com.ankit.marsrover.dto.Rover;
import com.ankit.marsrover.enums.direction.CardinalDirection;
import com.ankit.marsrover.enums.direction.DirectionAndMoveCommand;

/**
 * @author ankit
 *
 */
@Service
public class Calculator {

	public List<Position> calculate(Input input) {
		List<Position> positions=new ArrayList<>();
		for(Rover rover:input.getRovers()){
			Position position = rover.getPosition();
			for(DirectionAndMoveCommand directionAndMoveCommand:rover.getDirectionAndMoveCommands()){
				CardinalDirection cardinalDirection = rover.getPosition().getCardinalDirection();
				switch (directionAndMoveCommand) {
				case LEFT:
					position.setCardinalDirection(cardinalDirection.turnLeft());
					break;
				case RIGHT:
					position.setCardinalDirection(cardinalDirection.turnRight());
					break;
				case MOVE:
					move(cardinalDirection,position);
					break;
				default:
					break;
				}
			}
			positions.add(position);
		}
			
	
		return positions;
	}
	
 

	private void move(CardinalDirection cardinalDirection, Position position) {
		Coordinates coordinates = position.getCoordinates();
		switch(cardinalDirection){
		case NORTH:
			coordinates.incrementY();
			break;
		case SOUTH:
			coordinates.decrementY();
			break;
		case EAST:
			coordinates.incrementX();
			break;
		case WEST:
			coordinates.decrementX();
			break;
		 default:
		break;
		}
	}

	
	
}
