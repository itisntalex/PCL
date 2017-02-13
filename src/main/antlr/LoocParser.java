// $ANTLR 3.3 Nov 30, 2010 12:50:56 Looc.g 2017-02-13 10:10:07
package main.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LoocParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDF_CLASS", "IDF", "CSTE_CHAINE", "CSTE_ENT", "WS", "'class'", "'inherit'", "'='", "'('", "')'", "'var'", "':'", "';'", "'int'", "'string'", "'method'", "'{'", "'}'", "','", "':='", "'if'", "'then'", "'else'", "'fi'", "'for'", "'in'", "'..'", "'do'", "'end'", "'.'", "'write'", "'read'", "'return'", "'this'", "'super'", "'-'", "'new'", "'/'", "'*'", "'%'", "'+'", "'<'", "'>'", "'=='", "'!='"
    };
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int IDF_CLASS=4;
    public static final int IDF=5;
    public static final int CSTE_CHAINE=6;
    public static final int CSTE_ENT=7;
    public static final int WS=8;

    // delegates
    // delegators


        public LoocParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public LoocParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);

        }

    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return LoocParser.tokenNames; }
    public String getGrammarFileName() { return "Looc.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // Looc.g:9:1: program : ( class_decl )* ( var_decl )* ( instruction )+ ;
    public final LoocParser.program_return program() throws RecognitionException {
        LoocParser.program_return retval = new LoocParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LoocParser.class_decl_return class_decl1 = null;

        LoocParser.var_decl_return var_decl2 = null;

        LoocParser.instruction_return instruction3 = null;



        try {
            // Looc.g:9:8: ( ( class_decl )* ( var_decl )* ( instruction )+ )
            // Looc.g:9:12: ( class_decl )* ( var_decl )* ( instruction )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // Looc.g:9:12: ( class_decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==9) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Looc.g:9:12: class_decl
            	    {
            	    pushFollow(FOLLOW_class_decl_in_program34);
            	    class_decl1=class_decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, class_decl1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // Looc.g:9:24: ( var_decl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Looc.g:9:24: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_program37);
            	    var_decl2=var_decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, var_decl2.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // Looc.g:9:34: ( instruction )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDF||LA3_0==20||LA3_0==24||LA3_0==28||LA3_0==31||(LA3_0>=34 && LA3_0<=36)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Looc.g:9:34: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_program40);
            	    instruction3=instruction();

            	    state._fsp--;

            	    adaptor.addChild(root_0, instruction3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class class_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_decl"
    // Looc.g:12:1: class_decl : 'class' IDF_CLASS ( 'inherit' IDF_CLASS )? '=' '(' class_item_decl ')' ;
    public final LoocParser.class_decl_return class_decl() throws RecognitionException {
        LoocParser.class_decl_return retval = new LoocParser.class_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal4=null;
        Token IDF_CLASS5=null;
        Token string_literal6=null;
        Token IDF_CLASS7=null;
        Token char_literal8=null;
        Token char_literal9=null;
        Token char_literal11=null;
        LoocParser.class_item_decl_return class_item_decl10 = null;


        CommonTree string_literal4_tree=null;
        CommonTree IDF_CLASS5_tree=null;
        CommonTree string_literal6_tree=null;
        CommonTree IDF_CLASS7_tree=null;
        CommonTree char_literal8_tree=null;
        CommonTree char_literal9_tree=null;
        CommonTree char_literal11_tree=null;

        try {
            // Looc.g:12:11: ( 'class' IDF_CLASS ( 'inherit' IDF_CLASS )? '=' '(' class_item_decl ')' )
            // Looc.g:12:14: 'class' IDF_CLASS ( 'inherit' IDF_CLASS )? '=' '(' class_item_decl ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal4=(Token)match(input,9,FOLLOW_9_in_class_decl53);
            string_literal4_tree = (CommonTree)adaptor.create(string_literal4);
            adaptor.addChild(root_0, string_literal4_tree);

            IDF_CLASS5=(Token)match(input,IDF_CLASS,FOLLOW_IDF_CLASS_in_class_decl55);
            IDF_CLASS5_tree = (CommonTree)adaptor.create(IDF_CLASS5);
            adaptor.addChild(root_0, IDF_CLASS5_tree);

            // Looc.g:12:32: ( 'inherit' IDF_CLASS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==10) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Looc.g:12:33: 'inherit' IDF_CLASS
                    {
                    string_literal6=(Token)match(input,10,FOLLOW_10_in_class_decl58);
                    string_literal6_tree = (CommonTree)adaptor.create(string_literal6);
                    adaptor.addChild(root_0, string_literal6_tree);

                    IDF_CLASS7=(Token)match(input,IDF_CLASS,FOLLOW_IDF_CLASS_in_class_decl60);
                    IDF_CLASS7_tree = (CommonTree)adaptor.create(IDF_CLASS7);
                    adaptor.addChild(root_0, IDF_CLASS7_tree);


                    }
                    break;

            }

            char_literal8=(Token)match(input,11,FOLLOW_11_in_class_decl64);
            char_literal8_tree = (CommonTree)adaptor.create(char_literal8);
            adaptor.addChild(root_0, char_literal8_tree);

            char_literal9=(Token)match(input,12,FOLLOW_12_in_class_decl66);
            char_literal9_tree = (CommonTree)adaptor.create(char_literal9);
            adaptor.addChild(root_0, char_literal9_tree);

            pushFollow(FOLLOW_class_item_decl_in_class_decl68);
            class_item_decl10=class_item_decl();

            state._fsp--;

            adaptor.addChild(root_0, class_item_decl10.getTree());
            char_literal11=(Token)match(input,13,FOLLOW_13_in_class_decl70);
            char_literal11_tree = (CommonTree)adaptor.create(char_literal11);
            adaptor.addChild(root_0, char_literal11_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_decl"

    public static class class_item_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_item_decl"
    // Looc.g:15:1: class_item_decl : ( var_decl )* ( method_decl )* ;
    public final LoocParser.class_item_decl_return class_item_decl() throws RecognitionException {
        LoocParser.class_item_decl_return retval = new LoocParser.class_item_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        LoocParser.var_decl_return var_decl12 = null;

        LoocParser.method_decl_return method_decl13 = null;



        try {
            // Looc.g:15:16: ( ( var_decl )* ( method_decl )* )
            // Looc.g:15:19: ( var_decl )* ( method_decl )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // Looc.g:15:19: ( var_decl )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Looc.g:15:19: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_class_item_decl84);
            	    var_decl12=var_decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, var_decl12.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // Looc.g:15:29: ( method_decl )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Looc.g:15:29: method_decl
            	    {
            	    pushFollow(FOLLOW_method_decl_in_class_item_decl87);
            	    method_decl13=method_decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, method_decl13.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_item_decl"

    public static class var_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "var_decl"
    // Looc.g:18:1: var_decl : 'var' IDF ':' type ';' ;
    public final LoocParser.var_decl_return var_decl() throws RecognitionException {
        LoocParser.var_decl_return retval = new LoocParser.var_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal14=null;
        Token IDF15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        LoocParser.type_return type17 = null;


        CommonTree string_literal14_tree=null;
        CommonTree IDF15_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree char_literal18_tree=null;

        try {
            // Looc.g:18:9: ( 'var' IDF ':' type ';' )
            // Looc.g:18:12: 'var' IDF ':' type ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal14=(Token)match(input,14,FOLLOW_14_in_var_decl102);
            string_literal14_tree = (CommonTree)adaptor.create(string_literal14);
            adaptor.addChild(root_0, string_literal14_tree);

            IDF15=(Token)match(input,IDF,FOLLOW_IDF_in_var_decl104);
            IDF15_tree = (CommonTree)adaptor.create(IDF15);
            adaptor.addChild(root_0, IDF15_tree);

            char_literal16=(Token)match(input,15,FOLLOW_15_in_var_decl106);
            char_literal16_tree = (CommonTree)adaptor.create(char_literal16);
            adaptor.addChild(root_0, char_literal16_tree);

            pushFollow(FOLLOW_type_in_var_decl108);
            type17=type();

            state._fsp--;

            adaptor.addChild(root_0, type17.getTree());
            char_literal18=(Token)match(input,16,FOLLOW_16_in_var_decl110);
            char_literal18_tree = (CommonTree)adaptor.create(char_literal18);
            adaptor.addChild(root_0, char_literal18_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var_decl"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // Looc.g:21:1: type : ( IDF_CLASS | 'int' | 'string' );
    public final LoocParser.type_return type() throws RecognitionException {
        LoocParser.type_return retval = new LoocParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set19=null;

        CommonTree set19_tree=null;

        try {
            // Looc.g:21:5: ( IDF_CLASS | 'int' | 'string' )
            // Looc.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set19=(Token)input.LT(1);
            if ( input.LA(1)==IDF_CLASS||(input.LA(1)>=17 && input.LA(1)<=18) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set19));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class method_decl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_decl"
    // Looc.g:26:1: method_decl : 'method' IDF '(' ( method_args )* ')' method_decl_suite ;
    public final LoocParser.method_decl_return method_decl() throws RecognitionException {
        LoocParser.method_decl_return retval = new LoocParser.method_decl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal20=null;
        Token IDF21=null;
        Token char_literal22=null;
        Token char_literal24=null;
        LoocParser.method_args_return method_args23 = null;

        LoocParser.method_decl_suite_return method_decl_suite25 = null;


        CommonTree string_literal20_tree=null;
        CommonTree IDF21_tree=null;
        CommonTree char_literal22_tree=null;
        CommonTree char_literal24_tree=null;

        try {
            // Looc.g:26:12: ( 'method' IDF '(' ( method_args )* ')' method_decl_suite )
            // Looc.g:26:14: 'method' IDF '(' ( method_args )* ')' method_decl_suite
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal20=(Token)match(input,19,FOLLOW_19_in_method_decl144);
            string_literal20_tree = (CommonTree)adaptor.create(string_literal20);
            adaptor.addChild(root_0, string_literal20_tree);

            IDF21=(Token)match(input,IDF,FOLLOW_IDF_in_method_decl146);
            IDF21_tree = (CommonTree)adaptor.create(IDF21);
            adaptor.addChild(root_0, IDF21_tree);

            char_literal22=(Token)match(input,12,FOLLOW_12_in_method_decl148);
            char_literal22_tree = (CommonTree)adaptor.create(char_literal22);
            adaptor.addChild(root_0, char_literal22_tree);

            // Looc.g:26:31: ( method_args )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDF) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Looc.g:26:31: method_args
            	    {
            	    pushFollow(FOLLOW_method_args_in_method_decl150);
            	    method_args23=method_args();

            	    state._fsp--;

            	    adaptor.addChild(root_0, method_args23.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            char_literal24=(Token)match(input,13,FOLLOW_13_in_method_decl153);
            char_literal24_tree = (CommonTree)adaptor.create(char_literal24);
            adaptor.addChild(root_0, char_literal24_tree);

            pushFollow(FOLLOW_method_decl_suite_in_method_decl156);
            method_decl_suite25=method_decl_suite();

            state._fsp--;

            adaptor.addChild(root_0, method_decl_suite25.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_decl"

    public static class method_decl_suite_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_decl_suite"
    // Looc.g:29:1: method_decl_suite : ( '{' ( var_decl )* ( instruction )+ '}' | ':' type '{' ( var_decl )* ( instruction )+ '}' );
    public final LoocParser.method_decl_suite_return method_decl_suite() throws RecognitionException {
        LoocParser.method_decl_suite_return retval = new LoocParser.method_decl_suite_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal26=null;
        Token char_literal29=null;
        Token char_literal30=null;
        Token char_literal32=null;
        Token char_literal35=null;
        LoocParser.var_decl_return var_decl27 = null;

        LoocParser.instruction_return instruction28 = null;

        LoocParser.type_return type31 = null;

        LoocParser.var_decl_return var_decl33 = null;

        LoocParser.instruction_return instruction34 = null;


        CommonTree char_literal26_tree=null;
        CommonTree char_literal29_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree char_literal32_tree=null;
        CommonTree char_literal35_tree=null;

        try {
            // Looc.g:29:18: ( '{' ( var_decl )* ( instruction )+ '}' | ':' type '{' ( var_decl )* ( instruction )+ '}' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            else if ( (LA12_0==15) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // Looc.g:29:20: '{' ( var_decl )* ( instruction )+ '}'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal26=(Token)match(input,20,FOLLOW_20_in_method_decl_suite169);
                    char_literal26_tree = (CommonTree)adaptor.create(char_literal26);
                    adaptor.addChild(root_0, char_literal26_tree);

                    // Looc.g:29:24: ( var_decl )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Looc.g:29:24: var_decl
                    	    {
                    	    pushFollow(FOLLOW_var_decl_in_method_decl_suite171);
                    	    var_decl27=var_decl();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, var_decl27.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // Looc.g:29:34: ( instruction )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==IDF||LA9_0==20||LA9_0==24||LA9_0==28||LA9_0==31||(LA9_0>=34 && LA9_0<=36)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Looc.g:29:34: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_method_decl_suite174);
                    	    instruction28=instruction();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, instruction28.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    char_literal29=(Token)match(input,21,FOLLOW_21_in_method_decl_suite177);
                    char_literal29_tree = (CommonTree)adaptor.create(char_literal29);
                    adaptor.addChild(root_0, char_literal29_tree);


                    }
                    break;
                case 2 :
                    // Looc.g:30:8: ':' type '{' ( var_decl )* ( instruction )+ '}'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal30=(Token)match(input,15,FOLLOW_15_in_method_decl_suite186);
                    char_literal30_tree = (CommonTree)adaptor.create(char_literal30);
                    adaptor.addChild(root_0, char_literal30_tree);

                    pushFollow(FOLLOW_type_in_method_decl_suite188);
                    type31=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type31.getTree());
                    char_literal32=(Token)match(input,20,FOLLOW_20_in_method_decl_suite190);
                    char_literal32_tree = (CommonTree)adaptor.create(char_literal32);
                    adaptor.addChild(root_0, char_literal32_tree);

                    // Looc.g:30:21: ( var_decl )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Looc.g:30:21: var_decl
                    	    {
                    	    pushFollow(FOLLOW_var_decl_in_method_decl_suite192);
                    	    var_decl33=var_decl();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, var_decl33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    // Looc.g:30:31: ( instruction )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==IDF||LA11_0==20||LA11_0==24||LA11_0==28||LA11_0==31||(LA11_0>=34 && LA11_0<=36)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Looc.g:30:31: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_method_decl_suite195);
                    	    instruction34=instruction();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, instruction34.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    char_literal35=(Token)match(input,21,FOLLOW_21_in_method_decl_suite198);
                    char_literal35_tree = (CommonTree)adaptor.create(char_literal35);
                    adaptor.addChild(root_0, char_literal35_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_decl_suite"

    public static class method_args_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "method_args"
    // Looc.g:33:1: method_args : IDF ':' type ( ',' IDF ':' type )* ;
    public final LoocParser.method_args_return method_args() throws RecognitionException {
        LoocParser.method_args_return retval = new LoocParser.method_args_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF36=null;
        Token char_literal37=null;
        Token char_literal39=null;
        Token IDF40=null;
        Token char_literal41=null;
        LoocParser.type_return type38 = null;

        LoocParser.type_return type42 = null;


        CommonTree IDF36_tree=null;
        CommonTree char_literal37_tree=null;
        CommonTree char_literal39_tree=null;
        CommonTree IDF40_tree=null;
        CommonTree char_literal41_tree=null;

        try {
            // Looc.g:33:12: ( IDF ':' type ( ',' IDF ':' type )* )
            // Looc.g:33:14: IDF ':' type ( ',' IDF ':' type )*
            {
            root_0 = (CommonTree)adaptor.nil();

            IDF36=(Token)match(input,IDF,FOLLOW_IDF_in_method_args211);
            IDF36_tree = (CommonTree)adaptor.create(IDF36);
            adaptor.addChild(root_0, IDF36_tree);

            char_literal37=(Token)match(input,15,FOLLOW_15_in_method_args213);
            char_literal37_tree = (CommonTree)adaptor.create(char_literal37);
            adaptor.addChild(root_0, char_literal37_tree);

            pushFollow(FOLLOW_type_in_method_args215);
            type38=type();

            state._fsp--;

            adaptor.addChild(root_0, type38.getTree());
            // Looc.g:33:27: ( ',' IDF ':' type )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Looc.g:33:28: ',' IDF ':' type
            	    {
            	    char_literal39=(Token)match(input,22,FOLLOW_22_in_method_args218);
            	    char_literal39_tree = (CommonTree)adaptor.create(char_literal39);
            	    adaptor.addChild(root_0, char_literal39_tree);

            	    IDF40=(Token)match(input,IDF,FOLLOW_IDF_in_method_args220);
            	    IDF40_tree = (CommonTree)adaptor.create(IDF40);
            	    adaptor.addChild(root_0, IDF40_tree);

            	    char_literal41=(Token)match(input,15,FOLLOW_15_in_method_args222);
            	    char_literal41_tree = (CommonTree)adaptor.create(char_literal41);
            	    adaptor.addChild(root_0, char_literal41_tree);

            	    pushFollow(FOLLOW_type_in_method_args224);
            	    type42=type();

            	    state._fsp--;

            	    adaptor.addChild(root_0, type42.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "method_args"

    public static class instruction_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instruction"
    // Looc.g:36:1: instruction : ( IDF ':=' expression ';' | 'if' expression 'then' ( instruction )+ ( 'else' ( instruction )+ )? 'fi' | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' | '{' ( var_decl )* ( instruction )+ '}' | 'do' expression_start '.' IDF '(' expression ( ',' expression )* ')' ';' | print | read | retour );
    public final LoocParser.instruction_return instruction() throws RecognitionException {
        LoocParser.instruction_return retval = new LoocParser.instruction_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDF43=null;
        Token string_literal44=null;
        Token char_literal46=null;
        Token string_literal47=null;
        Token string_literal49=null;
        Token string_literal51=null;
        Token string_literal53=null;
        Token string_literal54=null;
        Token IDF55=null;
        Token string_literal56=null;
        Token string_literal58=null;
        Token string_literal60=null;
        Token string_literal62=null;
        Token char_literal63=null;
        Token char_literal66=null;
        Token string_literal67=null;
        Token char_literal69=null;
        Token IDF70=null;
        Token char_literal71=null;
        Token char_literal73=null;
        Token char_literal75=null;
        Token char_literal76=null;
        LoocParser.expression_return expression45 = null;

        LoocParser.expression_return expression48 = null;

        LoocParser.instruction_return instruction50 = null;

        LoocParser.instruction_return instruction52 = null;

        LoocParser.expression_return expression57 = null;

        LoocParser.expression_return expression59 = null;

        LoocParser.instruction_return instruction61 = null;

        LoocParser.var_decl_return var_decl64 = null;

        LoocParser.instruction_return instruction65 = null;

        LoocParser.expression_start_return expression_start68 = null;

        LoocParser.expression_return expression72 = null;

        LoocParser.expression_return expression74 = null;

        LoocParser.print_return print77 = null;

        LoocParser.read_return read78 = null;

        LoocParser.retour_return retour79 = null;


        CommonTree IDF43_tree=null;
        CommonTree string_literal44_tree=null;
        CommonTree char_literal46_tree=null;
        CommonTree string_literal47_tree=null;
        CommonTree string_literal49_tree=null;
        CommonTree string_literal51_tree=null;
        CommonTree string_literal53_tree=null;
        CommonTree string_literal54_tree=null;
        CommonTree IDF55_tree=null;
        CommonTree string_literal56_tree=null;
        CommonTree string_literal58_tree=null;
        CommonTree string_literal60_tree=null;
        CommonTree string_literal62_tree=null;
        CommonTree char_literal63_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree string_literal67_tree=null;
        CommonTree char_literal69_tree=null;
        CommonTree IDF70_tree=null;
        CommonTree char_literal71_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree char_literal75_tree=null;
        CommonTree char_literal76_tree=null;

        try {
            // Looc.g:36:12: ( IDF ':=' expression ';' | 'if' expression 'then' ( instruction )+ ( 'else' ( instruction )+ )? 'fi' | 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end' | '{' ( var_decl )* ( instruction )+ '}' | 'do' expression_start '.' IDF '(' expression ( ',' expression )* ')' ';' | print | read | retour )
            int alt21=8;
            switch ( input.LA(1) ) {
            case IDF:
                {
                alt21=1;
                }
                break;
            case 24:
                {
                alt21=2;
                }
                break;
            case 28:
                {
                alt21=3;
                }
                break;
            case 20:
                {
                alt21=4;
                }
                break;
            case 31:
                {
                alt21=5;
                }
                break;
            case 34:
                {
                alt21=6;
                }
                break;
            case 35:
                {
                alt21=7;
                }
                break;
            case 36:
                {
                alt21=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // Looc.g:36:14: IDF ':=' expression ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDF43=(Token)match(input,IDF,FOLLOW_IDF_in_instruction239);
                    IDF43_tree = (CommonTree)adaptor.create(IDF43);
                    adaptor.addChild(root_0, IDF43_tree);

                    string_literal44=(Token)match(input,23,FOLLOW_23_in_instruction241);
                    string_literal44_tree = (CommonTree)adaptor.create(string_literal44);
                    adaptor.addChild(root_0, string_literal44_tree);

                    pushFollow(FOLLOW_expression_in_instruction243);
                    expression45=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression45.getTree());
                    char_literal46=(Token)match(input,16,FOLLOW_16_in_instruction245);
                    char_literal46_tree = (CommonTree)adaptor.create(char_literal46);
                    adaptor.addChild(root_0, char_literal46_tree);


                    }
                    break;
                case 2 :
                    // Looc.g:37:5: 'if' expression 'then' ( instruction )+ ( 'else' ( instruction )+ )? 'fi'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal47=(Token)match(input,24,FOLLOW_24_in_instruction251);
                    string_literal47_tree = (CommonTree)adaptor.create(string_literal47);
                    adaptor.addChild(root_0, string_literal47_tree);

                    pushFollow(FOLLOW_expression_in_instruction253);
                    expression48=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression48.getTree());
                    string_literal49=(Token)match(input,25,FOLLOW_25_in_instruction255);
                    string_literal49_tree = (CommonTree)adaptor.create(string_literal49);
                    adaptor.addChild(root_0, string_literal49_tree);

                    // Looc.g:37:29: ( instruction )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==IDF||LA14_0==20||LA14_0==24||LA14_0==28||LA14_0==31||(LA14_0>=34 && LA14_0<=36)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // Looc.g:37:29: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction258);
                    	    instruction50=instruction();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, instruction50.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    // Looc.g:37:42: ( 'else' ( instruction )+ )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==26) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // Looc.g:37:43: 'else' ( instruction )+
                            {
                            string_literal51=(Token)match(input,26,FOLLOW_26_in_instruction262);
                            string_literal51_tree = (CommonTree)adaptor.create(string_literal51);
                            adaptor.addChild(root_0, string_literal51_tree);

                            // Looc.g:37:50: ( instruction )+
                            int cnt15=0;
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==IDF||LA15_0==20||LA15_0==24||LA15_0==28||LA15_0==31||(LA15_0>=34 && LA15_0<=36)) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // Looc.g:37:50: instruction
                            	    {
                            	    pushFollow(FOLLOW_instruction_in_instruction264);
                            	    instruction52=instruction();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, instruction52.getTree());

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt15 >= 1 ) break loop15;
                                        EarlyExitException eee =
                                            new EarlyExitException(15, input);
                                        throw eee;
                                }
                                cnt15++;
                            } while (true);


                            }
                            break;

                    }

                    string_literal53=(Token)match(input,27,FOLLOW_27_in_instruction268);
                    string_literal53_tree = (CommonTree)adaptor.create(string_literal53);
                    adaptor.addChild(root_0, string_literal53_tree);


                    }
                    break;
                case 3 :
                    // Looc.g:38:5: 'for' IDF 'in' expression '..' expression 'do' ( instruction )+ 'end'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal54=(Token)match(input,28,FOLLOW_28_in_instruction274);
                    string_literal54_tree = (CommonTree)adaptor.create(string_literal54);
                    adaptor.addChild(root_0, string_literal54_tree);

                    IDF55=(Token)match(input,IDF,FOLLOW_IDF_in_instruction276);
                    IDF55_tree = (CommonTree)adaptor.create(IDF55);
                    adaptor.addChild(root_0, IDF55_tree);

                    string_literal56=(Token)match(input,29,FOLLOW_29_in_instruction278);
                    string_literal56_tree = (CommonTree)adaptor.create(string_literal56);
                    adaptor.addChild(root_0, string_literal56_tree);

                    pushFollow(FOLLOW_expression_in_instruction280);
                    expression57=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression57.getTree());
                    string_literal58=(Token)match(input,30,FOLLOW_30_in_instruction282);
                    string_literal58_tree = (CommonTree)adaptor.create(string_literal58);
                    adaptor.addChild(root_0, string_literal58_tree);

                    pushFollow(FOLLOW_expression_in_instruction284);
                    expression59=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression59.getTree());
                    string_literal60=(Token)match(input,31,FOLLOW_31_in_instruction287);
                    string_literal60_tree = (CommonTree)adaptor.create(string_literal60);
                    adaptor.addChild(root_0, string_literal60_tree);

                    // Looc.g:38:53: ( instruction )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==IDF||LA17_0==20||LA17_0==24||LA17_0==28||LA17_0==31||(LA17_0>=34 && LA17_0<=36)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Looc.g:38:53: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction289);
                    	    instruction61=instruction();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, instruction61.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    string_literal62=(Token)match(input,32,FOLLOW_32_in_instruction292);
                    string_literal62_tree = (CommonTree)adaptor.create(string_literal62);
                    adaptor.addChild(root_0, string_literal62_tree);


                    }
                    break;
                case 4 :
                    // Looc.g:39:5: '{' ( var_decl )* ( instruction )+ '}'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal63=(Token)match(input,20,FOLLOW_20_in_instruction299);
                    char_literal63_tree = (CommonTree)adaptor.create(char_literal63);
                    adaptor.addChild(root_0, char_literal63_tree);

                    // Looc.g:39:10: ( var_decl )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // Looc.g:39:10: var_decl
                    	    {
                    	    pushFollow(FOLLOW_var_decl_in_instruction302);
                    	    var_decl64=var_decl();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, var_decl64.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // Looc.g:39:20: ( instruction )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==IDF||LA19_0==20||LA19_0==24||LA19_0==28||LA19_0==31||(LA19_0>=34 && LA19_0<=36)) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // Looc.g:39:20: instruction
                    	    {
                    	    pushFollow(FOLLOW_instruction_in_instruction305);
                    	    instruction65=instruction();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, instruction65.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    char_literal66=(Token)match(input,21,FOLLOW_21_in_instruction309);
                    char_literal66_tree = (CommonTree)adaptor.create(char_literal66);
                    adaptor.addChild(root_0, char_literal66_tree);


                    }
                    break;
                case 5 :
                    // Looc.g:40:5: 'do' expression_start '.' IDF '(' expression ( ',' expression )* ')' ';'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal67=(Token)match(input,31,FOLLOW_31_in_instruction316);
                    string_literal67_tree = (CommonTree)adaptor.create(string_literal67);
                    adaptor.addChild(root_0, string_literal67_tree);

                    pushFollow(FOLLOW_expression_start_in_instruction318);
                    expression_start68=expression_start();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_start68.getTree());
                    char_literal69=(Token)match(input,33,FOLLOW_33_in_instruction320);
                    char_literal69_tree = (CommonTree)adaptor.create(char_literal69);
                    adaptor.addChild(root_0, char_literal69_tree);

                    IDF70=(Token)match(input,IDF,FOLLOW_IDF_in_instruction322);
                    IDF70_tree = (CommonTree)adaptor.create(IDF70);
                    adaptor.addChild(root_0, IDF70_tree);

                    char_literal71=(Token)match(input,12,FOLLOW_12_in_instruction324);
                    char_literal71_tree = (CommonTree)adaptor.create(char_literal71);
                    adaptor.addChild(root_0, char_literal71_tree);

                    pushFollow(FOLLOW_expression_in_instruction325);
                    expression72=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression72.getTree());
                    // Looc.g:40:49: ( ',' expression )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==22) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Looc.g:40:50: ',' expression
                    	    {
                    	    char_literal73=(Token)match(input,22,FOLLOW_22_in_instruction328);
                    	    char_literal73_tree = (CommonTree)adaptor.create(char_literal73);
                    	    adaptor.addChild(root_0, char_literal73_tree);

                    	    pushFollow(FOLLOW_expression_in_instruction330);
                    	    expression74=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression74.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    char_literal75=(Token)match(input,13,FOLLOW_13_in_instruction334);
                    char_literal75_tree = (CommonTree)adaptor.create(char_literal75);
                    adaptor.addChild(root_0, char_literal75_tree);

                    char_literal76=(Token)match(input,16,FOLLOW_16_in_instruction336);
                    char_literal76_tree = (CommonTree)adaptor.create(char_literal76);
                    adaptor.addChild(root_0, char_literal76_tree);


                    }
                    break;
                case 6 :
                    // Looc.g:41:5: print
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_print_in_instruction343);
                    print77=print();

                    state._fsp--;

                    adaptor.addChild(root_0, print77.getTree());

                    }
                    break;
                case 7 :
                    // Looc.g:42:5: read
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_read_in_instruction349);
                    read78=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read78.getTree());

                    }
                    break;
                case 8 :
                    // Looc.g:43:5: retour
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_retour_in_instruction355);
                    retour79=retour();

                    state._fsp--;

                    adaptor.addChild(root_0, retour79.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instruction"

    public static class print_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print"
    // Looc.g:51:1: print : 'write' print_suite ';' ;
    public final LoocParser.print_return print() throws RecognitionException {
        LoocParser.print_return retval = new LoocParser.print_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal80=null;
        Token char_literal82=null;
        LoocParser.print_suite_return print_suite81 = null;


        CommonTree string_literal80_tree=null;
        CommonTree char_literal82_tree=null;

        try {
            // Looc.g:51:6: ( 'write' print_suite ';' )
            // Looc.g:51:8: 'write' print_suite ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal80=(Token)match(input,34,FOLLOW_34_in_print372);
            string_literal80_tree = (CommonTree)adaptor.create(string_literal80);
            adaptor.addChild(root_0, string_literal80_tree);

            pushFollow(FOLLOW_print_suite_in_print374);
            print_suite81=print_suite();

            state._fsp--;

            adaptor.addChild(root_0, print_suite81.getTree());
            char_literal82=(Token)match(input,16,FOLLOW_16_in_print376);
            char_literal82_tree = (CommonTree)adaptor.create(char_literal82);
            adaptor.addChild(root_0, char_literal82_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "print"

    public static class print_suite_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "print_suite"
    // Looc.g:54:1: print_suite : ( expression | CSTE_CHAINE );
    public final LoocParser.print_suite_return print_suite() throws RecognitionException {
        LoocParser.print_suite_return retval = new LoocParser.print_suite_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CSTE_CHAINE84=null;
        LoocParser.expression_return expression83 = null;


        CommonTree CSTE_CHAINE84_tree=null;

        try {
            // Looc.g:54:12: ( expression | CSTE_CHAINE )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IDF||LA22_0==CSTE_ENT||(LA22_0>=12 && LA22_0<=13)||LA22_0==16||LA22_0==22||LA22_0==25||(LA22_0>=30 && LA22_0<=31)||(LA22_0>=37 && LA22_0<=40)) ) {
                alt22=1;
            }
            else if ( (LA22_0==CSTE_CHAINE) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // Looc.g:54:14: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_print_suite386);
                    expression83=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression83.getTree());

                    }
                    break;
                case 2 :
                    // Looc.g:55:5: CSTE_CHAINE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CSTE_CHAINE84=(Token)match(input,CSTE_CHAINE,FOLLOW_CSTE_CHAINE_in_print_suite393);
                    CSTE_CHAINE84_tree = (CommonTree)adaptor.create(CSTE_CHAINE84);
                    adaptor.addChild(root_0, CSTE_CHAINE84_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "print_suite"

    public static class read_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "read"
    // Looc.g:58:1: read : 'read' IDF ';' ;
    public final LoocParser.read_return read() throws RecognitionException {
        LoocParser.read_return retval = new LoocParser.read_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal85=null;
        Token IDF86=null;
        Token char_literal87=null;

        CommonTree string_literal85_tree=null;
        CommonTree IDF86_tree=null;
        CommonTree char_literal87_tree=null;

        try {
            // Looc.g:58:5: ( 'read' IDF ';' )
            // Looc.g:58:7: 'read' IDF ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal85=(Token)match(input,35,FOLLOW_35_in_read404);
            string_literal85_tree = (CommonTree)adaptor.create(string_literal85);
            adaptor.addChild(root_0, string_literal85_tree);

            IDF86=(Token)match(input,IDF,FOLLOW_IDF_in_read406);
            IDF86_tree = (CommonTree)adaptor.create(IDF86);
            adaptor.addChild(root_0, IDF86_tree);

            char_literal87=(Token)match(input,16,FOLLOW_16_in_read408);
            char_literal87_tree = (CommonTree)adaptor.create(char_literal87);
            adaptor.addChild(root_0, char_literal87_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "read"

    public static class retour_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "retour"
    // Looc.g:61:1: retour : 'return' '(' expression ')' ';' ;
    public final LoocParser.retour_return retour() throws RecognitionException {
        LoocParser.retour_return retval = new LoocParser.retour_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal88=null;
        Token char_literal89=null;
        Token char_literal91=null;
        Token char_literal92=null;
        LoocParser.expression_return expression90 = null;


        CommonTree string_literal88_tree=null;
        CommonTree char_literal89_tree=null;
        CommonTree char_literal91_tree=null;
        CommonTree char_literal92_tree=null;

        try {
            // Looc.g:61:7: ( 'return' '(' expression ')' ';' )
            // Looc.g:61:10: 'return' '(' expression ')' ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal88=(Token)match(input,36,FOLLOW_36_in_retour420);
            string_literal88_tree = (CommonTree)adaptor.create(string_literal88);
            adaptor.addChild(root_0, string_literal88_tree);

            char_literal89=(Token)match(input,12,FOLLOW_12_in_retour422);
            char_literal89_tree = (CommonTree)adaptor.create(char_literal89);
            adaptor.addChild(root_0, char_literal89_tree);

            pushFollow(FOLLOW_expression_in_retour424);
            expression90=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression90.getTree());
            char_literal91=(Token)match(input,13,FOLLOW_13_in_retour426);
            char_literal91_tree = (CommonTree)adaptor.create(char_literal91);
            adaptor.addChild(root_0, char_literal91_tree);

            char_literal92=(Token)match(input,16,FOLLOW_16_in_retour428);
            char_literal92_tree = (CommonTree)adaptor.create(char_literal92);
            adaptor.addChild(root_0, char_literal92_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "retour"

    public static class expression_start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression_start"
    // Looc.g:66:1: expression_start : ( IDF | 'this' | 'super' );
    public final LoocParser.expression_start_return expression_start() throws RecognitionException {
        LoocParser.expression_start_return retval = new LoocParser.expression_start_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set93=null;

        CommonTree set93_tree=null;

        try {
            // Looc.g:67:2: ( IDF | 'this' | 'super' )
            // Looc.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set93=(Token)input.LT(1);
            if ( input.LA(1)==IDF||(input.LA(1)>=37 && input.LA(1)<=38) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set93));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression_start"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // Looc.g:72:1: expression : ( '(' expression ')' expression_suite | IDF expression_suite | '-' CSTE_ENT expression_suite | 'this' expression_suite | 'super' expression_suite | CSTE_ENT expression_suite | 'new' IDF_CLASS | );
    public final LoocParser.expression_return expression() throws RecognitionException {
        LoocParser.expression_return retval = new LoocParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal94=null;
        Token char_literal96=null;
        Token IDF98=null;
        Token char_literal100=null;
        Token CSTE_ENT101=null;
        Token string_literal103=null;
        Token string_literal105=null;
        Token CSTE_ENT107=null;
        Token string_literal109=null;
        Token IDF_CLASS110=null;
        LoocParser.expression_return expression95 = null;

        LoocParser.expression_suite_return expression_suite97 = null;

        LoocParser.expression_suite_return expression_suite99 = null;

        LoocParser.expression_suite_return expression_suite102 = null;

        LoocParser.expression_suite_return expression_suite104 = null;

        LoocParser.expression_suite_return expression_suite106 = null;

        LoocParser.expression_suite_return expression_suite108 = null;


        CommonTree char_literal94_tree=null;
        CommonTree char_literal96_tree=null;
        CommonTree IDF98_tree=null;
        CommonTree char_literal100_tree=null;
        CommonTree CSTE_ENT101_tree=null;
        CommonTree string_literal103_tree=null;
        CommonTree string_literal105_tree=null;
        CommonTree CSTE_ENT107_tree=null;
        CommonTree string_literal109_tree=null;
        CommonTree IDF_CLASS110_tree=null;

        try {
            // Looc.g:73:2: ( '(' expression ')' expression_suite | IDF expression_suite | '-' CSTE_ENT expression_suite | 'this' expression_suite | 'super' expression_suite | CSTE_ENT expression_suite | 'new' IDF_CLASS | )
            int alt23=8;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt23=1;
                }
                break;
            case IDF:
                {
                alt23=2;
                }
                break;
            case 39:
                {
                alt23=3;
                }
                break;
            case 37:
                {
                alt23=4;
                }
                break;
            case 38:
                {
                alt23=5;
                }
                break;
            case CSTE_ENT:
                {
                alt23=6;
                }
                break;
            case 40:
                {
                alt23=7;
                }
                break;
            case 13:
            case 16:
            case 22:
            case 25:
            case 30:
            case 31:
                {
                alt23=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // Looc.g:73:4: '(' expression ')' expression_suite
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal94=(Token)match(input,12,FOLLOW_12_in_expression468);
                    char_literal94_tree = (CommonTree)adaptor.create(char_literal94);
                    adaptor.addChild(root_0, char_literal94_tree);

                    pushFollow(FOLLOW_expression_in_expression470);
                    expression95=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression95.getTree());
                    char_literal96=(Token)match(input,13,FOLLOW_13_in_expression472);
                    char_literal96_tree = (CommonTree)adaptor.create(char_literal96);
                    adaptor.addChild(root_0, char_literal96_tree);

                    pushFollow(FOLLOW_expression_suite_in_expression474);
                    expression_suite97=expression_suite();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_suite97.getTree());

                    }
                    break;
                case 2 :
                    // Looc.g:74:5: IDF expression_suite
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDF98=(Token)match(input,IDF,FOLLOW_IDF_in_expression480);
                    IDF98_tree = (CommonTree)adaptor.create(IDF98);
                    adaptor.addChild(root_0, IDF98_tree);

                    pushFollow(FOLLOW_expression_suite_in_expression482);
                    expression_suite99=expression_suite();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_suite99.getTree());

                    }
                    break;
                case 3 :
                    // Looc.g:75:5: '-' CSTE_ENT expression_suite
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal100=(Token)match(input,39,FOLLOW_39_in_expression488);
                    char_literal100_tree = (CommonTree)adaptor.create(char_literal100);
                    adaptor.addChild(root_0, char_literal100_tree);

                    CSTE_ENT101=(Token)match(input,CSTE_ENT,FOLLOW_CSTE_ENT_in_expression490);
                    CSTE_ENT101_tree = (CommonTree)adaptor.create(CSTE_ENT101);
                    adaptor.addChild(root_0, CSTE_ENT101_tree);

                    pushFollow(FOLLOW_expression_suite_in_expression492);
                    expression_suite102=expression_suite();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_suite102.getTree());

                    }
                    break;
                case 4 :
                    // Looc.g:76:5: 'this' expression_suite
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal103=(Token)match(input,37,FOLLOW_37_in_expression498);
                    string_literal103_tree = (CommonTree)adaptor.create(string_literal103);
                    adaptor.addChild(root_0, string_literal103_tree);

                    pushFollow(FOLLOW_expression_suite_in_expression500);
                    expression_suite104=expression_suite();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_suite104.getTree());

                    }
                    break;
                case 5 :
                    // Looc.g:77:5: 'super' expression_suite
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal105=(Token)match(input,38,FOLLOW_38_in_expression506);
                    string_literal105_tree = (CommonTree)adaptor.create(string_literal105);
                    adaptor.addChild(root_0, string_literal105_tree);

                    pushFollow(FOLLOW_expression_suite_in_expression508);
                    expression_suite106=expression_suite();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_suite106.getTree());

                    }
                    break;
                case 6 :
                    // Looc.g:78:5: CSTE_ENT expression_suite
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CSTE_ENT107=(Token)match(input,CSTE_ENT,FOLLOW_CSTE_ENT_in_expression514);
                    CSTE_ENT107_tree = (CommonTree)adaptor.create(CSTE_ENT107);
                    adaptor.addChild(root_0, CSTE_ENT107_tree);

                    pushFollow(FOLLOW_expression_suite_in_expression516);
                    expression_suite108=expression_suite();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_suite108.getTree());

                    }
                    break;
                case 7 :
                    // Looc.g:79:5: 'new' IDF_CLASS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal109=(Token)match(input,40,FOLLOW_40_in_expression522);
                    string_literal109_tree = (CommonTree)adaptor.create(string_literal109);
                    adaptor.addChild(root_0, string_literal109_tree);

                    IDF_CLASS110=(Token)match(input,IDF_CLASS,FOLLOW_IDF_CLASS_in_expression524);
                    IDF_CLASS110_tree = (CommonTree)adaptor.create(IDF_CLASS110);
                    adaptor.addChild(root_0, IDF_CLASS110_tree);


                    }
                    break;
                case 8 :
                    // Looc.g:81:3:
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expression_suite_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression_suite"
    // Looc.g:83:1: expression_suite : ( '.' IDF '(' expression ( ',' expression )* ')' | ( multOper )+ ( oper )* | ( oper )* | comparaison expression );
    public final LoocParser.expression_suite_return expression_suite() throws RecognitionException {
        LoocParser.expression_suite_return retval = new LoocParser.expression_suite_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal111=null;
        Token IDF112=null;
        Token char_literal113=null;
        Token char_literal115=null;
        Token char_literal117=null;
        LoocParser.expression_return expression114 = null;

        LoocParser.expression_return expression116 = null;

        LoocParser.multOper_return multOper118 = null;

        LoocParser.oper_return oper119 = null;

        LoocParser.oper_return oper120 = null;

        LoocParser.comparaison_return comparaison121 = null;

        LoocParser.expression_return expression122 = null;


        CommonTree char_literal111_tree=null;
        CommonTree IDF112_tree=null;
        CommonTree char_literal113_tree=null;
        CommonTree char_literal115_tree=null;
        CommonTree char_literal117_tree=null;

        try {
            // Looc.g:83:17: ( '.' IDF '(' expression ( ',' expression )* ')' | ( multOper )+ ( oper )* | ( oper )* | comparaison expression )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt28=1;
                }
                break;
            case 41:
            case 42:
            case 43:
                {
                alt28=2;
                }
                break;
            case 13:
            case 16:
            case 22:
            case 25:
            case 30:
            case 31:
            case 39:
            case 44:
                {
                alt28=3;
                }
                break;
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // Looc.g:84:3: '.' IDF '(' expression ( ',' expression )* ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal111=(Token)match(input,33,FOLLOW_33_in_expression_suite542);
                    char_literal111_tree = (CommonTree)adaptor.create(char_literal111);
                    adaptor.addChild(root_0, char_literal111_tree);

                    IDF112=(Token)match(input,IDF,FOLLOW_IDF_in_expression_suite544);
                    IDF112_tree = (CommonTree)adaptor.create(IDF112);
                    adaptor.addChild(root_0, IDF112_tree);

                    char_literal113=(Token)match(input,12,FOLLOW_12_in_expression_suite546);
                    char_literal113_tree = (CommonTree)adaptor.create(char_literal113);
                    adaptor.addChild(root_0, char_literal113_tree);

                    pushFollow(FOLLOW_expression_in_expression_suite548);
                    expression114=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression114.getTree());
                    // Looc.g:84:26: ( ',' expression )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==22) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // Looc.g:84:27: ',' expression
                    	    {
                    	    char_literal115=(Token)match(input,22,FOLLOW_22_in_expression_suite551);
                    	    char_literal115_tree = (CommonTree)adaptor.create(char_literal115);
                    	    adaptor.addChild(root_0, char_literal115_tree);

                    	    pushFollow(FOLLOW_expression_in_expression_suite553);
                    	    expression116=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression116.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    char_literal117=(Token)match(input,13,FOLLOW_13_in_expression_suite557);
                    char_literal117_tree = (CommonTree)adaptor.create(char_literal117);
                    adaptor.addChild(root_0, char_literal117_tree);


                    }
                    break;
                case 2 :
                    // Looc.g:85:5: ( multOper )+ ( oper )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // Looc.g:85:5: ( multOper )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=41 && LA25_0<=43)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // Looc.g:85:5: multOper
                    	    {
                    	    pushFollow(FOLLOW_multOper_in_expression_suite563);
                    	    multOper118=multOper();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, multOper118.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);

                    // Looc.g:85:15: ( oper )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==39||LA26_0==44) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // Looc.g:85:15: oper
                    	    {
                    	    pushFollow(FOLLOW_oper_in_expression_suite566);
                    	    oper119=oper();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, oper119.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // Looc.g:86:5: ( oper )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // Looc.g:86:5: ( oper )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==39||LA27_0==44) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // Looc.g:86:5: oper
                    	    {
                    	    pushFollow(FOLLOW_oper_in_expression_suite573);
                    	    oper120=oper();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, oper120.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // Looc.g:87:5: comparaison expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_comparaison_in_expression_suite580);
                    comparaison121=comparaison();

                    state._fsp--;

                    adaptor.addChild(root_0, comparaison121.getTree());
                    pushFollow(FOLLOW_expression_in_expression_suite582);
                    expression122=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression122.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression_suite"

    public static class multOper_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multOper"
    // Looc.g:90:1: multOper : ( '/' atom | '*' atom | '%' atom );
    public final LoocParser.multOper_return multOper() throws RecognitionException {
        LoocParser.multOper_return retval = new LoocParser.multOper_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal123=null;
        Token char_literal125=null;
        Token char_literal127=null;
        LoocParser.atom_return atom124 = null;

        LoocParser.atom_return atom126 = null;

        LoocParser.atom_return atom128 = null;


        CommonTree char_literal123_tree=null;
        CommonTree char_literal125_tree=null;
        CommonTree char_literal127_tree=null;

        try {
            // Looc.g:91:2: ( '/' atom | '*' atom | '%' atom )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt29=1;
                }
                break;
            case 42:
                {
                alt29=2;
                }
                break;
            case 43:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // Looc.g:92:4: '/' atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal123=(Token)match(input,41,FOLLOW_41_in_multOper600);
                    char_literal123_tree = (CommonTree)adaptor.create(char_literal123);
                    adaptor.addChild(root_0, char_literal123_tree);

                    pushFollow(FOLLOW_atom_in_multOper602);
                    atom124=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom124.getTree());

                    }
                    break;
                case 2 :
                    // Looc.g:93:5: '*' atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal125=(Token)match(input,42,FOLLOW_42_in_multOper608);
                    char_literal125_tree = (CommonTree)adaptor.create(char_literal125);
                    adaptor.addChild(root_0, char_literal125_tree);

                    pushFollow(FOLLOW_atom_in_multOper611);
                    atom126=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom126.getTree());

                    }
                    break;
                case 3 :
                    // Looc.g:94:5: '%' atom
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal127=(Token)match(input,43,FOLLOW_43_in_multOper618);
                    char_literal127_tree = (CommonTree)adaptor.create(char_literal127);
                    adaptor.addChild(root_0, char_literal127_tree);

                    pushFollow(FOLLOW_atom_in_multOper621);
                    atom128=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom128.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multOper"

    public static class oper_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oper"
    // Looc.g:97:1: oper : ( '+' atom ( multOper )* | '-' atom ( multOper )* );
    public final LoocParser.oper_return oper() throws RecognitionException {
        LoocParser.oper_return retval = new LoocParser.oper_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal129=null;
        Token char_literal132=null;
        LoocParser.atom_return atom130 = null;

        LoocParser.multOper_return multOper131 = null;

        LoocParser.atom_return atom133 = null;

        LoocParser.multOper_return multOper134 = null;


        CommonTree char_literal129_tree=null;
        CommonTree char_literal132_tree=null;

        try {
            // Looc.g:98:2: ( '+' atom ( multOper )* | '-' atom ( multOper )* )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            else if ( (LA32_0==39) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // Looc.g:98:4: '+' atom ( multOper )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal129=(Token)match(input,44,FOLLOW_44_in_oper634);
                    char_literal129_tree = (CommonTree)adaptor.create(char_literal129);
                    adaptor.addChild(root_0, char_literal129_tree);

                    pushFollow(FOLLOW_atom_in_oper636);
                    atom130=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom130.getTree());
                    // Looc.g:98:13: ( multOper )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( ((LA30_0>=41 && LA30_0<=43)) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // Looc.g:98:13: multOper
                    	    {
                    	    pushFollow(FOLLOW_multOper_in_oper638);
                    	    multOper131=multOper();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, multOper131.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Looc.g:99:4: '-' atom ( multOper )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal132=(Token)match(input,39,FOLLOW_39_in_oper645);
                    char_literal132_tree = (CommonTree)adaptor.create(char_literal132);
                    adaptor.addChild(root_0, char_literal132_tree);

                    pushFollow(FOLLOW_atom_in_oper647);
                    atom133=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom133.getTree());
                    // Looc.g:99:13: ( multOper )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0>=41 && LA31_0<=43)) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // Looc.g:99:13: multOper
                    	    {
                    	    pushFollow(FOLLOW_multOper_in_oper649);
                    	    multOper134=multOper();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, multOper134.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "oper"

    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // Looc.g:102:1: atom : ( CSTE_ENT | IDF | '(' expression ')' );
    public final LoocParser.atom_return atom() throws RecognitionException {
        LoocParser.atom_return retval = new LoocParser.atom_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CSTE_ENT135=null;
        Token IDF136=null;
        Token char_literal137=null;
        Token char_literal139=null;
        LoocParser.expression_return expression138 = null;


        CommonTree CSTE_ENT135_tree=null;
        CommonTree IDF136_tree=null;
        CommonTree char_literal137_tree=null;
        CommonTree char_literal139_tree=null;

        try {
            // Looc.g:103:5: ( CSTE_ENT | IDF | '(' expression ')' )
            int alt33=3;
            switch ( input.LA(1) ) {
            case CSTE_ENT:
                {
                alt33=1;
                }
                break;
            case IDF:
                {
                alt33=2;
                }
                break;
            case 12:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // Looc.g:103:9: CSTE_ENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CSTE_ENT135=(Token)match(input,CSTE_ENT,FOLLOW_CSTE_ENT_in_atom669);
                    CSTE_ENT135_tree = (CommonTree)adaptor.create(CSTE_ENT135);
                    adaptor.addChild(root_0, CSTE_ENT135_tree);


                    }
                    break;
                case 2 :
                    // Looc.g:104:9: IDF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDF136=(Token)match(input,IDF,FOLLOW_IDF_in_atom680);
                    IDF136_tree = (CommonTree)adaptor.create(IDF136);
                    adaptor.addChild(root_0, IDF136_tree);


                    }
                    break;
                case 3 :
                    // Looc.g:105:8: '(' expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal137=(Token)match(input,12,FOLLOW_12_in_atom689);
                    char_literal137_tree = (CommonTree)adaptor.create(char_literal137);
                    adaptor.addChild(root_0, char_literal137_tree);

                    pushFollow(FOLLOW_expression_in_atom691);
                    expression138=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression138.getTree());
                    char_literal139=(Token)match(input,13,FOLLOW_13_in_atom693);
                    char_literal139_tree = (CommonTree)adaptor.create(char_literal139);
                    adaptor.addChild(root_0, char_literal139_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class comparaison_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comparaison"
    // Looc.g:107:1: comparaison : ( '<' strict | '>' strict | '==' | '!=' );
    public final LoocParser.comparaison_return comparaison() throws RecognitionException {
        LoocParser.comparaison_return retval = new LoocParser.comparaison_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal140=null;
        Token char_literal142=null;
        Token string_literal144=null;
        Token string_literal145=null;
        LoocParser.strict_return strict141 = null;

        LoocParser.strict_return strict143 = null;


        CommonTree char_literal140_tree=null;
        CommonTree char_literal142_tree=null;
        CommonTree string_literal144_tree=null;
        CommonTree string_literal145_tree=null;

        try {
            // Looc.g:107:12: ( '<' strict | '>' strict | '==' | '!=' )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt34=1;
                }
                break;
            case 46:
                {
                alt34=2;
                }
                break;
            case 47:
                {
                alt34=3;
                }
                break;
            case 48:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // Looc.g:107:14: '<' strict
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal140=(Token)match(input,45,FOLLOW_45_in_comparaison705);
                    char_literal140_tree = (CommonTree)adaptor.create(char_literal140);
                    adaptor.addChild(root_0, char_literal140_tree);

                    pushFollow(FOLLOW_strict_in_comparaison707);
                    strict141=strict();

                    state._fsp--;

                    adaptor.addChild(root_0, strict141.getTree());

                    }
                    break;
                case 2 :
                    // Looc.g:108:5: '>' strict
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal142=(Token)match(input,46,FOLLOW_46_in_comparaison713);
                    char_literal142_tree = (CommonTree)adaptor.create(char_literal142);
                    adaptor.addChild(root_0, char_literal142_tree);

                    pushFollow(FOLLOW_strict_in_comparaison715);
                    strict143=strict();

                    state._fsp--;

                    adaptor.addChild(root_0, strict143.getTree());

                    }
                    break;
                case 3 :
                    // Looc.g:109:5: '=='
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal144=(Token)match(input,47,FOLLOW_47_in_comparaison721);
                    string_literal144_tree = (CommonTree)adaptor.create(string_literal144);
                    adaptor.addChild(root_0, string_literal144_tree);


                    }
                    break;
                case 4 :
                    // Looc.g:110:5: '!='
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal145=(Token)match(input,48,FOLLOW_48_in_comparaison727);
                    string_literal145_tree = (CommonTree)adaptor.create(string_literal145);
                    adaptor.addChild(root_0, string_literal145_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "comparaison"

    public static class strict_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "strict"
    // Looc.g:112:1: strict : ( '=' | );
    public final LoocParser.strict_return strict() throws RecognitionException {
        LoocParser.strict_return retval = new LoocParser.strict_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal146=null;

        CommonTree char_literal146_tree=null;

        try {
            // Looc.g:112:7: ( '=' | )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==11) ) {
                alt35=1;
            }
            else if ( (LA35_0==IDF||LA35_0==CSTE_ENT||(LA35_0>=12 && LA35_0<=13)||LA35_0==16||LA35_0==22||LA35_0==25||(LA35_0>=30 && LA35_0<=31)||(LA35_0>=37 && LA35_0<=40)) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // Looc.g:112:10: '='
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal146=(Token)match(input,11,FOLLOW_11_in_strict737);
                    char_literal146_tree = (CommonTree)adaptor.create(char_literal146);
                    adaptor.addChild(root_0, char_literal146_tree);


                    }
                    break;
                case 2 :
                    // Looc.g:114:3:
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "strict"

    // Delegated rules




    public static final BitSet FOLLOW_class_decl_in_program34 = new BitSet(new long[]{0x0000001C91104220L});
    public static final BitSet FOLLOW_var_decl_in_program37 = new BitSet(new long[]{0x0000001C91104020L});
    public static final BitSet FOLLOW_instruction_in_program40 = new BitSet(new long[]{0x0000001C91104022L});
    public static final BitSet FOLLOW_9_in_class_decl53 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_CLASS_in_class_decl55 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_class_decl58 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_CLASS_in_class_decl60 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_class_decl64 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_class_decl66 = new BitSet(new long[]{0x0000000000086000L});
    public static final BitSet FOLLOW_class_item_decl_in_class_decl68 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_class_decl70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_class_item_decl84 = new BitSet(new long[]{0x0000000000084002L});
    public static final BitSet FOLLOW_method_decl_in_class_item_decl87 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14_in_var_decl102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_var_decl104 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_var_decl106 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_type_in_var_decl108 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_var_decl110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_method_decl144 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_method_decl146 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_method_decl148 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_method_args_in_method_decl150 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_13_in_method_decl153 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_method_decl_suite_in_method_decl156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_method_decl_suite169 = new BitSet(new long[]{0x0000001C91104020L});
    public static final BitSet FOLLOW_var_decl_in_method_decl_suite171 = new BitSet(new long[]{0x0000001C91104020L});
    public static final BitSet FOLLOW_instruction_in_method_decl_suite174 = new BitSet(new long[]{0x0000001C91304020L});
    public static final BitSet FOLLOW_21_in_method_decl_suite177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_method_decl_suite186 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_type_in_method_decl_suite188 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_method_decl_suite190 = new BitSet(new long[]{0x0000001C91104020L});
    public static final BitSet FOLLOW_var_decl_in_method_decl_suite192 = new BitSet(new long[]{0x0000001C91104020L});
    public static final BitSet FOLLOW_instruction_in_method_decl_suite195 = new BitSet(new long[]{0x0000001C91304020L});
    public static final BitSet FOLLOW_21_in_method_decl_suite198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_method_args211 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_method_args213 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_type_in_method_args215 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_method_args218 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_method_args220 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_method_args222 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_type_in_method_args224 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_IDF_in_instruction239 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_instruction241 = new BitSet(new long[]{0x000001E0000110A0L});
    public static final BitSet FOLLOW_expression_in_instruction243 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_instruction245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_instruction251 = new BitSet(new long[]{0x000001E0020010A0L});
    public static final BitSet FOLLOW_expression_in_instruction253 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_instruction255 = new BitSet(new long[]{0x0000001C91104020L});
    public static final BitSet FOLLOW_instruction_in_instruction258 = new BitSet(new long[]{0x0000001C9D104020L});
    public static final BitSet FOLLOW_26_in_instruction262 = new BitSet(new long[]{0x0000001C91104020L});
    public static final BitSet FOLLOW_instruction_in_instruction264 = new BitSet(new long[]{0x0000001C99104020L});
    public static final BitSet FOLLOW_27_in_instruction268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_instruction274 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_instruction276 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_instruction278 = new BitSet(new long[]{0x000001E0400010A0L});
    public static final BitSet FOLLOW_expression_in_instruction280 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_instruction282 = new BitSet(new long[]{0x000001E0800010A0L});
    public static final BitSet FOLLOW_expression_in_instruction284 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_instruction287 = new BitSet(new long[]{0x0000001C91104020L});
    public static final BitSet FOLLOW_instruction_in_instruction289 = new BitSet(new long[]{0x0000001D91104020L});
    public static final BitSet FOLLOW_32_in_instruction292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_instruction299 = new BitSet(new long[]{0x0000001C91104020L});
    public static final BitSet FOLLOW_var_decl_in_instruction302 = new BitSet(new long[]{0x0000001C91104020L});
    public static final BitSet FOLLOW_instruction_in_instruction305 = new BitSet(new long[]{0x0000001C91304020L});
    public static final BitSet FOLLOW_21_in_instruction309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_instruction316 = new BitSet(new long[]{0x0000006000000020L});
    public static final BitSet FOLLOW_expression_start_in_instruction318 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_instruction320 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_instruction322 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_instruction324 = new BitSet(new long[]{0x000001E0004030A0L});
    public static final BitSet FOLLOW_expression_in_instruction325 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_22_in_instruction328 = new BitSet(new long[]{0x000001E0004030A0L});
    public static final BitSet FOLLOW_expression_in_instruction330 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_13_in_instruction334 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_instruction336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_print_in_instruction343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retour_in_instruction355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_print372 = new BitSet(new long[]{0x000001E0000010E0L});
    public static final BitSet FOLLOW_print_suite_in_print374 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_print376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_print_suite386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_CHAINE_in_print_suite393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_read404 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_read406 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_read408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_retour420 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_retour422 = new BitSet(new long[]{0x000001E0000030A0L});
    public static final BitSet FOLLOW_expression_in_retour424 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_retour426 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_retour428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expression_start0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_expression468 = new BitSet(new long[]{0x000001E0000030A0L});
    public static final BitSet FOLLOW_expression_in_expression470 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_expression472 = new BitSet(new long[]{0x0001FE8200000000L});
    public static final BitSet FOLLOW_expression_suite_in_expression474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_expression480 = new BitSet(new long[]{0x0001FE8200000000L});
    public static final BitSet FOLLOW_expression_suite_in_expression482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_expression488 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CSTE_ENT_in_expression490 = new BitSet(new long[]{0x0001FE8200000000L});
    public static final BitSet FOLLOW_expression_suite_in_expression492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_expression498 = new BitSet(new long[]{0x0001FE8200000000L});
    public static final BitSet FOLLOW_expression_suite_in_expression500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_expression506 = new BitSet(new long[]{0x0001FE8200000000L});
    public static final BitSet FOLLOW_expression_suite_in_expression508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CSTE_ENT_in_expression514 = new BitSet(new long[]{0x0001FE8200000000L});
    public static final BitSet FOLLOW_expression_suite_in_expression516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_expression522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDF_CLASS_in_expression524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_expression_suite542 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDF_in_expression_suite544 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_expression_suite546 = new BitSet(new long[]{0x000001E0004030A0L});
    public static final BitSet FOLLOW_expression_in_expression_suite548 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_22_in_expression_suite551 = new BitSet(new long[]{0x000001E0004030A0L});
    public static final BitSet FOLLOW_expression_in_expression_suite553 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_13_in_expression_suite557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multOper_in_expression_suite563 = new BitSet(new long[]{0x00001E8000000002L});
    public static final BitSet FOLLOW_oper_in_expression_suite566 = new BitSet(new long[]{0x0000108000000002L});
    public static final BitSet FOLLOW_oper_in_expression_suite573 = new BitSet(new long[]{0x0000108000000002L});
    public static final BitSet FOLLOW_comparaison_in_expression_suite580 = new BitSet(new long[]{0x000001E0000010A0L});
    public static final BitSet FOLLOW_expression_in_expression_suite582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_multOper600 = new BitSet(new long[]{0x00000000000010A0L});
    public static final BitSet FOLLOW_atom_in_multOper602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_multOper608 = new BitSet(new long[]{0x00000000000010A0L});
    public static final BitSet FOLLOW_atom_in_multOper611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_multOper618 = new BitSet(new long[]{0x00000000000010A0L});
    public static final BitSet FOLLOW_atom_in_multOper621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_oper634 = new BitSet(new long[]{0x00000000000010A0L});
    public static final BitSet FOLLOW_atom_in_oper636 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_multOper_in_oper638 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_39_in_oper645 = new BitSet(new long[]{0x00000000000010A0L});
    public static final BitSet FOLLOW_atom_in_oper647 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_multOper_in_oper649 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_CSTE_ENT_in_atom669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDF_in_atom680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_atom689 = new BitSet(new long[]{0x000001E0000030A0L});
    public static final BitSet FOLLOW_expression_in_atom691 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_atom693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_comparaison705 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_strict_in_comparaison707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_comparaison713 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_strict_in_comparaison715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_comparaison721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_comparaison727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_strict737 = new BitSet(new long[]{0x0000000000000002L});

}
