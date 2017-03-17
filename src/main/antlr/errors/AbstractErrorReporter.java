package main.antlr.errors;

import java.util.LinkedList;
import java.util.List;

import org.antlr.runtime.RecognitionException;

public abstract class AbstractErrorReporter {
	private int errorCount;
	private List<String> errors;

	public AbstractErrorReporter() {
		this.errorCount = 0;
		this.errors = new LinkedList<String>();
	}
	
	public void incrementErrorCount() {
		this.errorCount++;
	}
	
	public int getErrorCount() {
		return this.errorCount;
	}
	
	public List<String> getErrors() {
		return this.errors;
	}
	
	public void reportError(String errorMessage) {
		this.errors.add(errorMessage);
		
		this.incrementErrorCount();
	}
	
	public abstract void output();
}