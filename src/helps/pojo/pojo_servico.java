/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helps.pojo;

/**
 *
 * @author LabInfo2
 */
public class pojo_servico {

    public String getServico() {
        return Servico;
    }

    public void setServico(String Servico) {
        this.Servico = Servico;
    }

    public String getFerramenta() {
        return Ferramenta;
    }

    public void setFerramenta(String Ferramenta) {
        this.Ferramenta = Ferramenta;
    }

    public String getInfoAdicional() {
        return InfoAdicional;
    }

    public void setInfoAdicional(String InfoAdicional) {
        this.InfoAdicional = InfoAdicional;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }

    public String getQualFerramenta() {
        return QualFerramenta;
    }

    public void setQualFerramenta(String QualFerramenta) {
        this.QualFerramenta = QualFerramenta;
    }

    public int getCodigoid() {
        return codigoid;
    }

    public void setCodigoid(int codigoid) {
        this.codigoid = codigoid;
    }
    public  String Servico, Ferramenta, InfoAdicional, erro, QualFerramenta;
    int codigoid;
}