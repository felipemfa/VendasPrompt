package vendasprompt.modelo;

import java.sql.Date;
import java.util.List;

public class Carrinho{
    private List<Produto> produtos;
    private Date data;

    public List<Produto> getItens() {
        return produtos;
    }

    public void setItens(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
