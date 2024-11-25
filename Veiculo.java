public class Veiculo {
    private String tipo;
    private String marca;
    private int anoFabricacao;

    public Veiculo(String tipo, String marca, int anoFabricacao) {
        this.tipo = tipo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }

    public void imprimir() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
    }

    public int calcularIdade(int anoAtual) {
        return anoAtual - anoFabricacao;
    }
}
