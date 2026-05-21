package org.example;

public class Vendor {
    String name;
    int age;
    int mobileNumber;
    String email;
    String companyAddress;
    Item[] vendorItems=new Item[100];
    String productType;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item[] getVendorItems() {
        return vendorItems;
    }

    public void setVendorItems(Item[] vendorItems) {
        this.vendorItems = vendorItems;
    }
//==============================Main Functions=====================================================

}
