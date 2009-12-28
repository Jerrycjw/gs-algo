/*
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place - Suite 330, Boston, MA 02111-1307, USA.
 */

package org.graphstream.algorithm;

/**
 * Base for algorithms that can compute and maintain a property on a dynamic
 * graph, during its evolution.
 *
 * <p>
 * This is the same as the {@link org.graphstream.algorithm.Algorithm}
 * interface, with the addition of methods to make the algorithm dynamic. The
 * algorithm begins with a call to the {@link #init(org.graphstream.graph.Graph)}
 * method and ends with a call to the {@link #terminate()} method. In between, the
 * user must call {@link #compute()} in a loop, as long as the graph evolves.
 * </p>
 */
public interface DynamicAlgorithm extends Algorithm
{
	/**
	 * End an algorithm.
	 * @see #init(org.graphstream.graph.Graph)
	 */
	void terminate();
}