package repository;

import model.Movimento;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FinanceiroRepository {

    private static final String FILE = "financeiro.data";

    public static void salvar(List<Movimento> lista, double saldoAtual) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {

            oos.writeObject(lista);
            oos.writeDouble(saldoAtual);

        } catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
    }

    public static List<Movimento> carregarMovimentos() {

        File arquivo = new File(FILE);
        if (!arquivo.exists()) return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {

            return (List<Movimento>) ois.readObject();

        } catch (Exception e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static double carregarSaldo() {

        File arquivo = new File(FILE);
        if (!arquivo.exists()) return 0.0;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {

            ois.readObject(); // Ignora lista, pois já foi lida acima
            return ois.readDouble();

        } catch (Exception e) {
            System.out.println("Erro ao carregar saldo: " + e.getMessage());
            return 0.0;
        }
    }
}
