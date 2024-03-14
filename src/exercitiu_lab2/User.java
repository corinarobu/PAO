package exercitiu_lab2;
class User {
    private String username;
    private double sold;
    public User() {
        username = "";
        sold = 0;
    }

    public User(String username, double sold) {
        this.username = username;
        this.sold = sold;
    }

    void setUsername(String username) {
        this.username = username;
    }
    void setSold(double sold) {
        this.sold = sold;
    }
    String getUsername() {
        return username;
    }
    double getSold() {
        return sold;
    }
}