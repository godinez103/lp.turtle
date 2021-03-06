/*
 * generated by Xtext 2.10.0
 */
package pucrs.lp.turtle.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class TurtleGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "pucrs.lp.turtle.Turtle.Model");
		private final Assignment cCommandsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cCommandsCommandParserRuleCall_0 = (RuleCall)cCommandsAssignment.eContents().get(0);
		
		//Model:
		//	commands+=Command*;
		@Override public ParserRule getRule() { return rule; }
		
		//commands+=Command*
		public Assignment getCommandsAssignment() { return cCommandsAssignment; }
		
		//Command
		public RuleCall getCommandsCommandParserRuleCall_0() { return cCommandsCommandParserRuleCall_0; }
	}
	public class CommandElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "pucrs.lp.turtle.Turtle.Command");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFowardParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRotateParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cRepeatParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Command:
		//	Foward | Rotate | Repeat;
		@Override public ParserRule getRule() { return rule; }
		
		//Foward | Rotate | Repeat
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Foward
		public RuleCall getFowardParserRuleCall_0() { return cFowardParserRuleCall_0; }
		
		//Rotate
		public RuleCall getRotateParserRuleCall_1() { return cRotateParserRuleCall_1; }
		
		//Repeat
		public RuleCall getRepeatParserRuleCall_2() { return cRepeatParserRuleCall_2; }
	}
	public class FowardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "pucrs.lp.turtle.Turtle.Foward");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFdKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Foward:
		//	'fd' value=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'fd' value=INT
		public Group getGroup() { return cGroup; }
		
		//'fd'
		public Keyword getFdKeyword_0() { return cFdKeyword_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
	}
	public class RotateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "pucrs.lp.turtle.Turtle.Rotate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Rotate:
		//	'rt' value=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'rt' value=INT
		public Group getGroup() { return cGroup; }
		
		//'rt'
		public Keyword getRtKeyword_0() { return cRtKeyword_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
	}
	public class RepeatElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "pucrs.lp.turtle.Turtle.Repeat");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRepeatKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCommandsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCommandsModelParserRuleCall_3_0 = (RuleCall)cCommandsAssignment_3.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Repeat:
		//	'repeat' value=INT '[' commands+=Model ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'repeat' value=INT '[' commands+=Model ']'
		public Group getGroup() { return cGroup; }
		
		//'repeat'
		public Keyword getRepeatKeyword_0() { return cRepeatKeyword_0; }
		
		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }
		
		//commands+=Model
		public Assignment getCommandsAssignment_3() { return cCommandsAssignment_3; }
		
		//Model
		public RuleCall getCommandsModelParserRuleCall_3_0() { return cCommandsModelParserRuleCall_3_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
	}
	
	
	private final ModelElements pModel;
	private final CommandElements pCommand;
	private final FowardElements pFoward;
	private final RotateElements pRotate;
	private final RepeatElements pRepeat;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TurtleGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pCommand = new CommandElements();
		this.pFoward = new FowardElements();
		this.pRotate = new RotateElements();
		this.pRepeat = new RepeatElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("pucrs.lp.turtle.Turtle".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	commands+=Command*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Command:
	//	Foward | Rotate | Repeat;
	public CommandElements getCommandAccess() {
		return pCommand;
	}
	
	public ParserRule getCommandRule() {
		return getCommandAccess().getRule();
	}
	
	//Foward:
	//	'fd' value=INT;
	public FowardElements getFowardAccess() {
		return pFoward;
	}
	
	public ParserRule getFowardRule() {
		return getFowardAccess().getRule();
	}
	
	//Rotate:
	//	'rt' value=INT;
	public RotateElements getRotateAccess() {
		return pRotate;
	}
	
	public ParserRule getRotateRule() {
		return getRotateAccess().getRule();
	}
	
	//Repeat:
	//	'repeat' value=INT '[' commands+=Model ']';
	public RepeatElements getRepeatAccess() {
		return pRepeat;
	}
	
	public ParserRule getRepeatRule() {
		return getRepeatAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
