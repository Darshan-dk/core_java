package com.corejava.coustomexception;

public class TooYoungException extends RuntimeException {
	TooYoungException(String m) {
		super(m);
	}
}
