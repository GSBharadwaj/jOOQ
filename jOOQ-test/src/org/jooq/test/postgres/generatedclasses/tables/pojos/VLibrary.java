/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VLibrary implements java.io.Serializable {

	private static final long serialVersionUID = -1781083161;

	private final java.lang.String author;
	private final java.lang.String title;

	public VLibrary(
		java.lang.String author,
		java.lang.String title
	) {
		this.author = author;
		this.title = title;
	}

	public java.lang.String getAuthor() {
		return this.author;
	}

	public java.lang.String getTitle() {
		return this.title;
	}
}
