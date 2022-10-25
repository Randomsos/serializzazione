package y;

import java.util.Date;

public class Alunno {

    private String nome;
    private String cognome;
    private Date data;

    public Alunno() {

    }

    public Alunno(String nome, String cognome, Date data) {
        this.nome = nome;
        this.cognome = cognome;
        this.data = data;
    }



    //GETTER E SETTER
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }

    

    

}