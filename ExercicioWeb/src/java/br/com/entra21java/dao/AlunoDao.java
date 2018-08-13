/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.entra21java.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class AlunoDao {
    
     public List<AlunoBean> obterTodos() {
        List<AlunoBean> alunos = new ArrayList<>();
        String sql = "SELECT * FROM alunos";

        try {
            java.sql.Statement st = Conexao.obterConexao().createStatement();

            st.execute(sql);
            ResultSet resultSet = st.getResultSet();
            while (resultSet.next()) {
                AlunoBean aluno = new AlunoBean();
                aluno.setId(resultSet.getInt("id"));
                aluno.setNome(resultSet.getString("nome"));
                aluno.setNota_1(resultSet.getFloat("nota_1"));
                aluno.setNota_2(resultSet.getFloat("nota_2"));
                aluno.setNota_3(resultSet.getFloat("nota_3"));
                aluno.setFrequencia(resultSet.getInt("frequencia"));
                aluno.setCodigo_matricula(resultSet.getString("codigo_matricula"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return alunos;

    }

    public int adicionar(AlunoBean aluno) {
        String sql = "INSERT INTO alunos(nome, nota_1, nota_2, nota_3, frequencia, codigo_matricula)";
        try {
            PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            int quantidade = 1;
            ps.setString(quantidade++, aluno.getNome());
            ps.setString(quantidade++, aluno.getCodigo_matricula());
            ps.setFloat(quantidade++, aluno.getNota_1());
            ps.setFloat(quantidade++, aluno.getNota_2());
            ps.setFloat(quantidade++, aluno.getNota_3());
            ps.setInt(quantidade++, aluno.getFrequencia());
            ps.execute();
            ResultSet resultSet = ps.getGeneratedKeys();
            if (resultSet.next()) {
                return resultSet.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return -1;
    }

    public boolean excluir(int id) {
        String sql = "DELETE FROM alunos WHERE id =?";
        try {
            PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() == 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }

    public AlunoBean obterPeloId(int id) {
        String sql = "SELECT * FROM alunos WHERE id =?";
        try {
            PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ResultSet resultSet = ps.getResultSet();
            if (resultSet.next()) {
                AlunoBean aluno = new AlunoBean();
                aluno.setId(id);
                aluno.setNome(resultSet.getString("nome"));
                aluno.setNota_1(resultSet.getFloat("nota_1"));
                aluno.setNota_2(resultSet.getFloat("nota_2"));
                aluno.setNota_3(resultSet.getFloat("nota_3"));
                aluno.setFrequencia(resultSet.getInt("frequncia"));
                aluno.setCodigo_matricula(resultSet.getString("codigo_matricula"));
                return aluno;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return null;
    }

    public boolean alterar(AlunoBean aluno) {
        String sql = "UPDATE alunos SET nome =?, nota_1 = ?, nota_2 = ?,nota_3 = ?, frequencia = ?, codigo_matricula =?";
        try {
            PreparedStatement ps = Conexao.obterConexao().prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getCodigo_matricula());
            ps.setInt(3, aluno.getFrequencia());
            ps.setFloat(4, aluno.getNota_1());
            ps.setFloat(5, aluno.getNota_2());
            ps.setFloat(6, aluno.getNota_3());
            return ps.executeUpdate() == 1;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Conexao.fecharConexao();
        }
        return false;
    }
}
