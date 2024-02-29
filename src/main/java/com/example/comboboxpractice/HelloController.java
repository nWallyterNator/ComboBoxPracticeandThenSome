package com.example.comboboxpractice;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    public Button button;
    public ComboBox<String> cboitems;

    // create an array of string elements
    private String [] drinkItems = {"Item 1", "Item 2", "Item 3"};


    // create an observable list from an array of string elements
    // observable list behaves very much like an arrayList for storing a collection of ellements
    private ObservableList<String> drinkList = FXCollections.observableArrayList(drinkItems);
    public TextArea tainformation;

    public void handleButtonAction(ActionEvent actionEvent) {

        // get the currently selected string object in this model
        tainformation.appendText(cboitems.getSelectionModel().getSelectedItem()+"\n");

        // get the interger value indicating the currently selected index in this model
        tainformation.appendText(String.valueOf(cboitems.getSelectionModel().getSelectedIndex())+"\n");

        //get the selected items in this combo box
        // and convert to a string value to display it.
        tainformation.appendText(String.valueOf(cboitems.getItems())+"\n");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //set the value of the property items to display in the combo box
        cboitems.setItems(drinkList);

        // append the specific items to the end of the cboitems list
        cboitems.getItems().add("Item 4");
        cboitems.getItems().add("Item 5");
        cboitems.getItems().add("Item 6");

        // append the specific items to the end of this cboItems list
        cboitems.getItems().addAll("Items 7", "Item 8", "Item 9", "Item 10");

    }
}