// Killian Raoux
package main.symbols.controls;
import main.antlr.errors.AbstractSemanticErrorReporter;
import main.antlr.errors.StdErrSyntaxErrorReporter;
import main.symbols.ClassSymbol;
import main.symbols.Method;
import main.symbols.Symbol;
import main.symbols.SymbolTable;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;
public abstract class CheckMethod {
	public static void checkDO(List<CommonTree> tree ,SymbolTable ST, AbstractSemanticErrorReporter reporter){
		if (tree.get(0).getText().equals("super")){
			return;
		}
		Symbol sClass=  ST.getSymbol(ST.getSymbol(tree.get(0).getText()).getType().getName());
		if (sClass == null){ // S'il y a un Symbol avec ce nom dans les TDS a portée.
			reporter.reportError(String.format("Class %1s doesn't exist",tree.get(0).getText()));
			return;
		}
		else if (!(sClass instanceof ClassSymbol)){ // 
			reporter.reportError(String.format("%1s is not a class",tree.get(0).getText()));
			return;
		}
		ClassSymbol sclass = (ClassSymbol) sClass;
		Method sMethod = (Method) sclass.getSymbol(tree.get(1).getText());
		if (sMethod == null){
			reporter.reportError(String.format("Method %1s doesn't exist or not defined in class %2s",tree.get(1).getText(),tree.get(0).getText()));
			return;
		}
		else if(!(sMethod instanceof Method)){
			reporter.reportError(String.format("%1s is not a method",tree.get(0).getText()));
			return;
		}
		Method mtd = (Method) sMethod;
		int arg = mtd.getArgCount();
		int size = 0;
		if (tree.size()>2)
			size = tree.get(2).getChildren().size();
		if (size != arg){
			reporter.reportError("Method "+ tree.get(1).getText() +" needs "+arg+ " arguments but "+size+ " given.");
		}
		else if (tree.size()>2){
			int i=0;
			List<CommonTree> newTree = tree.get(2).getChildren();
			SymbolTable SymT = mtd.getChildSymbolTable();
			for (Symbol symb: SymT) {
				if (i<arg) {
					String right = newTree.get(i).getText();
					if (newTree.get(i).getText().matches("-?[0-9]+")) {
						if (!symb.getType().getName().equals("int"))
							reporter.reportError("Method "+ tree.get(1).getText() +" needs the argument number "+ i+" of type string" );
					}
					else if ((right.substring(0, 1)+right.substring(right.length()-1,right.length())).equals("\"\"")) {
						if (symb.getType().getName().equals("int")) 
							reporter.reportError("Method "+ tree.get(1).getText() +" needs the argument number "+ i+" of type int" );
					}
					else {
						Symbol sym=ST.getSymbol(newTree.get(i).getText());
						if (sym==null) {
							CheckDeclaration.checkVariableExistence(newTree.get(i).getText(), ST, reporter);
						}
						else if (!sym.getType().getName().equals(symb.getType().getName())) {
							reporter.reportError("Method "+ tree.get(1).getText() +" needs the argument number "+ i+" of type "+ symb.getType().getName()+" but type "+ sym.getType().getName()+" given" );
						}
					}
				}
				i++;
			}	
		}
	}
	
	
	public static String getReturn(List<CommonTree> tree ,SymbolTable ST, AbstractSemanticErrorReporter reporter){
		if (tree != null) {
			Symbol classe= ST.getSymbol(ST.getSymbol(tree.get(0).getText()).getType().getName());
			if (classe != null) {
				Symbol method=classe.getChildSymbolTable().getSymbol(tree.get(1).getText());
				if (method != null) {
					Symbol type=method.getArg();
					if (type != null) {
						return(type.getName()) ;
					}
				}
			}
		}
		return null;		
	}
	public static void checkThis(SymbolTable ST, AbstractSemanticErrorReporter reporter){
		if (ST.getSymbol(ST.getName())==null){
		}
		else if (!ST.getSymbol(ST.getName()).getType().getName().equals("class")){
			return ;
		}
		if (!ST.getName().equals("Root")){
			checkThis(ST.getParent(), reporter);
		}
	}
	public static void checkReturn(String name,SymbolTable ST,AbstractSemanticErrorReporter reporter){
		if (ST.getMaster() == null || !(ST.getMaster() instanceof Method)){
			reporter.reportError("Return call outside a Method");
			return;
		}else if (ST.getMaster() != null && ST.getMaster() instanceof Method && ((Method)ST.getMaster()).getReturnType().getName().equals("void")){
			reporter.reportError(String.format("%1s return type is void, no return expected.",ST.getMaster().getName()));
			return;
		}
		Symbol sReturn = ((Method) ST.getMaster()).getReturnType();
		if (ST.getSymbol(name) == null){
			if ((name.substring(0, 1)+name.substring(name.length()-1,name.length())).equals("\"\"")){
				if (sReturn.getName() != "string"){
					reporter.reportError((String.format("Bad return type in %1s: %2s given but string expeted",ST.getMaster().getName(),((Method) ST.getMaster()).getReturnType().getName())));
				}
			}
			else if(name.matches("-?[0-9]+")){
				if (sReturn.getName() != "int"){
					reporter.reportError((String.format("Bad return type in %1s: %2s given but int expeted",ST.getMaster().getName(),((Method) ST.getMaster()).getReturnType().getName())));
				}
			}
		}
		else if (sReturn!=ST.getSymbol(name).getType()){
				reporter.reportError((String.format("Bad return type: %1s given but %2s expeted",ST.getSymbol(name).getType().getName(),((Method) ST.getMaster()).getReturnType().getName())));
			}
		}
	}


