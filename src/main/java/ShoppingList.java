package models;
import models.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ShoppingList {

    private String name;
    //Declaramos o user usando a heranca da classe User
    private User User;
    //Declaramos um arrayList user da classe User
    //private User userList ;


//Declarar Lista utilizador
  private List<User> UserList = new ArrayList<>();

    public List<models.User> getUserList() {
        return UserList;
    }

    public void setUserList(List<models.User> userList) {
        this.UserList = userList;
    }


    //Declarar Lista produtos 1
    private List<Product> ProductList1 = new ArrayList<>();

    public List<Product> getProductList1() {
        return ProductList1;
    }

    public void setProductList1(List<Product> productList1) {
        this.ProductList1 = productList1;
    }

    //Declarar Lista produtos 2
    private List<Product> ProductList2 = new ArrayList<>();

    public List<Product> getProductList2() {
        return ProductList2;
    }

    public void setProductList2(List<Product> productList2) {
        this.ProductList2 = productList2;
    }

// construtores

    public ShoppingList(String name, models.User user, List<models.User> userList, List<Product> productList1, List<Product> productList2) {
        this.name = name;
        User = user;
        UserList = userList;
        ProductList1 = productList1;
        ProductList2 = productList2;
    }
}
