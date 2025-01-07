package model;

import javafx.scene.control.TextField;

public class Operacional {
	private String desc;
	private double days;
	private double hoursPerDay;
	private double operacionalCost;
	private double operatorValue;

	
	
	public Operacional (TextField txtDescOperacional, 
						TextField txtDaysOfWork,
						TextField txtHoursPerDay,
						TextField txtOperacionalCosts,
						TextField txtOperatorValue
						) {
		
		this.desc = txtDescOperacional.getText();;
		this.days = Double.parseDouble(txtDaysOfWork.getText());
		this.hoursPerDay = Double.parseDouble(txtHoursPerDay.getText());
		this.operacionalCost = Double.parseDouble(txtOperacionalCosts.getText());
		this.operatorValue = Double.parseDouble(txtOperatorValue.getText());
	}
	public Operacional(String desc, double days,
						double hoursPerDay , double operacionalCost , double operatorValue) {
		super();
		this.desc =  desc;
		this.days = days;
		this.hoursPerDay = hoursPerDay;
		this.operacionalCost = operacionalCost;
		this.operatorValue = operatorValue;
		
	}
	
    //getters and setters
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getDays() {
		return days;
	}
	public void setDays(double days) {
		this.days = days;
	}
	public double getHoursPerDay() {
		return hoursPerDay;
	}
	public void setHoursPerDay(double hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
	}
	public double getOperacionalCost() {
		return operacionalCost;
	}
	public void setOperacionalCost(double operacionalCost) {
		this.operacionalCost = operacionalCost;
	}
	public double getOperatorValue() {
		return operatorValue;
	}
	public void setOperatorValue(double operatorValue) {
		this.operatorValue = operatorValue;
	}
	
	
	
	


	

	
}
