package org.example.hw.block1_1_objects;

import lombok.*;

@Data
@NoArgsConstructor
//@AllArgsConstructor по условиям по 1.4.5.
public class Name {
    private String lastName;
    private String firstName;
    private String middleName;

    // только с именем
    public Name(String firstName) {
        this.firstName = firstName;
        this.lastName = null;
        this.middleName = null;
    }

    //  с именем и фамилией
    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = null;
    }

    //  с именем, фамилией и отчеством
    public Name(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return String.join(" ",
                lastName != null ? lastName : "",
                firstName != null ? firstName : "",
                middleName != null ? middleName : "").trim();
    }
}
