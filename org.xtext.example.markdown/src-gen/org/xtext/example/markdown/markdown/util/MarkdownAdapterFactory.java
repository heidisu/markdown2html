/**
 */
package org.xtext.example.markdown.markdown.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.markdown.markdown.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.markdown.markdown.MarkdownPackage
 * @generated
 */
public class MarkdownAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MarkdownPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MarkdownAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MarkdownPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MarkdownSwitch<Adapter> modelSwitch =
    new MarkdownSwitch<Adapter>()
    {
      @Override
      public Adapter caseMarkdown(Markdown object)
      {
        return createMarkdownAdapter();
      }
      @Override
      public Adapter caseContent(Content object)
      {
        return createContentAdapter();
      }
      @Override
      public Adapter caseTextBlock(TextBlock object)
      {
        return createTextBlockAdapter();
      }
      @Override
      public Adapter caseHeader1(Header1 object)
      {
        return createHeader1Adapter();
      }
      @Override
      public Adapter caseHeader2(Header2 object)
      {
        return createHeader2Adapter();
      }
      @Override
      public Adapter casePlainText(PlainText object)
      {
        return createPlainTextAdapter();
      }
      @Override
      public Adapter caseItalic(Italic object)
      {
        return createItalicAdapter();
      }
      @Override
      public Adapter caseBold(Bold object)
      {
        return createBoldAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.markdown.markdown.Markdown <em>Markdown</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.markdown.markdown.Markdown
   * @generated
   */
  public Adapter createMarkdownAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.markdown.markdown.Content <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.markdown.markdown.Content
   * @generated
   */
  public Adapter createContentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.markdown.markdown.TextBlock <em>Text Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.markdown.markdown.TextBlock
   * @generated
   */
  public Adapter createTextBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.markdown.markdown.Header1 <em>Header1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.markdown.markdown.Header1
   * @generated
   */
  public Adapter createHeader1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.markdown.markdown.Header2 <em>Header2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.markdown.markdown.Header2
   * @generated
   */
  public Adapter createHeader2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.markdown.markdown.PlainText <em>Plain Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.markdown.markdown.PlainText
   * @generated
   */
  public Adapter createPlainTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.markdown.markdown.Italic <em>Italic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.markdown.markdown.Italic
   * @generated
   */
  public Adapter createItalicAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.markdown.markdown.Bold <em>Bold</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.markdown.markdown.Bold
   * @generated
   */
  public Adapter createBoldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MarkdownAdapterFactory
