package io.github.GuilhermeHNS.controleFinanceiroApi.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "transacao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private BigDecimal valor;
    private String tipo;
    private String data;
    @ManyToOne
    @JoinColumn(name = "categoriaId")
    private Categoria categoria;
    @ManyToOne
    @JoinColumn(name = "usuarioId")
    private User user;

}
