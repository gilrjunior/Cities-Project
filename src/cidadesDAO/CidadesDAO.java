package cidadesDAO;

import cidades.Cidades;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CidadesDAO {
 
    Connection conexao;
    
    public CidadesDAO() throws SQLException, ClassNotFoundException{
        this.conexao = Conexao.getConexao();
    }
    
    public void insertCidade(Cidades cidade){
        PreparedStatement ps_cidade;
        String query = "insert into cidades values(?,?,?,?,?,?,?,?)";
        
        try{
            ps_cidade = this.conexao.prepareStatement(query);
            ps_cidade.setString(1, cidade.getCodigo());
            ps_cidade.setString(2, cidade.getNome());
            ps_cidade.setBoolean(3, cidade.isPresencaDoCorpoDeBombeiros());
            ps_cidade.setBoolean(4, cidade.isPresencaDePenitenciaria());
            ps_cidade.setInt(5, cidade.getCategoriaDeArrecadacao());
            ps_cidade.setInt(6, cidade.getPrincipalAtividadeEconomica());
            ps_cidade.setFloat(7, cidade.getCaixa());
            ps_cidade.setString(8, cidade.getObservacoes_importantes());
            ps_cidade.execute();
            ps_cidade.close();
            JOptionPane.showMessageDialog(null, "\n Informacao inserida com sucesso.");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "\n Erro ao inserir no banco: "+e.toString());
        }
    }
    
    public void updateCidade(Cidades cidade){
        PreparedStatement ps_cidade;
        String query = "update cidades set Nome=?, PresencaDoCorpoDeBombeiros=?, PresencaDePenitenciaria=?, CategoriaDeArrecadacao=?, PrincipalAtividadeEconomica=?, Caixa=?, Observacoes_importantes=? where Codigo=?";
        
        try{
            ps_cidade = this.conexao.prepareStatement(query);
            ps_cidade.setString(1, cidade.getCodigo());
            ps_cidade.setString(2, cidade.getNome());
            ps_cidade.setBoolean(3, cidade.isPresencaDoCorpoDeBombeiros());
            ps_cidade.setBoolean(4, cidade.isPresencaDePenitenciaria());
            ps_cidade.setInt(5, cidade.getCategoriaDeArrecadacao());
            ps_cidade.setInt(6, cidade.getPrincipalAtividadeEconomica());
            ps_cidade.setFloat(7, cidade.getCaixa());
            ps_cidade.setString(8, cidade.getObservacoes_importantes());
            ps_cidade.execute();
            ps_cidade.close();
            JOptionPane.showMessageDialog(null, "\n Informacao atualizada com sucesso.");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "\n Erro ao atualizar no banco: "+e.toString());
        }
    }
    
    public void excluirCidade(String codigo){

        PreparedStatement ps_cidade;
        String query = "delete from cidades where codigo = ?";
        
        try{
            ps_cidade = this.conexao.prepareStatement(query);
            ps_cidade.setString(1, codigo);
            ps_cidade.execute();
            ps_cidade.close();
            Cidades.num_cidades--;
            JOptionPane.showMessageDialog(null, "\n Informacao removida com sucesso.");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "\n Erro ao alterar no banco: "+e.toString());
        }
        
    }
    
     public ArrayList<Cidades> mostraCidades(int verif){
        
        PreparedStatement ps_cidade;
        ResultSet res;
        ArrayList<Cidades> listacidades = null;
        String query  = "select * from cidades";
        if(verif == 1){
            query  = "select * from cidades order by Nome";
        }
        
        try{
            ps_cidade = this.conexao.prepareStatement(query);
            res = ps_cidade.executeQuery();
            listacidades = new ArrayList<>();
            
            while(res.next())
            {
                Cidades cidade = new Cidades();
                
                cidade.setCodigo(res.getString("Codigo"));
                cidade.setNome(res.getString("Nome"));
                cidade.setPresencaDoCorpoDeBombeiros(res.getBoolean("PresencaDoCorpoDeBombeiros"));
                cidade.setPresencaDePenitenciaria(res.getBoolean("PresencaDePenitenciaria"));
                cidade.setCategoriaDeArrecadacao(res.getInt("CategoriaDeArrecadacao"));
                cidade.setPrincipalAtividadeEconomica(res.getInt("PrincipalAtividadeEconomica"));
                cidade.setCaixa(res.getFloat("Caixa"));
                cidade.setObservacoes_importantes(res.getString("Observacoes_importantes"));
                
                listacidades.add(cidade);
            }
            res.close();
            ps_cidade.close();
            
       }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "\n Erro ao buscar as informações no banco: "+e.toString());
       }
       return (listacidades);
        
    }
}
