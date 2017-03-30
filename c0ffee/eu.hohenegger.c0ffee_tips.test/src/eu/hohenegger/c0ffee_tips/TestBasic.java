/*******************************************************************************
 * Copyright (c) 2012 Max Hohenegger.
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Max Hohenegger - initial implementation
 ******************************************************************************/
package eu.hohenegger.c0ffee_tips;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import eu.hohenegger.c0ffee_tips.ConverterUtil;

public class TestBasic {
	@Before
	public void init() throws Exception {
	}

	@Test
	public void testConvert() throws Exception {
		assertEquals(String.format("%d", 0xc0ffee), ConverterUtil.convert2dec("0xc0ffee"));
		assertEquals("0xc0ffee", ConverterUtil.convert2dec(String.format("%d", 0xc0ffee)));
	}

	@After
	public void tearDown() throws Exception {
	}
}