/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VAuthor implements java.io.Serializable {

	private static final long serialVersionUID = -908703121;

	private final java.lang.Integer                                                      id;
	private final java.lang.String                                                       firstName;
	private final java.lang.String                                                       lastName;
	private final java.sql.Date                                                          dateOfBirth;
	private final java.lang.Integer                                                      yearOfBirth;
	private final org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord address;

	public VAuthor(
		java.lang.Integer                                                      id,
		java.lang.String                                                       firstName,
		java.lang.String                                                       lastName,
		java.sql.Date                                                          dateOfBirth,
		java.lang.Integer                                                      yearOfBirth,
		org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord address
	) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public java.lang.String getLastName() {
		return this.lastName;
	}

	public java.sql.Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public java.lang.Integer getYearOfBirth() {
		return this.yearOfBirth;
	}

	public org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord getAddress() {
		return this.address;
	}
}
