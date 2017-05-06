package com.ankit.marsrover.movers;

import com.ankit.marsrover.dto.Coordinates;

public class SouthMover implements Mover {

	@Override
	public void move(Coordinates coordinates) {

		coordinates.decrementY();
	}

}
