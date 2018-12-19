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
@Table(name = "tbl_ref_city")
public class RefCity implements Serializable {
	private static final long serialVersionUID = 8761414572595253384L;
	private Integer id;
	private String name;
	private RefCountry countryId;
	private Integer Status;

	public RefCity() {
		super();

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",nullable = false, unique = true)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id")
	public RefCountry getCountryId() {
		return countryId;
	}

	public void setCountryId(RefCountry countryId) {
		this.countryId = countryId;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return Status;
	}

	public void setStatus(Integer status) {
		Status = status;
	}

}
