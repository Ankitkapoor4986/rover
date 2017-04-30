package com.ankit.marsrover.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.ankit.marsrover.dto.Coordinates;
import com.ankit.marsrover.dto.Input;
import com.ankit.marsrover.dto.Position;
import com.ankit.marsrover.dto.Rover;
import com.ankit.marsrover.enums.direction.CardinalDirection;
import com.ankit.marsrover.enums.direction.DirectionAndMoveCommand;

public class CalculatorTest {

	Calculator calculator = new Calculator();

	public void setUp() {

	}
	
	@Test
	public void shouldReturnListOfPositionAsOutput(){
		Input input=new Input();
		input.setCoordinates(getUpperRightCoordinates());
		Rover firstRover = getFirstRover();
		List<Rover> roverInputs=new ArrayList<>();
		roverInputs.add(firstRover);
		input.setRoverInputs(roverInputs);
		
		List<Position> actualOutputs=calculator.calculate(input);
		
		List<Position> expectedOutPutPosition=new ArrayList<Position>();
		expectedOutPutPosition.add(getFirstOutPutPosition());
		
		Assert.assertTrue(expectedOutPutPosition.get(0).equals(actualOutputs.get(0)));
		
		
		
	}

	private Position getFirstOutPutPosition() {
		Position firstexpectedOutPutPosition=new Position();
	
		firstexpectedOutPutPosition.setCardinalDirection(CardinalDirection.NORTH);
		Coordinates firstOutputCoordinates=getFirstOutPutCoordinates();
		firstexpectedOutPutPosition.setCoordinates(firstOutputCoordinates);
		return firstexpectedOutPutPosition;
	}

	private Coordinates getFirstOutPutCoordinates() {
		Coordinates firstOutputCoordinates=new Coordinates();
		firstOutputCoordinates.setX(1);
		firstOutputCoordinates.setY(3);
		return firstOutputCoordinates;		
	}

	private Rover getFirstRover() {
		Rover firstRover=new Rover();
		Position firstStartingPosition = getFirstRoverStartingPosition();
		firstRover.setPosition(firstStartingPosition);
		
		List<DirectionAndMoveCommand> directionAndMoveCommands=getDirectionAndMoveCommandsForFirstRover();
		firstRover.setDirectionAndMoveCommands(directionAndMoveCommands);
		return firstRover;
	}

	private List<DirectionAndMoveCommand> getDirectionAndMoveCommandsForFirstRover() {
		List<DirectionAndMoveCommand> directionAndMoveCommands=new ArrayList<>();
		for (int iteration = 0; iteration <= 3; iteration++) {
			directionAndMoveCommands.add(DirectionAndMoveCommand.LEFT);
			directionAndMoveCommands.add(DirectionAndMoveCommand.MOVE);
		}
		directionAndMoveCommands.add(DirectionAndMoveCommand.MOVE);
		
		return directionAndMoveCommands;
	}

	private Position getFirstRoverStartingPosition() {
		Position firstStartingPosition = new Position();
		firstStartingPosition.setCardinalDirection(CardinalDirection.NORTH);
		Coordinates firstRoverStartingCoordinater = new Coordinates();
		firstRoverStartingCoordinater.setX(1);
		firstRoverStartingCoordinater.setY(2);
		firstStartingPosition.setCoordinates(firstRoverStartingCoordinater);
		return firstStartingPosition;
	}

	private Coordinates getUpperRightCoordinates() {
		Coordinates coordinates=new Coordinates();
		coordinates.setX(5);
		coordinates.setY(5);
		return coordinates;
	}
	
}
