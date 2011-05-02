/*******************************************************************************
 * Copyright (c) 2011 Dipanjan Das 
 * Language Technologies Institute, 
 * Carnegie Mellon University, 
 * All Rights Reserved.
 * 
 * IdentificationModel.java is part of SEMAFOR 2.0.
 * 
 * SEMAFOR 2.0 is free software: you can redistribute it and/or modify  it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or 
 * (at your option) any later version.
 * 
 * SEMAFOR 2.0 is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details. 
 * 
 * You should have received a copy of the GNU General Public License along
 * with SEMAFOR 2.0.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package edu.cmu.cs.lti.ark.fn.identification;

import java.io.Serializable;

import edu.cmu.cs.lti.ark.util.optimization.Alphabet;
import edu.cmu.cs.lti.ark.util.optimization.LDouble;
import gnu.trove.THashMap;


public class IdentificationModel implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3073796529341340548L;
	private Alphabet A;
	private THashMap<String,LDouble> paramMap;
	
	public IdentificationModel(Alphabet a, THashMap<String,LDouble> map)
	{
		A = a;
		paramMap = map;
	}
	
	public Alphabet getAlphabet()
	{
		return A;
	}
	
	public THashMap<String,LDouble> getParamMap()
	{
		return paramMap;
	}
	
	
}

