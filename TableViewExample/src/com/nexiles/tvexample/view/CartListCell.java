/**
 * 
 */
package com.nexiles.tvexample.view;

import javafx.scene.control.ListCell;

import com.nexiles.tvexample.model.Cart;

/**
 * @author seletz
 *
 */
public class CartListCell extends ListCell<Cart> {

	@Override
	public void updateItem(Cart cart, boolean empty) {
		super.updateItem(cart,  empty);
		
		if (empty) {
			setText(null);
			return;
		}
		
		setText(cart.getName().get());
	}

}
