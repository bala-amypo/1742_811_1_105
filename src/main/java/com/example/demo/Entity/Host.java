package .com.example.demo.Entity
import jakarta.persistence.*;

@Entity
@Table(
    name = "Host",
    uniqueConstraints={
        @UniqueConstraint(
            columnNames={"email"}
        )
    }
)
public class Host{
    public Host(){}

    @Id
    @GeneratedValue(strategy=GeneratedType.IDENTITY)
    private Long id;
    private String hostName;
    private String fullname;
    @Column(nullable=false)
    private String email;
    private String department;
    
}
