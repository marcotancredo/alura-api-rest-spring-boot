package br.com.alura.forum.config.validation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErroDeFomularioDto {

    private String campo;
    private String erro;

    public ErroDeFomularioDto(String campo, String erro) {
        this.campo = campo;
        this.erro = erro;
    }
}
