package com.appjex.nsqn;

public class Chat {
    private String nombre;
    private String tema;
    private String locacion;

    public Chat(){
        super();
    }

    public Chat(String nombre, String tema, String locacion){
        super();
        this.nombre=nombre;
        this.tema=tema;
        this.locacion=locacion;
    }

    public String getNombre(){
        return nombre;
    }

    public  String getTema(){
        return tema;
    }

    public  String getLocacion(){
        return locacion;
    }

}
