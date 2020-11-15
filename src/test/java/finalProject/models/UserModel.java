package finalProject.models;

public class UserModel {

    private String name = "Aleksandra";
    private String surname = "Kalvāne";
    private String email = "goldshark@inbox.lv";
    private String mobile = "22224040";
    private String address = "Ruses 00-11";
    private String postalCoda = "1029";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCoda() {
        return postalCoda;
    }

    public void setPostalCoda(String postalCoda) {
        this.postalCoda = postalCoda;
    }
}


