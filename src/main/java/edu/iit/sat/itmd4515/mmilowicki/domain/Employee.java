package edu.iit.sat.itmd4515.mmilowicki.domain;

import java.time.LocalDate;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

/**
 *
 * @author maciej milowicki
 */
public class Employee {

    /**
     * private Integer id = null; Big-I integer can be null private int foo =
     * null; int cannot be null private int foo = 0; int's default value is 0
     */
    @NotNull
    @Positive
    private Integer empId;
    @NotBlank(message = "Employee First Name is Required")
    private String firstName;
    @NotBlank(message = "Employee Last Name is Required")
    private String lastName;
    @NotBlank
    private String title;
    @NotBlank
    private String titleOfCourtesy;
    @PastOrPresent
    private LocalDate birthDate;
    @PastOrPresent
    private LocalDate hireDate;
    @NotBlank
    private String address;
    @NotBlank(message = "Name of City is Required")
    private String city;
    @NotNull
    private Integer postalCode;
    @NotBlank
    private String country;
    @NotBlank
    private String phone;

    public Employee() {
    }

    public Employee(Integer empId, String firstName, String lastName, String title, String titleOfCourtesy, LocalDate birthDate, LocalDate hireDate, String address, String city, Integer postalCode, String country, String phone) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.titleOfCourtesy = titleOfCourtesy;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleOfCourtesy() {
        return titleOfCourtesy;
    }

    public void setTitleOfCourtesy(String titleOfCourtesy) {
        this.titleOfCourtesy = titleOfCourtesy;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
