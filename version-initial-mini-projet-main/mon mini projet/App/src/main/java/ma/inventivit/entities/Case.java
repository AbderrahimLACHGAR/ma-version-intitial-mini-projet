package ma.inventivit.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="cases")
public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int caseId;

    @Temporal(TemporalType.DATE)
    Date creationDate;

    @Temporal(TemporalType.DATE)
    Date lastUpdateDate;

    private String title;
    private String description;


}
