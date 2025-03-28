import java.util.ArrayList;

public class Empresa {
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Equipamento> equipamentos;

    public Empresa() {
        funcionarios = new ArrayList<>();
        equipamentos = new ArrayList<>();
    }
    public void CadastrarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public Funcionario BuscarFuncionario(String matricula) {
        for(int i = 0; i < funcionarios.size(); i++){
            Funcionario aux = funcionarios.get(i);
            if(aux.getMatricula().equals(matricula)){
                return aux;
            }
        }
        return null;
    }

    public void RenomearFuncionario(Funcionario f, String novoNome) {
        f.setNome(novoNome);
    }

    public void AlterarEmail(Funcionario f, String email) {
        f.setEmail(email);
    }

    public void cadastrarEquipamento(Equipamento e) {
        equipamentos.add(e);
    }

    public Equipamento buscarEquipamento(String id) {
        for (Equipamento eq : equipamentos) {
            if (eq.getId().equals(id)) {
                return eq;
            }
        }
        return null;
    }

    public void editarDescricaoEquipamento(Equipamento e, String novaDescricao) {
        e.setDescricao(novaDescricao);
    }

    public void definirIndisponivel(Equipamento e) {
        e.setDisponivel(false);
    }
}
