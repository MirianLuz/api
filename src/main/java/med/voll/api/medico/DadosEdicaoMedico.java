package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosCadastroEndereco;

public record DadosEdicaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosCadastroEndereco endereco
) {
}
