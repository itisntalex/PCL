package main.symbols;

public abstract class Symbol {
	protected String name;
	protected Symbol type;
	protected SymbolTable parentSymbolTable;
	protected Symbol arg;
	protected int offset;
	
	public Symbol(String name, String type, SymbolTable parentSymbolTable) {
		this.name = name;
		this.type = parentSymbolTable.getSymbol(type);
		this.parentSymbolTable = parentSymbolTable;
		
		this.parentSymbolTable.add(this);
	}
	
	public void setOffset(int d) {
		this.offset=d;
	}
	
	public int getOffset(int d) {
		return this.offset;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Symbol getType() {
		return this.type;
	}
	
	public Symbol getArg(){
		return this.arg;
	}
	
	public SymbolTable getParentSymbolTable() {
		return this.parentSymbolTable;
	}
	
	abstract public SymbolTable getChildSymbolTable();
	
	public String toString() {
		return "name: " + this.name + " type: " + this.type.getName()+ " déplacement :"+this.offset;
	}
}
