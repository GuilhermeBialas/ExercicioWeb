package br.com.entra21java.bean;

/**
 *
 * @author Guilherme Bialas
 */
public class AlunoBean {

    private String nome, codigo_matricula;
    private float nota_1, nota_2, nota_3;
    private int frequencia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo_matricula() {
        return codigo_matricula;
    }

    public void setCodigo_matricula(String codigo_matricula) {
        this.codigo_matricula = codigo_matricula;
    }

    public float getNota_1() {
        return nota_1;
    }

    public void setNota_1(float nota_1) {
        this.nota_1 = nota_1;
    }

    public float getNota_2() {
        return nota_2;
    }

    public void setNota_2(float nota_2) {
        this.nota_2 = nota_2;
    }

    public float getNota_3() {
        return nota_3;
    }

    public void setNota_3(float nota_3) {
        this.nota_3 = nota_3;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public void setId(int aInt) {

    }
}
