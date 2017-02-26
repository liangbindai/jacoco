/*******************************************************************************
 * Copyright (c) 2009, 2017 Mountainminds GmbH & Co. KG and Contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Evgeny Mandrikov - initial API and implementation
 *
 *******************************************************************************/
package org.jacoco.core.test.validation.targets;

public enum EnumImplicitMethods { // $line-classdef$

	CONST(Stubs.f() ? new Object() : new Object()); // $line-const$

	static {
	} // $line-staticblock$

	/**
	 * Unlike in {@link Target07 regular classes}, even if enum has explicit
	 * constructor, {@code clinit} method in any case has a reference to the
	 * line of class definition.
	 */
	EnumImplicitMethods(Object o) { // $line-super$
	} // $line-constructor$

	/**
	 * This method should not be excluded from analysis unlike implicitly
	 * created {@link #valueOf(String)} and {@link #values()} methods that refer
	 * to the line of class definition.
	 */
	public void valueOf() {
	} // $line-customValueOfMethod$

	public static void main(String[] args) {
	}

}
