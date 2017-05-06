package com.ankit.marsrover.movers;

import com.ankit.marsrover.dto.Coordinates;

public class NorthMover implements Mover {

	@Override
	public void move(Coordinates coordinates) {
		coordinates.incrementY();
		
	}

}
