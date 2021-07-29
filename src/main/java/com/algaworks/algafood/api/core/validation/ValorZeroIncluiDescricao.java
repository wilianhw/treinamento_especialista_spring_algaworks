package com.algaworks.algafood.api.core.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { ValorZeroIncluiDescricaoValidator.class })
public @interface ValorZeroIncluiDescricao {

    String message() default "Descrição Grátis Inválida";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    //valorField = "taxaFrete", descricaoField = "nome", descricaoObrigatoria = "Frete Grátis"

    String valorField();

    String descricaoField();

    String descricaoObrigatoria();

}
