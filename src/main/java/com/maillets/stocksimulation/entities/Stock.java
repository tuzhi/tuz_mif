package com.maillets.stocksimulation.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(nullable = false)
	private String symbol;
	@Column
	private String exchange;
	@Column(nullable = false)
	private String name;
	@Column(name = "MARKETCAP")
	private double marketCap;
	@Column
	private String ipoYear;
	@Column
	private String sector;
	@Column
	private String industry;

	@ManyToMany(mappedBy = "stocks")
	private Set<WatchList> watchLists = new HashSet<>();

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "stock")
	private StockProfile stockProfile;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(double marketCap) {
		this.marketCap = marketCap;
	}

	public String getIpoYear() {
		return ipoYear;
	}

	public void setIpoYear(String ipoYear) {
		this.ipoYear = ipoYear;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public Set<WatchList> getWatchLists() {
		return watchLists;
	}

	public void setWatchLists(Set<WatchList> watchLists) {
		this.watchLists = watchLists;
	}

	public StockProfile getStockProfile() {
		return stockProfile;
	}

	public void setStockProfile(StockProfile stockProfile) {
		this.stockProfile = stockProfile;
	}
}
