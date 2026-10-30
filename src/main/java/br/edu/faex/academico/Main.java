package br.edu.faex.academico;

import br.edu.faex.academico.controller.AlunoController;
import br.edu.faex.academico.model.Aluno;
import br.edu.faex.academico.repository.AlunoRepository;
import br.edu.faex.academico.service.AlunoService;

public class Main {
    static void main() {
        Aluno aluno1 = new Aluno("Aleandro Lima", "aleandro.lima2@faex.edu.br");
        Aluno aluno2 = new Aluno("Maria Lima", "maria.lima2@faex.edu.br");
        Aluno aluno3 = new Aluno("José Lima", "jose.lima2@faex.edu.br");

        AlunoRepository repository = new AlunoRepository();
        AlunoService service = new AlunoService(repository);
        AlunoController controller = new AlunoController(service);
        controller.cadastrar(aluno1);
        controller.cadastrar(aluno2);
        controller.cadastrar(aluno3);
    }
}
