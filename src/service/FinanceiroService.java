package service;

import model.Movimento;
import model.TipoMovimento;
import model.Categoria;
import repository.FinanceiroRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FinanceiroService {

    private double saldoAtual;
    private List<Movimento> movimentos;

    public FinanceiroService() {
        this.movimentos = FinanceiroRepository.carregarMovimentos();
        this.saldoAtual = FinanceiroRepository.carregarSaldo();
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public List<Movimento> listarMovimentos() {
        return movimentos;
    }

    public void registrarMovimento(TipoMovimento tipo, LocalDate data, double valor, String descricao, Categoria categoria) {

        Movimento m = new Movimento(tipo, data, valor, descricao, categoria);
        movimentos.add(m);

        if (tipo == TipoMovimento.GANHO)
            saldoAtual += valor;
        else
            saldoAtual -= valor;

        salvar();
    }

    public void editarSaldo(double novoValor) {
        this.saldoAtual = novoValor;
        salvar();
    }

    public void limparMovimentacoes() {
        movimentos.clear();
        saldoAtual = 0;
        salvar();
    }

    private void salvar() {
        FinanceiroRepository.salvar(movimentos, saldoAtual);
    }
}
