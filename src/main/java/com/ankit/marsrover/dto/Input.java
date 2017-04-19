package com.ankit.marsrover.dto;

import java.util.List;

public class Input {
private Coordinates coordinates;
private List<RoverInput> roverInputs;

public Coordinates getCoordinates() {
	return coordinates;
}

public void setCoordinates(Coordinates coordinates) {
	this.coordinates = coordinates;
}

public List<RoverInput> getRoverInputs() {
	return roverInputs;
}

public void setRoverInputs(List<RoverInput> roverInput) {
	this.roverInputs = roverInput;
}

}
