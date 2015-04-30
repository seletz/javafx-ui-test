package com.nexiles.tvexample.model;
import java.time.LocalDate;
import java.util.logging.Logger;

import com.nexiles.tvexample.view.CartListCell;

import javafx.beans.property.SimpleBooleanProperty;
// import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
// import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class Cart {
	static final Logger logger = Logger.getLogger(Cart.class.getName());

	
	private final StringProperty id;
	private final StringProperty name;
	private final StringProperty number;
	private final StringProperty cadname;
	private final SimpleBooleanProperty copy;
	private final StringProperty type;
	private final StringProperty datasheet;
	private final StringProperty imageURL;
	private final ObjectProperty<LocalDate> created;
	
	public Cart() {
		this(null, null, null, null);
	}
	
	public Cart(String id, String number, String name, String cadname) {
		logger.fine("Cart()");
	    System.out.println("Cart::Cart()");

		this.id = new SimpleStringProperty(id);
		this.name = new SimpleStringProperty(name);
		this.number = new SimpleStringProperty(number);
		this.cadname = new SimpleStringProperty(cadname);
		
		this.copy = new SimpleBooleanProperty(false);
		this.type = new SimpleStringProperty("model");
		this.datasheet = new SimpleStringProperty("");
		this.imageURL = new SimpleStringProperty("");
		this.created =  new SimpleObjectProperty<LocalDate>(LocalDate.of(1973, 4, 29));
		
		logger.fine("Cart: " + this.toString());
	}
	
	public StringProperty idProperty() {
		return id;
	}
	public StringProperty nameProperty() {
		return name;
	}
	public StringProperty numberProperty() {
		return number;
	}
	public StringProperty cadnameProperty() {
		return cadname;
	}
	public StringProperty imageURLProperty() {
		return imageURL;
	}
	public StringProperty typeProperty() {
		return type;
	}
	public StringProperty datasheetProperty() {
		return datasheet;
	}
	public ObjectProperty<LocalDate> createdProperty() {
		return created;
	}
	public SimpleBooleanProperty copyProperty() {
		return copy;
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
	public SimpleBooleanProperty getCopy() {
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
	
	public String toString() {
		return "Cart<id=" + id.get() + ">";
	}
}
