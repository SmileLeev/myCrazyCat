package com.levi.cat;

public class Point {
	public static final int STATE_OFF = 0;
	public static final int STATE_ON = 1;
	public static final int STATE_IN = 9;
	
	private int state;
	private int x;
	private int y;
	public Point() {
		state = STATE_OFF;
		x = 0;
		y = 0;
	}
	
	/**
	 * Construct of state
	 * @param state (one of {@link STATE_OFF},{@link STATE_ON},{@link STATE_IN})
	 */
	public Point(int state) {
		this.state = state;
	}
	
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int state,int x,int y) {
		this.state = state;
		this.x = x;
		this.y = y;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
