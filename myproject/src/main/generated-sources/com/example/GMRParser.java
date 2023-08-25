// Generated from com/example/GMR.g4 by ANTLR 4.1
package com.example;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GMRParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, NOT=3, AND=4, OR=5, IMPLIES=6, IFF=7, VARIABLE=8, 
		WS=9;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'!'", "'&'", "'|'", "'->'", "'<->'", "VARIABLE", 
		"WS"
	};
	public static final int
		RULE_expression = 0, RULE_iff_expression = 1, RULE_implies_expression = 2, 
		RULE_or_expression = 3, RULE_and_expression = 4, RULE_unary_expression = 5, 
		RULE_primary_expression = 6;
	public static final String[] ruleNames = {
		"expression", "iff_expression", "implies_expression", "or_expression", 
		"and_expression", "unary_expression", "primary_expression"
	};

	@Override
	public String getGrammarFileName() { return "GMR.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GMRParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpressionContext extends ParserRuleContext {
		public Iff_expressionContext iff_expression() {
			return getRuleContext(Iff_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMRListener ) ((GMRListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMRListener ) ((GMRListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMRVisitor ) return ((GMRVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); iff_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Iff_expressionContext extends ParserRuleContext {
		public Iff_expressionContext iff_expression() {
			return getRuleContext(Iff_expressionContext.class,0);
		}
		public Implies_expressionContext implies_expression() {
			return getRuleContext(Implies_expressionContext.class,0);
		}
		public TerminalNode IFF() { return getToken(GMRParser.IFF, 0); }
		public Iff_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iff_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMRListener ) ((GMRListener)listener).enterIff_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMRListener ) ((GMRListener)listener).exitIff_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMRVisitor ) return ((GMRVisitor<? extends T>)visitor).visitIff_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iff_expressionContext iff_expression() throws RecognitionException {
		Iff_expressionContext _localctx = new Iff_expressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_iff_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); implies_expression();
			setState(19);
			_la = _input.LA(1);
			if (_la==IFF) {
				{
				setState(17); match(IFF);
				setState(18); iff_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Implies_expressionContext extends ParserRuleContext {
		public Implies_expressionContext implies_expression() {
			return getRuleContext(Implies_expressionContext.class,0);
		}
		public TerminalNode IMPLIES() { return getToken(GMRParser.IMPLIES, 0); }
		public Or_expressionContext or_expression() {
			return getRuleContext(Or_expressionContext.class,0);
		}
		public Implies_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implies_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMRListener ) ((GMRListener)listener).enterImplies_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMRListener ) ((GMRListener)listener).exitImplies_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMRVisitor ) return ((GMRVisitor<? extends T>)visitor).visitImplies_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Implies_expressionContext implies_expression() throws RecognitionException {
		Implies_expressionContext _localctx = new Implies_expressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_implies_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); or_expression();
			setState(24);
			_la = _input.LA(1);
			if (_la==IMPLIES) {
				{
				setState(22); match(IMPLIES);
				setState(23); implies_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Or_expressionContext extends ParserRuleContext {
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(GMRParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GMRParser.OR, i);
		}
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public Or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMRListener ) ((GMRListener)listener).enterOr_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMRListener ) ((GMRListener)listener).exitOr_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMRVisitor ) return ((GMRVisitor<? extends T>)visitor).visitOr_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_expressionContext or_expression() throws RecognitionException {
		Or_expressionContext _localctx = new Or_expressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); and_expression();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(27); match(OR);
				setState(28); and_expression();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_expressionContext extends ParserRuleContext {
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public TerminalNode AND(int i) {
			return getToken(GMRParser.AND, i);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(GMRParser.AND); }
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMRListener ) ((GMRListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMRListener ) ((GMRListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMRVisitor ) return ((GMRVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); unary_expression();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(35); match(AND);
				setState(36); unary_expression();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(GMRParser.NOT, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMRListener ) ((GMRListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMRListener ) ((GMRListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMRVisitor ) return ((GMRVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unary_expression);
		try {
			setState(45);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); match(NOT);
				setState(43); unary_expression();
				}
				break;
			case LPAREN:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); primary_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(GMRParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(GMRParser.RPAREN, 0); }
		public TerminalNode VARIABLE() { return getToken(GMRParser.VARIABLE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GMRListener ) ((GMRListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GMRListener ) ((GMRListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GMRVisitor ) return ((GMRVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primary_expression);
		try {
			setState(52);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(47); match(LPAREN);
				setState(48); expression();
				setState(49); match(RPAREN);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(51); match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\139\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\5\3\26"+
		"\n\3\3\4\3\4\3\4\5\4\33\n\4\3\5\3\5\3\5\7\5 \n\5\f\5\16\5#\13\5\3\6\3"+
		"\6\3\6\7\6(\n\6\f\6\16\6+\13\6\3\7\3\7\3\7\5\7\60\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\67\n\b\3\b\2\t\2\4\6\b\n\f\16\2\2\67\2\20\3\2\2\2\4\22\3\2\2"+
		"\2\6\27\3\2\2\2\b\34\3\2\2\2\n$\3\2\2\2\f/\3\2\2\2\16\66\3\2\2\2\20\21"+
		"\5\4\3\2\21\3\3\2\2\2\22\25\5\6\4\2\23\24\7\t\2\2\24\26\5\4\3\2\25\23"+
		"\3\2\2\2\25\26\3\2\2\2\26\5\3\2\2\2\27\32\5\b\5\2\30\31\7\b\2\2\31\33"+
		"\5\6\4\2\32\30\3\2\2\2\32\33\3\2\2\2\33\7\3\2\2\2\34!\5\n\6\2\35\36\7"+
		"\7\2\2\36 \5\n\6\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\t"+
		"\3\2\2\2#!\3\2\2\2$)\5\f\7\2%&\7\6\2\2&(\5\f\7\2\'%\3\2\2\2(+\3\2\2\2"+
		")\'\3\2\2\2)*\3\2\2\2*\13\3\2\2\2+)\3\2\2\2,-\7\5\2\2-\60\5\f\7\2.\60"+
		"\5\16\b\2/,\3\2\2\2/.\3\2\2\2\60\r\3\2\2\2\61\62\7\3\2\2\62\63\5\2\2\2"+
		"\63\64\7\4\2\2\64\67\3\2\2\2\65\67\7\n\2\2\66\61\3\2\2\2\66\65\3\2\2\2"+
		"\67\17\3\2\2\2\b\25\32!)/\66";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}