package dev.java10x.CadastroDeNinjas.Missoes;

import java.util.List;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nome;

    private String  dificuldade;

    // @OneToMany - Um missão pode precisar de muitos ninjas
    @OneToMany
    private List<NinjaModel> ninjas;
}
