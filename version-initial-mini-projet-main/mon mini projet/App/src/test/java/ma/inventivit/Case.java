package ma.inventivit;

import javax.persistence.*;

// il faut se connecter à la base de donnée pour rajputer des données persistantes

@Entity
@Table(name = "cases")

public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int caseId;

    @Temporal(TemporalType.DATE)
    @Column(name = "Creation_Date")
    private java.sql.Date creationDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "lastUpdate_Date")
    private java.sql.Date lastUpdateDate;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Override
    public String toString() {
        return "Case{" +
                "caseId=" + caseId +
                ", creationDate=" + creationDate +
                ", lastUpdateDate=" + lastUpdateDate +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}