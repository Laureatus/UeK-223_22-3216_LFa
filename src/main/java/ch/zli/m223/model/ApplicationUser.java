package ch.zli.m223.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class ApplicationUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(readOnly = true)
    private Long id;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private boolean isAdmin;

    @OneToMany(mappedBy = "user")
    @JsonIgnoreProperties("user")
    @Fetch(FetchMode.JOIN)
    private Set<Booking> bookings;

    @OneToMany(mappedBy = "user")
    @JsonIgnoreProperties("user")
    @Fetch(FetchMode.JOIN)
    private Set<Material> material;

    @OneToMany(mappedBy = "user")
    @JsonIgnoreProperties("user")
    @Fetch(FetchMode.JOIN)
    private Set<Coffee> coffee;

    @OneToMany(mappedBy = "user")
    @JsonIgnoreProperties("user")
    @Fetch(FetchMode.JOIN)
    private Set<Lunch> lunch;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Set<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }

    public Set<Material> getMaterial() {
        return material;
    }

    public void setMaterial(Set<Material> material) {
        this.material = material;
    }

    public Set<Coffee> getCoffee() {
        return coffee;
    }

    public void setCoffee(Set<Coffee> coffee) {
        this.coffee = coffee;
    }

    public Set<Lunch> getLunch() {
        return lunch;
    }

    public void setLunch(Set<Lunch> lunch) {
        this.lunch = lunch;
    }


}
