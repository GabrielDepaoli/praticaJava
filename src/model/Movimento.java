package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Movimento implements Serializable {

    private TipoMovimento tipo;
    private LocalDate data;
    private double valor;
    private String descricao;
    private Categoria categoria; // Só usado quando for gasto

    public Movimento(TipoMovimento tipo, LocalDate data, double valor, String descricao, Categoria categoria) {
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public TipoMovimento getTipo() {
        return tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return data + " | " + tipo + " | R$" + valor + " | " + descricao;
    }
}
