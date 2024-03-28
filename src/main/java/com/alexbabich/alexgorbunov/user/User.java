package com.alexbabich.alexgorbunov.user;

import jakarta.persistence.*;
import java.util.Date; // Import Date for the created field

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name") // Adjusted for first_name
    private String firstName;

    @Column(name = "last_name") // Adjusted for last_name
    private String lastName;

    @Column(name = "phone") // Added for phone
    private String phone;

    @Column(name = "created") // Added for created
    @Temporal(TemporalType.TIMESTAMP) // This ensures the date is stored as a timestamp
    private Date created;

    @Column(name = "email") // No change here
    private String email;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
