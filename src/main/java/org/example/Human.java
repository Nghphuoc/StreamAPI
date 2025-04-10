package org.example;

import java.util.Objects;

public class Human {

  private String name;

  private String email;

  private String phone;

  private String address;

  public Human (){}

  public Human(String name, String email, String phone, String address) {
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Human human = (Human) o;
    return Objects.equals(name, human.name) && Objects.equals(email, human.email)
        && Objects.equals(phone, human.phone) && Objects.equals(address,
        human.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, phone, address);
  }

  @Override
  public String toString() {
    return "Human{" +
        "name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", phone='" + phone + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}
