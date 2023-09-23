package com.usta.parcial1.DTO;

public class NameDTO {

    public String name;
    public String last_name;

    public NameDTO(String name, String last_name) {
        this.name = name;
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String presentarPersona(){
        return "Hola, mi nombre es: " + name + " " + last_name;
    }
}
