
package helps.pojo;

/**
 *
 * @author Usuario
 */
public class pojo {

    public static String Nome,Telefone,Email,Senha,Senhasha,ConfirmacaoSenha,estado,erro;

    public static String getSenhasha() {
        return Senhasha;
    }

    public static void setSenhasha(String Senhasha) {
        pojo.Senhasha = Senhasha;
    }
    public static int codigo,estadoid;

    public static int getEstadoid() {
        return estadoid;
    }

    public static void setEstadoid(int estadoid) {
        pojo.estadoid = estadoid;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getConfirmacaoSenha() {
        return ConfirmacaoSenha;
    }

    public void setConfirmacaoSenha(String ConfirmacaoSenha) {
        this.ConfirmacaoSenha = ConfirmacaoSenha;
    }
    boolean Termo;

    public boolean isTermo() {
        return Termo;
    }

    public void setTermo(boolean Termo) {
        this.Termo = Termo;
    }
    
    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void getEmail(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getSenha(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    

    
}
