package com.nexiles.tvexample;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.nexiles.tvexample.model.Cart;
import com.nexiles.tvexample.view.CartViewController;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	static private FileHandler fileTxt;
	static private SimpleFormatter formatterTxt;


	private Stage primaryStage;
	private BorderPane rootLayout;

	private ObservableList<Cart> cartItems = FXCollections.observableArrayList();

	public MainApp() {
		cartItems.add(new Cart("BAUSTEIN_15.PRT", "BAUSTEIN_15.PRT", "Baustein 15", "baustein_15.prt"));
		cartItems.add(new Cart("BAUSTEIN_15.PRT", "BAUSTEIN_15.PRT", "Baustein 15", "baustein_15.prt"));
		cartItems.add(new Cart("BAUSTEIN_15.PRT", "BAUSTEIN_15.PRT", "Baustein 15", "baustein_15.prt"));
		cartItems.add(new Cart("BAUSTEIN_15.PRT", "BAUSTEIN_15.PRT", "Baustein 15", "baustein_15.prt"));
		cartItems.add(new Cart("BAUSTEIN_15.PRT", "BAUSTEIN_15.PRT", "Baustein 15", "baustein_15.prt"));
	}

	/**
	 * @return the cartItems
	 */
	public ObservableList<Cart> getCartItems() {
		return cartItems;
	}

	/**
	 * @param cartItems the cartItems to set
	 */
	public void setCartItems(ObservableList<Cart> cartItems) {
		this.cartItems = cartItems;
	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Parts Collection");

		initRootLayout();

		showCart();
	}

	/**
	 * Initializes the root layout.
	 */
	public void initRootLayout() {
		try {
			// Load root layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Shows the person overview inside the root layout.
	 */
	public void showCart() {
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/CartView.fxml"));
			AnchorPane cartView = (AnchorPane) loader.load();

			// Set person overview into the center of root layout.
			rootLayout.setCenter(cartView);

			CartViewController controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns the main stage.
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) throws IOException {
		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		logger.setLevel(Level.FINEST);

		fileTxt = new FileHandler("/tmp/cartapp.txt");

		formatterTxt = new SimpleFormatter();
		fileTxt.setFormatter(formatterTxt);
		logger.addHandler(fileTxt);
		
		logger.info("Start");
		logger.fine("foo");


		launch(args);
	}
}
