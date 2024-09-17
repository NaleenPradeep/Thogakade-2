package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class AddCustomerFormController {
    public TextField txtID;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtSalary;

    List<Customer> customerList = new ArrayList<>();

    public void btnAddOnAction(ActionEvent actionEvent) {
        customerList.add(new Customer(txtID.getText(), txtAddress.getText(), txtName.getText(), Double.parseDouble(txtSalary.getText())));

        System.out.println("-------------------------------------");
        customerList.forEach(cus ->{
            System.out.println(cus);
        });
        System.out.println("-------------------------------------");
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
    }

    public void btnSearchOnAction(ActionEvent actionEvent) {
    }
}
