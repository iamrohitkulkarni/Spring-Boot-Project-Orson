package com.orson.springframework.reference.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Rohit Kulkarni. 19-Dec-2018 Projectorson
 *
 */
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "tbl_address")
public class RefAddress implements Serializable {
	private static final long serialVersionUID = 132881518388835543L;
	private Integer id;
	private Integer type;
	private String street1;
	private String street2;
	private String zip;
	private RefCity cityId;
	private RefCountry countryId;
	private String phone;

	public RefAddress() {
		super();

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "type")
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name = "street")
	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	@Column(name = "street2")
	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	@Column(name = "zip")
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_id")
	public RefCity getCityId() {
		return cityId;
	}

	public void setCityId(RefCity cityId) {
		this.cityId = cityId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id")
	public RefCountry getCountryId() {
		return countryId;
	}

	public void setCountryId(RefCountry countryId) {
		this.countryId = countryId;
	}

	@Column(name = "phone")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
