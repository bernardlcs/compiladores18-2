/*
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.pascal.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.pascal.PascalRuntimeModule
import org.xtext.example.pascal.PascalStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class PascalIdeSetup extends PascalStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new PascalRuntimeModule, new PascalIdeModule))
	}
	
}
