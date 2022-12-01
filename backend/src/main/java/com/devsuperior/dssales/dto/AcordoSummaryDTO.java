package com.devsuperior.dssales.dto;

import java.io.Serializable;

public class AcordoSummaryDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Double sum;
	private Long count;
	
	public AcordoSummaryDTO() {
	}

	public AcordoSummaryDTO(Double sum, Long count) {
		super();
		this.sum = sum;
		this.count = count;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}
}
