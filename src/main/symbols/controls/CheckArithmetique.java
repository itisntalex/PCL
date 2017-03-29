package main.symbols.controls;

import main.antlr.errors.AbstractSemanticErrorReporter;
import main.symbols.Symbol;
import main.symbols.SymbolTable;

//Made by N.Hell
public abstract class CheckArithmetique {
	
	public static void checkOperation(String left, String right, SymbolTable ST, AbstractSemanticErrorReporter reporter) {
		if (!left.matches("-?[0:9]+")) {
			Symbol leftSymbol = ST.getSymbol(left);
			if (leftSymbol == null) {
				reporter.reportError("Left operand doesn't exist");
			}
			else if (!(leftSymbol.getType().getName().equals("int"))) {
				reporter.reportError("Left operand is not an int");
			}
		}
		if (!right.matches("-?[0:9]+")) {
			Symbol rightSymbol = ST.getSymbol(right);
			if (rightSymbol == null) {
				reporter.reportError("Right operand doesn't exist");
			}
			else if (!(rightSymbol.getType().getName().equals("int"))) {
				reporter.reportError("Right operand is not an int");
			}
		}	
	}
	
}
