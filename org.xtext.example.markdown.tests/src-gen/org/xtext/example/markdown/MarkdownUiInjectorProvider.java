/*
 * generated by Xtext
 */
package org.xtext.example.markdown;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class MarkdownUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.xtext.example.markdown.ui.internal.MarkdownActivator.getInstance().getInjector("org.xtext.example.markdown.Markdown");
	}
	
}