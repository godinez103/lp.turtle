/*
 * generated by Xtext 2.10.0
 */
package pucrs.lp.turtle.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import pucrs.lp.turtle.ui.internal.TurtleActivator;

public class TurtleUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return TurtleActivator.getInstance().getInjector("pucrs.lp.turtle.Turtle");
	}

}
