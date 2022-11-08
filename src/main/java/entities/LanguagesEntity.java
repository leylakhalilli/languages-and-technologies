package entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Table(name = "languages")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LanguagesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany  (mappedBy = "languagesEntity", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<TechnologiesEntity> technologiesEntities;

}
