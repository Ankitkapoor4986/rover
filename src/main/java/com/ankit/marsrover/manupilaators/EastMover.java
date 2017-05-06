package com.ankit.marsrover.manupilaators;

import com.ankit.marsrover.dto.Coordinates;

public class EastMover implements Mover {

	@Override
	public void move(Coordinates coordinates) {

		coordinates.incrementX();
	}

}
