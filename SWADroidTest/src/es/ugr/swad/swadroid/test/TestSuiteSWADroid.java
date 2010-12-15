/*
 *  This file is part of SWADroid.
 *
 *  Copyright (C) 2010 Juan Miguel Boyero Corral <juanmi1982@gmail.com>
 *
 *  SWADroid is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  SWADroid is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with SWADroid.  If not, see <http://www.gnu.org/licenses/>.
 */

package es.ugr.swad.swadroid.test;

import junit.framework.TestSuite;

/**
 * @author Juan Miguel Boyero Corral <juanmi1982@gmail.com>
 *
 */
public class TestSuiteSWADroid extends TestSuite {
	public static TestSuite suite() {
		TestSuite suite = new TestSuite(TestSuiteSWADroid.class.getName());

		suite.addTestSuite(DataBaseHelperTest.class);

		return suite;
	}
}