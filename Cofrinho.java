public class Cofrinho {

    private Moeda[] colecaoMoedas;
    private int qtdMoedasAdicionadas;
    
    public Cofrinho (int nroMaxMoedas) {
        colecaoMoedas = new Moeda[nroMaxMoedas];
        qtdMoedasAdicionadas = 0;
    }
        
    public boolean insere(Moeda moeda) {
        // tem espaco?
        if (qtdMoedasAdicionadas < colecaoMoedas.length)
        {
            colecaoMoedas[qtdMoedasAdicionadas] = moeda;    // armazenar a moeda
            
            qtdMoedasAdicionadas++; // lembrar que adicionamos mais uma
            
            return true;
        }
        else
        {
            return false; // nao cabem mais moedas!
        }
    }

    public Moeda retira() {
        // tem alguma moeda no cofrinho?
        if (qtdMoedasAdicionadas > 0) { 
            // remove a última moeda adicionada e a retorna
            int posicaoDaUltimaMoedaAdicionada = qtdMoedasAdicionadas - 1;
            Moeda moedaARetirar = colecaoMoedas[posicaoDaUltimaMoedaAdicionada];
            colecaoMoedas[posicaoDaUltimaMoedaAdicionada] = null;
            qtdMoedasAdicionadas--;
            return moedaARetirar;
            
        } else {
            return null;    // não tem nada aqui!
        }
    }

    public int getQtdadeMoedas() {
        return qtdMoedasAdicionadas;
    }

    public int getValorTotalCentavos() {
        int valorTotal = 0;
        
        for (int p = 0; p < qtdMoedasAdicionadas; p++){
            valorTotal += colecaoMoedas[p].getValorCentavos();
        }
        
        return valorTotal;
    }

}
