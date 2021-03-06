/**
 * generated by Xtext 2.10.0
 */
package pucrs.lp.turtle.turtle.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pucrs.lp.turtle.turtle.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TurtleFactoryImpl extends EFactoryImpl implements TurtleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TurtleFactory init()
  {
    try
    {
      TurtleFactory theTurtleFactory = (TurtleFactory)EPackage.Registry.INSTANCE.getEFactory(TurtlePackage.eNS_URI);
      if (theTurtleFactory != null)
      {
        return theTurtleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TurtleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurtleFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TurtlePackage.MODEL: return createModel();
      case TurtlePackage.COMMAND: return createCommand();
      case TurtlePackage.FOWARD: return createFoward();
      case TurtlePackage.ROTATE: return createRotate();
      case TurtlePackage.REPEAT: return createRepeat();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Foward createFoward()
  {
    FowardImpl foward = new FowardImpl();
    return foward;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rotate createRotate()
  {
    RotateImpl rotate = new RotateImpl();
    return rotate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Repeat createRepeat()
  {
    RepeatImpl repeat = new RepeatImpl();
    return repeat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TurtlePackage getTurtlePackage()
  {
    return (TurtlePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TurtlePackage getPackage()
  {
    return TurtlePackage.eINSTANCE;
  }

} //TurtleFactoryImpl
