package med.voll.api.direccion;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DatosDireccion(
        @NotBlank String calle,
        String numero,
        String complemento,
        @NotBlank String barrio,
        @NotBlank @Pattern(regexp = "\\d{5}") String codigo_postal,
        @NotBlank String ciudad,
        @NotBlank String estado) {
}
