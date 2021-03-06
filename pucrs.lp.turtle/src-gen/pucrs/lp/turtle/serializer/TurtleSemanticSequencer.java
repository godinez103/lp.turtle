/*
 * generated by Xtext 2.10.0
 */
package pucrs.lp.turtle.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import pucrs.lp.turtle.services.TurtleGrammarAccess;
import pucrs.lp.turtle.turtle.Foward;
import pucrs.lp.turtle.turtle.Model;
import pucrs.lp.turtle.turtle.Repeat;
import pucrs.lp.turtle.turtle.Rotate;
import pucrs.lp.turtle.turtle.TurtlePackage;

@SuppressWarnings("all")
public class TurtleSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TurtleGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TurtlePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TurtlePackage.FOWARD:
				sequence_Foward(context, (Foward) semanticObject); 
				return; 
			case TurtlePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case TurtlePackage.REPEAT:
				sequence_Repeat(context, (Repeat) semanticObject); 
				return; 
			case TurtlePackage.ROTATE:
				sequence_Rotate(context, (Rotate) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Command returns Foward
	 *     Foward returns Foward
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Foward(ISerializationContext context, Foward semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TurtlePackage.Literals.COMMAND__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurtlePackage.Literals.COMMAND__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFowardAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     commands+=Command+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Repeat
	 *     Repeat returns Repeat
	 *
	 * Constraint:
	 *     (value=INT commands+=Model)
	 */
	protected void sequence_Repeat(ISerializationContext context, Repeat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Command returns Rotate
	 *     Rotate returns Rotate
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Rotate(ISerializationContext context, Rotate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TurtlePackage.Literals.COMMAND__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TurtlePackage.Literals.COMMAND__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRotateAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
