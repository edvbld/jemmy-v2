/*
 * Copyright (c) 1997, 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.netbeans.jemmy.operators;

import static org.testng.Assert.assertEquals;

import java.awt.Component;

import org.netbeans.jemmy.ComponentChooser;
import org.testng.annotations.Test;

public class ComponentChooserTest {

    @Test
    public void testGetDescription() {
        String testString = "toString";
        ComponentChooser componentChooser = new ComponentChooser() {

            @Override
            public boolean checkComponent(Component comp) {
                return false;
            }

            @Override
            public String toString() {
                return testString;
            }
        };
        assertEquals(componentChooser.getDescription(), testString,
                "Default value of getDescription() is not equal to return value of toString()");
    }
}