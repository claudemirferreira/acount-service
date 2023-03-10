package br.com.setebit.consultasaldo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity()
public class Cliente {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_CLIENTE")
    @SequenceGenerator(sequenceName = "S_CLIENTE", allocationSize = 1, name = "S_CLIENTE")
    @Id
    @Column(name = "cli_cod")
    private Long codigo;

    private String nome;

    private String email;

}
