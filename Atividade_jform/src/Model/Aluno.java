/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 11211100857@alunos.umc.br 11211102089@alunos.umc.br
 */
public class Aluno {

    private String nome, sobrenome, curso, datansc, rgm, sexo;
  

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }   
    public void setRgm(String rgm) {
        this.rgm = rgm;
    }    
    public void setDatansc(String datansc) {
        this.datansc = datansc;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getnome() {
        return nome;
    }
    public String getsobrenome(){
        return sobrenome;
    }
    public String getcurso(){
        return curso;
    }
    public String getrgm(){
        return rgm;
    }
    public String getdatansc(){
        return datansc;
    }
    public String getsexo(){
        return sexo;
    }

    
}
