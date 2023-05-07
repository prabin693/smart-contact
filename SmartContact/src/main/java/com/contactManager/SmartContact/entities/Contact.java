package com.contactManager.SmartContact.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cId;

    private String name;

    private String secondName;

    private String work;

    private String email;

    private String phone;

    @Column(length = 500)
    private String description;

    @ManyToOne
    private User user;


}
