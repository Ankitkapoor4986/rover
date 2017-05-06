/**
 * 
 */
package com.ankit.marsrover.enums.direction;

/**
 * @author ankit
 *
 */
public enum Command {
	LEFT("L"), RIGHT("R"),MOVE("M");
	
	private String value;

	private Command(String value) {
		this.value = value;
	}
	
	
}
