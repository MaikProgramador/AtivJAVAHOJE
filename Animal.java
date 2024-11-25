public class Animal {
    private String nome;
    private String tipo;
    private String raca;

    public Animal(String nome, String tipo, String raca) {
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Raça: " + raca);
    }
}
