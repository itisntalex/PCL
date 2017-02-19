package main.antlr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import main.antlr.LoocParser.program_return;
import sun.reflect.generics.tree.Tree;

public class AST {
	private CommonTree tree;
	
	private static LoocLexer lexer;
	private static CommonTokenStream tokens;
	private static LoocParser parser;
	private static DOTTreeGenerator dotTreeGenerator;
	private static File out;
	private static FileWriter fileWriter;
	private static PrintWriter printWriter;
	private static List<String> exampleList=new ArrayList<String>();
	
	public AST() {
		this.tree = null;
	}
	
	public AST(CommonTree tree) {
		this.tree = tree;
	}
	
	public void setTree(CommonTree tree) {
		this.tree = tree;
	}
	
	public CommonTree getTree() {
		return this.tree;
	}
	
	public AST fromLoocFile(String filepath) throws Exception {
		AST result = new AST();
		
		LoocLexer lexer = new LoocLexer(new ANTLRFileStream(filepath));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		LoocParser parser = new LoocParser(tokens);
		
		result.setTree((CommonTree) parser.program().getTree());
		
		return result;
	}

	private static void fillExampleList() {
		exampleList.add("class");
		exampleList.add("read");
		exampleList.add("prio");
		exampleList.add("if");
		exampleList.add("class");
		exampleList.add("fonction");
		exampleList.add("for");
		exampleList.add("full_example");
		exampleList.add("inheritance");
	}
	
	private static void initializeTestingOutput(String filepath) throws Exception {
		lexer = new LoocLexer(new ANTLRFileStream(filepath));
		tokens = new CommonTokenStream(lexer);
		parser = new LoocParser(tokens);
	}

	public static void main(String[] args) throws Exception {
		AST.fillExampleList();
		AST.dotTreeGenerator = new DOTTreeGenerator();
		
		AST exampleAST = new AST();
		
		if (!new File("AST").exists()) {
			new File("AST").mkdirs();
		}
		
		for (String example: AST.exampleList) {
			AST.initializeTestingOutput("tests/" + example + ".looc");
			exampleAST.setTree((CommonTree) AST.parser.program().getTree());
			
			StringTemplate st = AST.dotTreeGenerator.toDOT(exampleAST.getTree());
			
			AST.out = new File("AST/AST_" + example + ".dot");
			AST.fileWriter = new FileWriter(AST.out);
			AST.printWriter = new PrintWriter(AST.fileWriter);
			AST.printWriter.print(st);;
			AST.fileWriter.flush();
			AST.fileWriter.close();
			
			System.out.println("Should be OK for AST_" + example);
		}
	}

}
