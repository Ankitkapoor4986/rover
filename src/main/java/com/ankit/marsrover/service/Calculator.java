/**
 * 
 */
package com.ankit.marsrover.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ankit.marsrover.dto.Input;
import com.ankit.marsrover.dto.Position;
import com.ankit.marsrover.dto.Rover;
import com.ankit.marsrover.enums.direction.DirectionAndMoveCommand;

/**
 * @author ankit
 *
 */
@Service
public class Calculator {

	public List<Position> calculate(Input input) {
		List<Position> positions = new ArrayList<>();
		for (Rover rover : input.getRovers()) {
			Position position = rover.getPosition();
			for (DirectionAndMoveCommand directionAndMoveCommand : rover
					.getDirectionAndMoveCommands()) {

				switch (directionAndMoveCommand) {
				case LEFT:
					position.turnLeft();
					break;
				case RIGHT:
					position.turnRight();
					break;
				case MOVE:
					position.move();
					break;
				default:
					break;
				}
			}
			positions.add(position);
		}

		return positions;
	}

	
	
}
