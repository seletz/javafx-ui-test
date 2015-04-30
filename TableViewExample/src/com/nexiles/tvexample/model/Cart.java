package com.nexiles.tvexample.model;
import java.time.LocalDate;

import javafx.beans.property.BooleanProperty;
// import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
// import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Cart {
	private final StringProperty id;
	private final StringProperty name;
	private final StringProperty number;
	private final StringProperty cadname;
	private final BooleanProperty copy;
	private final StringProperty type;
	private final StringProperty datasheet;
	private final StringProperty imageURL;
	private final ObjectProperty<LocalDate> created;
	
	public Cart() {
		this(null, null, null, null);
	}
	
	public Cart(String id, String number, String name, String cadname) {
		this.id = new SimpleStringProperty(id);
		this.name = new SimpleStringProperty(name);
		this.number = new SimpleStringProperty(number);
		this.cadname = new SimpleStringProperty(cadname);
		
		this.copy = null;
		
		//this.copy = new BooleanProperty();
		this.type = new SimpleStringProperty("model");
		this.datasheet = new SimpleStringProperty("");
		this.imageURL = new SimpleStringProperty("");
		this.created =  new SimpleObjectProperty<LocalDate>(LocalDate.of(1973, 4, 29));
		
	}

	/**
	 * @return the id
	 */
	public StringProperty getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public StringProperty getName() {
		return name;
	}

	/**
	 * @return the number
	 */
	public StringProperty getNumber() {
		return number;
	}

	/**
	 * @return the cadname
	 */
	public StringProperty getCadname() {
		return cadname;
	}

	/**
	 * @return the copy
	 */
	public BooleanProperty getCopy() {
		return copy;
	}

	/**
	 * @return the type
	 */
	public StringProperty getType() {
		return type;
	}

	/**
	 * @return the datasheet
	 */
	public StringProperty getDatasheet() {
		return datasheet;
	}

	/**
	 * @return the imageURL
	 */
	public StringProperty getImageURL() {
		return imageURL;
	}

	/**
	 * @return the created
	 */
	public ObjectProperty<LocalDate> getCreated() {
		return created;
	}
}
