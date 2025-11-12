package br.com.financeiro;

import model.TipoMovimento;
import model.Categoria;
import service.FinanceiroService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FinanceiroService service = new FinanceiroService();

        service.registrarMovimento(
                TipoMovimento.GASTO,
                LocalDate.now(),
                50.0,
                "Almoço",
                new Categoria("Restaurante")
        );

        System.out.println("Saldo atual: R$ " + service.getSaldoAtual());
        System.out.println(service.listarMovimentos());
    }
}
