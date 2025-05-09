package com.hospital.api.dtos;

import java.time.LocalDateTime;

public class CreateCitaDto {
    public Long doctorId;
    public Long consultorioId;
    public String nombrePaciente;
    public LocalDateTime horarioConsulta;

}
