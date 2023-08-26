package org.projects;

public record Employee(int id, String firstName, String lastName) {
    public String firstNameUppercase(){
        return this.firstName.toUpperCase();
    }
}
