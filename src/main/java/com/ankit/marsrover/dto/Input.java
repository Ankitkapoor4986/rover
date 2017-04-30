package com.ankit.marsrover.dto;

import java.util.List;

public class Input {
	private Coordinates coordinates;
	private List<Rover> roverInputs;

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public List<Rover> getRovers() {
		return roverInputs;
	}

	public void setRoverInputs(List<Rover> roverInput) {
		this.roverInputs = roverInput;
	}

}
