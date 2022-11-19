package cidades;


public class Cidades {
    
    private String Codigo;
    private String Nome;
    private boolean PresencaDoCorpoDeBombeiros;
    private boolean PresencaDePenitenciaria;
    private int CategoriaDeArrecadacao;
    private int PrincipalAtividadeEconomica;
    private float Caixa;
    private String Observacoes_importantes;
    public static int num_cidades;

    public Cidades(String Codigo, String Nome, boolean PresencaDoCorpoDeBombeiros, boolean PresencaDePenitenciaria, int CategoriaDeArrecadacao, int PrincipalAtividadeEconomica, float Caixa, String Observacoes_importantes) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.PresencaDoCorpoDeBombeiros = PresencaDoCorpoDeBombeiros;
        this.PresencaDePenitenciaria = PresencaDePenitenciaria;
        this.CategoriaDeArrecadacao = CategoriaDeArrecadacao;
        this.PrincipalAtividadeEconomica = PrincipalAtividadeEconomica;
        this.Caixa = Caixa;
        this.Observacoes_importantes = Observacoes_importantes;
        Cidades.num_cidades++;
    }
    
    public Cidades() {
        this.Codigo = "";
        this.Nome = "";
        this.PresencaDoCorpoDeBombeiros = false;
        this.PresencaDePenitenciaria = false;
        this.CategoriaDeArrecadacao = 0;
        this.PrincipalAtividadeEconomica = 0;
        this.Caixa = 0;
        this.Observacoes_importantes = "";
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public boolean isPresencaDoCorpoDeBombeiros() {
        return PresencaDoCorpoDeBombeiros;
    }

    public void setPresencaDoCorpoDeBombeiros(boolean PresencaDoCorpoDeBombeiros) {
        this.PresencaDoCorpoDeBombeiros = PresencaDoCorpoDeBombeiros;
    }

    public boolean isPresencaDePenitenciaria() {
        return PresencaDePenitenciaria;
    }

    public void setPresencaDePenitenciaria(boolean PresencaDePenitenciaria) {
        this.PresencaDePenitenciaria = PresencaDePenitenciaria;
    }

    public int getCategoriaDeArrecadacao() {
        return CategoriaDeArrecadacao;
    }

    public void setCategoriaDeArrecadacao(int CategoriaDeArrecadacao) {
        this.CategoriaDeArrecadacao = CategoriaDeArrecadacao;
    }

    public int getPrincipalAtividadeEconomica() {
        return PrincipalAtividadeEconomica;
    }

    public void setPrincipalAtividadeEconomica(int PrincipalAtividadeEconomica) {
        this.PrincipalAtividadeEconomica = PrincipalAtividadeEconomica;
    }

    public float getCaixa() {
        return Caixa;
    }

    public void setCaixa(float Caixa) {
        this.Caixa = Caixa;
    }

    public String getObservacoes_importantes() {
        return Observacoes_importantes;
    }

    public void setObservacoes_importantes(String Observacoes_importantes) {
        this.Observacoes_importantes = Observacoes_importantes;
    }

    @Override
    public String toString() {
        return "Codigo = " + Codigo + ", Nome = " + Nome + ", PresencaDoCorpoDeBombeiros = " + PresencaDoCorpoDeBombeiros + ", PresencaDePenitenciaria = " + PresencaDePenitenciaria + ", CategoriaDeArrecadacao = " + CategoriaDeArrecadacao + ", PrincipalAtividadeEconomica = " + PrincipalAtividadeEconomica + ", Caixa = " + Caixa + ", Observacoes_importantes = " + Observacoes_importantes;
    }
    
    
    
}
