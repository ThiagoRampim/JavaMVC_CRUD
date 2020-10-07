package DAO;

import MODEL.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private final Connection conecta;
    
    public AlunoDAO() {
        this.conecta = new DAO().conecta();
    }
    
    public void salvar(Aluno aluno) {
        String sql = "INSERT INTO aluno (nome, ra, curso, sigla)"
                + "VALUES(?,?,?,?)";
        try(PreparedStatement pstm = conecta.prepareStatement(sql)) {
            pstm.setString(1, aluno.getNome());
            pstm.setInt(2, aluno.getRa());
            pstm.setString(3, aluno.getCurso());
            pstm.setString(4, aluno.getSigla());
            
            pstm.execute();
            pstm.close();
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void alterar(Aluno aluno) {
        String sql = "UPDATE aluno "
                + "SET nome = ?, "
                + "ra = ?, "
                + "curso = ?, "
                + "sigla = ? "
                + "WHERE id = ?";
        try(PreparedStatement pstm = conecta.prepareStatement(sql)) {
            pstm.setString(1, aluno.getNome());
            pstm.setInt(2, aluno.getRa());
            pstm.setString(3, aluno.getCurso());
            pstm.setString(4, aluno.getSigla());
            pstm.setInt(5, aluno.getId());
            
            pstm.execute();
            pstm.close();
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void deletar(Aluno aluno) {
        String sql = "DELETE FROM aluno WHERE id = ?";
        try(PreparedStatement pstm = conecta.prepareStatement(sql)) {
            pstm.setInt(1, aluno.getId());
            pstm.execute();
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Aluno buscar(Aluno aluno) {
        String sql = "SELECT * FROM aluno WHERE id = ?";
        ResultSet rs;
        try(PreparedStatement pstm = conecta.prepareStatement(sql)) {
            pstm.setInt(1, aluno.getId());
            rs = pstm.executeQuery();
            Aluno saluno = new Aluno();
            if(rs.next()) {
                saluno.setId(rs.getInt("id"));
                saluno.setNome(rs.getString("nome"));
                saluno.setRa(rs.getInt("ra"));
                saluno.setCurso(rs.getString("curso"));
                saluno.setSigla(rs.getString("sigla"));
            }
            rs.close();
            return saluno;
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Aluno> listarAlunos() {
        String sql = "SELECT * FROM aluno";
        ResultSet rs;
        List<Aluno> alunos = new ArrayList<Aluno>();
        try(PreparedStatement pstm = conecta.prepareStatement(sql)) {
            rs = pstm.executeQuery();
            while(rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setRa(rs.getInt("ra"));
                aluno.setCurso(rs.getString("curso"));
                aluno.setSigla(rs.getString("sigla"));
                alunos.add(aluno);
            }
            rs.close();
            return alunos;
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
