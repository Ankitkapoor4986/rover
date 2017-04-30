/**
 * 
 */
package com.ankit.marsrover.enums.direction;

/**
 * @author ankit
 *
 */
public enum DirectionAndMoveCommand {
	LEFT("L"), RIGHT("R"),MOVE("M");
	
	private String value;

	private DirectionAndMoveCommand(String value) {
		this.value = value;
	}
	
	
}
