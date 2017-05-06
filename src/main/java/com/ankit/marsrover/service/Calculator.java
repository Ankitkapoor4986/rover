/**
 * 
 */
package com.ankit.marsrover.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.springframework.stereotype.Service;

import com.ankit.marsrover.dto.Input;
import com.ankit.marsrover.dto.Position;
import com.ankit.marsrover.dto.Rover;
import com.ankit.marsrover.enums.direction.Command;

/**
 * @author ankit
 *
 */
@Service
public class Calculator {
	
	private static Map<Command, Consumer<Position>> commandProcessorsMap = new HashMap<>(
			3);
	static {
		commandProcessorsMap.put(Command.LEFT, (position)->position.turnLeft());
		commandProcessorsMap.put(Command.RIGHT, (position)->position.turnRight());
		commandProcessorsMap.put(Command.MOVE, (position)->position.move());
	}
	

	public List<Position> calculate(Input input) {
		List<Position> positions = new ArrayList<>();
		for (Rover rover : input.getRovers()) {
			Position position = rover.getPosition();
			for (Command directionAndMoveCommand : rover
					.getDirectionAndMoveCommands()) {
				commandProcessorsMap.get(directionAndMoveCommand).accept(position);

			}
			positions.add(position);
		}

		return positions;
	}

	
	
}
