public class User {

    private String name;
    private String surname;
    private String email;
    private String password;
    private boolean isGuest;

    public User(String email) {
        this.email = email;
        this.setGuest();
    }

    public User(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.setNotGuest();
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isGuest() {
        return isGuest;
    }

    public void setGuest() {
        this.isGuest = true;
    }

    public void setNotGuest() {
        this.isGuest = false;
    }

    public void upgradeGuestToUser(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.setNotGuest();
    }
}
