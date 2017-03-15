grammar Looc;

options {
    k=1;
    output=AST;
    ASTLabelType=CommonTree;
}

tokens {
    ROOT;
    ARGS;
    DECL_CLASS;
    DECL_VAR;
    DECL_METHOD;
    METHOD_ARGS;
    COND;
    FOR;
    DO;
    SUPER;
    AFFECT;
    WRITE;
    THIS;
    RETURN;
    OPER;
    METHOD_CALL;
    READ;
    BODY;
}

@header {
    package main.antlr;
}

@lexer::header {
    package main.antlr;
}

program
    :   class_decl* var_decl* instruction+ -> ^(ROOT class_decl* var_decl* instruction+)
    ;

class_decl
    :   'class' IDF_CLASS ('inherit' IDF_CLASS)? '=' '(' class_item_decl ')' -> ^(DECL_CLASS IDF_CLASS (IDF_CLASS)? class_item_decl)
    ;

class_item_decl
    :   var_decl* method_decl* -> var_decl* method_decl*
    ;

var_decl
    :   'var' IDF ':' type ';' -> ^(DECL_VAR IDF type)
    ;

type
    :   IDF_CLASS
    |   'int'
    |   'string'
    ;

method_decl
    :   'method' IDF '(' method_args? (',' e=method_args)* ')'  (':' type)? '{'var_decl* instruction+ '}' -> ^(DECL_METHOD IDF method_args? ($e)* type? var_decl* instruction+)
    ;

method_args
    :   IDF ':' type  -> ^(METHOD_ARGS IDF type)
    ;

instruction
    :   expression ':=' expression ';'   -> ^(AFFECT expression expression)
    |   'if' expression  'then'  c=instruction+ ('else' d=instruction+)?'fi' -> ^(COND expression $c ($d)?)
    |   'for' IDF 'in' g=expression '..' h=expression  'do' instruction+ 'end' -> ^(FOR IDF $g $h instruction+)
    |   '{'  var_decl* instruction+  '}' -> ^(BODY var_decl* instruction+)
    |   'do' (
    		  'this' 
    		| 'super'
    		| IDF
    		) '.' IDF '(' expression ( ',' expression)* ')' ';' -> ^(DO 'this'? 'super'? IDF* ^(ARGS expression*)? ) 
    |   print
    |   read
    |   retour
    ;



print
    :   'write' expression ';' -> ^(WRITE expression)
    ;

read:    'read' IDF ';' -> ^(READ IDF)
        ;

retour
    :   'return' '(' expression ')' ';' -> ^(RETURN expression)
    ;




expression
    :   'this' '.' IDF ('(' expression (',' expression)* ')')?   -> ^(THIS IDF expression*)
    |   'super'  '.' IDF ('(' expression (',' expression)* ')')? -> ^(SUPER IDF expression*)
    |  '-'?  compOper*  -> compOper*
   						//| '.' IDF '(' expression (',' expression)* ')'  -> ^(METHOD_CALL compOper? IDF ^(ARGS expression*)?  ) 
    					
    
    |   'new'! IDF_CLASS 
    |   CSTE_CHAINE 
    ;
    
 

compOper
	:	oper (comparaison ^oper)*
	;

oper
    :   multOper (('+'|'-') ^multOper)*
    ;

multOper
    :     atom  (('/'|'*'|'%') ^atom)*
    ;



atom
    :   CSTE_ENT
    |   
    	//'this' '.' IDF ('(' expression (',' expression)* ')')?   -> ^(METHOD_CALL 'this'  IDF ^(ARGS expression*)?  )
    	//| 'super' '.' IDF ('(' expression (',' expression)* ')')?  -> ^(METHOD_CALL 'super'  IDF ^(ARGS expression*)?  ) 
    	 IDF ( -> IDF | '.' IDF ('(' expression (',' expression)* ')')?  -> ^(METHOD_CALL IDF  IDF ^(ARGS expression*)?  ) )
    	 
    |  '(' expression ')' ->  expression
    ;

comparaison
    :   '<' strict
    |   '>' strict
    |   '=='
    |   '!='
    ;

strict
    :   '='
    |
    ;

IDF_CLASS:      ('A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
IDF:            ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
CSTE_ENT:       ('0'..'9')+ ;
CSTE_CHAINE:    '"' ('a'..'z'|'A'..'Z'|'0'..'9'|';'|':'|'/'|','|'?'|'!'|'%'|'@'|'#'|'~'|'&'|'\\'|'-'|'_'|'|'|'('|')'|'{'|'}'|'['|']'|'='|' ')* '"';
WS:             (' '|'\t'|'\r'| '\n') {$channel=HIDDEN;} ;
