package dev.java10x.CadastroDeNinjas.Missoes;

import java.util.List;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nome;

    private String  dificuldade;

    // @OneToMany - Um missão pode precisar de muitos ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;
}
