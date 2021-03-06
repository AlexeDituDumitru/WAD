/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wad.cart;

import com.wad.datamodels.Product;
/**
 *
 * /**
 *
 * @author mihae
 */


import java.util.*;

public class ShoppingCart {

    List<ShoppingCartItem> items;

    int numberOfItems;

    double total;

    public ShoppingCart() {

        items = new ArrayList<ShoppingCartItem>();

        numberOfItems = 0;

        total = 0;

    }

    public synchronized void addItem(Product product) {

        boolean newItem = true;

        for (ShoppingCartItem scItem : items) {

            if (scItem.getProduct().getId() == product.getId()) {

                newItem = false;

                scItem.incrementQuantity();

            }

        }

        if (newItem) {

            ShoppingCartItem scItem = new ShoppingCartItem(product);

            items.add(scItem);

        }

    }

    public synchronized void update(Product product, String quantity) {

        short qty = -1;

        qty = Short.parseShort(quantity);

        if (qty >= 0) {

            ShoppingCartItem item = null;

            for (ShoppingCartItem scItem : items) {

                if (scItem.getProduct().getId() == product.getId()) {

                    if (qty != 0) {

                        scItem.setQuantity(qty);

                    } else {

                        item = scItem;

                        break;

                    }

                }

            }

            if (item != null) {

                items.remove(item);

            }

        }

    }

    public synchronized double getSubtotal() {

        double amount = 0;

        for (ShoppingCartItem scItem : items) {

            Product product = (Product) scItem.getProduct();

            amount += (scItem.getQuantity() * product.getPrice());

        }

        return amount;

    }

    public synchronized void calculateTotal(String surcharge) {

        double amount = 0;

        double s = Double.parseDouble(surcharge);

        amount = this.getSubtotal();

        amount += s;

        total = amount;

    }

    public synchronized double getTotal() {

        return total;

    }

    public synchronized void clear() {

        items.clear();

        numberOfItems = 0;

        total = 0;

    }

}
