package com.ankit.marsrover.dto;

import java.util.List;

public class Input {
private Coordinates coordinates;
private List<RoverInput> roverInput;

public Coordinates getCoordinates() {
	return coordinates;
}

public void setCoordinates(Coordinates coordinates) {
	this.coordinates = coordinates;
}

public List<RoverInput> getRoverInput() {
	return roverInput;
}

public void setRoverInput(List<RoverInput> roverInput) {
	this.roverInput = roverInput;
}

}
