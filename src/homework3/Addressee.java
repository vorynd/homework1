package homework3;

import java.util.Objects;

public class Addressee {

    private String name;
    private String surname;
    private String socialStatus;
    private String phoneNumber;

    public Addressee() {
    }

    public Addressee(String name, String surname, String socialStatus, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.socialStatus = socialStatus;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSocialStatus() {
        return socialStatus;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSocialStatus(String socialStatus) {
        this.socialStatus = socialStatus;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Addressee addressee = (Addressee) o;
        return Objects.equals(name, addressee.name) &&
                Objects.equals(surname, addressee.surname) &&
                Objects.equals(socialStatus, addressee.socialStatus) &&
                Objects.equals(phoneNumber, addressee.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, socialStatus, phoneNumber);
    }

    @Override
    public String toString() {
        return "Addressee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", socialStatus='" + socialStatus + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
