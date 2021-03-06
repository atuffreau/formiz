/**
 *  Copyright SCN Guichet Entreprises, Capgemini and contributors (2014-2016)
 *
 * This software is a computer program whose purpose is to [describe
 * functionalities and technical features of your software].
 *
 * This software is governed by the CeCILL  license under French law and
 * abiding by the rules of distribution of free software.  You can  use,
 * modify and/ or redistribute the software under the terms of the CeCILL
 * license as circulated by CEA, CNRS and INRIA at the following URL
 * "http://www.cecill.info".
 *
 * As a counterpart to the access to the source code and  rights to copy,
 * modify and redistribute granted by the license, users are provided only
 * with a limited warranty  and the software's author,  the holder of the
 * economic rights,  and the successive licensors  have only  limited
 * liability.
 *
 * In this respect, the user's attention is drawn to the risks associated
 * with loading,  using,  modifying and/or developing or reproducing the
 * software by the user in light of its specific status of free software,
 * that may mean  that it is complicated to manipulate,  and  that  also
 * therefore means  that it is reserved for developers  and  experienced
 * professionals having in-depth computer knowledge. Users are therefore
 * encouraged to load and test the software's suitability as regards their
 * requirements in conditions enabling the security of their systems and/or
 * data to be ensured and,  more generally, to use and operate it in the
 * same conditions as regards security.
 *
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL license and that you accept its terms.
 */
package org.formiz.core;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * A very basic Formiz element.
 *
 * <p>
 * This class should be extended to provide additional attributes.
 *
 */
public abstract class SimpleElement {

	protected final String group;
	protected final String id;
	private FormizMetadata parent;

	/**
	 * Constructor for SimpleElement.
	 *
	 * @param parent
	 *            Target {@link FormizMetadata} instance.
	 * @param id
	 *            element id.
	 * @param group
	 *            element group id.
	 */
	public SimpleElement(FormizMetadata parent, String id, String group) {
		this.group = group;
		this.id = id;
		this.setParent(parent);
	}

	/**
	 * Get element group.
	 * <p>
	 * Group is similar to maven's artifact groups.
	 *
	 * @return group id.
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * Get element id.
	 * <p>
	 * Id is similar to maven's artifact artifactId.
	 *
	 * @return element id.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Get parent {@link FormizMetadata} instance.
	 *
	 * @return parent {@link FormizMetadata} instance.
	 */
	public FormizMetadata getParent() {
		return parent;
	}

	/**
	 * Set parent {@link FormizMetadata} instance.
	 *
	 * @param parent
	 *            {@link FormizMetadata} instance.
	 */
	public void setParent(FormizMetadata parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
